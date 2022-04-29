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
import ui.Emergency.EmergencyAdminJPanel;

/**
 *
 * @author rk
 */
public class EmergencyAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel UserContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
    
        return new EmergencyAdminJPanel(UserContainer,enterprise,system,userAccount);

//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
