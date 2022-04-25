/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

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
import Business.Role.HospitalAdminRole;

/**
 *
 * @author meghanshubhatt
 */
public class EcoSystem extends Organization {

    private static EcoSystem ecosystem;
    private ArrayList<Network> networkList;

    private CommunityDirectory communityList;
  
    private DoctorDirectory doctorList;

    public DoctorDirectory getDoctorList() {
        System.out.println("Inside Get Doctor List");
        System.out.println(doctorList);
        return doctorList;
    }

    public void setDoctorList(DoctorDirectory doctorList) {
        this.doctorList = doctorList;
    }

    public static EcoSystem getInstance() {
        if (ecosystem == null) {
            ecosystem = new EcoSystem();
        }
        return ecosystem;
    }

    private EcoSystem() {
        super(null);
        System.out.println("Inside System Directory");
        networkList = new ArrayList<>();
        this.doctorList = new DoctorDirectory();
        communityList = new CommunityDirectory();
    }

    public CommunityDirectory getCommunityList() {
        return communityList;
    }

    public void setCommunityList(CommunityDirectory communityList) {
        this.communityList = communityList;
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
