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
import ui.Doctor.DoctorWorkAreaJPanel;

//import userinterface.Hospital.Clinic.Pharmacy.DoctorJPanel;

/**
 *
 * @author meghanshubhatt
 */
public class DoctorAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel UserContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new DoctorWorkAreaJPanel(UserContainer,userAccount,organization,enterprise,system);
    }
    
}
