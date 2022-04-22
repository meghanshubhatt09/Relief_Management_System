/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Hospital.Clinic.ClinicAdminWorkAreaJPanel;

/**
 *
 * @author meghanshubhatt
 */
public class ClinicAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel UserContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new ClinicAdminWorkAreaJPanel(UserContainer,userAccount,(ClinicOrganization) organization,enterprise,system);
    }
    
}
