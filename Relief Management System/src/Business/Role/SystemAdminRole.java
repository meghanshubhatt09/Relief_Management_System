/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;


import Business.EcoSystem;
import Business.Organization.Organization;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import ui.AdminPanels.SystemAdminWorkAreaJPanel;
/**
 *
 * @author meghanshubhatt
 */
public class SystemAdminRole  extends Role{
    
//        public SystemAdminRole(){
//        this.type = RoleType.SystemAdmin;
//    }


    @Override

    public JPanel createWorkArea(JPanel UserContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        return new SystemAdminWorkAreaJPanel(UserContainer,ecoSystem);
    }
        

    
}
