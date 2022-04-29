/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Emergency.FireDepartmentAdminWorkAreaJPanel;

/**
 *
 * @author arjun
 */
public class FireDepartmentAdmin extends Role{

    @Override
    public JPanel createWorkArea(JPanel UserContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
        return new FireDepartmentAdminWorkAreaJPanel(UserContainer, userAccount, organization, enterprise, system);
    
    }
    
}
