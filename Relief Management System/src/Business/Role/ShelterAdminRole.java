/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ShelterOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.ServiceProvider.Shelter.ShelterAdminWAJPanel;

/**
 *
 * @author rk
 */
public class ShelterAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel UserContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new ShelterAdminWAJPanel(UserContainer,userAccount,(ShelterOrganization) organization,enterprise,system); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

                }
    
}
