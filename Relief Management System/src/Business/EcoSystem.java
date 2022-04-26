/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Buisness.FoodAndShelterDistributor.FoodDirectory;
import Buisness.ServiceProvider.Food.FoodInventory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Community.CommunityDirectory;
import java.util.ArrayList;
import java.util.HashSet;
import Business.Doctor.DoctorDirectory;
import Business.Doctor.Doctor;
import Business.Role.ClinicAdminRole;
import Business.Role.HospitalAdminRole;

/**
 *
 * @author meghanshubhatt
 */
public class EcoSystem extends Organization {

    private static EcoSystem ecosystem;
    private ArrayList<Network> networkList;
    private FoodDirectory foodDirectory;
    private FoodInventory foodInventory;

    public FoodInventory getFoodInventory() {
        return foodInventory;
    }

    public void setFoodInventory(FoodInventory foodInventory) {
        this.foodInventory = foodInventory;
    }
    

    public FoodDirectory getFoodDirectory() {
        return foodDirectory;
    }

    public void setFoodDirectory(FoodDirectory foodDirectory) {
        this.foodDirectory = foodDirectory;
    }
    
    private CommunityDirectory communityList;

    private DoctorDirectory doctorDirectoryList;
    
    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        this.doctorDirectoryList = new DoctorDirectory();
        this.communityList = new CommunityDirectory();
        this.foodDirectory = new FoodDirectory();
        this.foodInventory = new FoodInventory();
    }

      public CommunityDirectory getCommunityList() {
        return communityList;
    }

    public void setCommunityList(CommunityDirectory communityList) {
        this.communityList = communityList;
    }

    public DoctorDirectory getDoctorList() {
        return doctorDirectoryList;
    }

    public void setDoctorList(DoctorDirectory doctorDirectoryList) {
        this.doctorDirectoryList = doctorDirectoryList;
    }

    public static EcoSystem getInstance() {
        if (ecosystem == null) {
            ecosystem = new EcoSystem();
        }
        return ecosystem;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public static void setInstance(EcoSystem system) {
        ecosystem = system;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new SystemAdminRole());
        roles.add(new HospitalAdminRole());
        roles.add(new ClinicAdminRole());
        return roles;
    }

    public static boolean checkIfUsernameIsUnique(String username) {

        //  if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
        for (Network network : ecosystem.getNetworkList()) {

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equals(username)) {
                        return false;
                    }
                }

                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getUsername().equals(username)) {
                            return false;
                        }
                    }
                }
            }
        }

        //  }
        return true;
    }

}
