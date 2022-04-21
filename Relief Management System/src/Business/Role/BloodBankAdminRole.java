/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BloodOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Hospital.BloodBank.BloodBankWorkAreaJPanel;
import ui.Hospital.HospitalAdminWorkAreaJPanel;
/**
 *
 * @author meghanshubhatt
 */
public class BloodBankAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel UserContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
       return new BloodBankWorkAreaJPanel(UserContainer,userAccount,(BloodOrganization) organization,enterprise,system); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
