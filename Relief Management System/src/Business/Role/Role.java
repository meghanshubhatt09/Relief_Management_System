/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.Component;

import javax.swing.JPanel;
/**
 *
 * @author meghanshubhatt
 */
public abstract class Role {

    private String name;

    
        public enum RoleType {
        SystemAdmin("System Admin"),
        NGOAdminRole("NGO Admin Role"),
        DoctorAdminRole("Doctor Admin Role"),
        ClinicAdminRole("Clinic Admin Role"),
        BloodBankAdminRole("Blood Bank Admin Role"),
        DonationAdminRole("Donation Admin Role"),
        EmergencyAdminRole("Emergency Admin Role"),
        ServiceProviderAdmin("Service Provider Admin"),
        HospitalAdminRole("Hospital Admin Role");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    public RoleType type;

        public abstract JPanel createWorkArea(JPanel UserContainer, 
            UserAccount userAccount, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem system);


    @Override
    public String toString() {
        return this.getClass().toString();
    }
    
  
    
}
