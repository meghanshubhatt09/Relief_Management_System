/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import java.util.HashSet;
import Business.Role.DoctorAdminRole;

/**
 *
 * @author meghanshubhatt
 */
public class ClinicOrganization extends Organization{

    public ClinicOrganization() {
        super(Organization.Type.ClinicOrganization.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new DoctorAdminRole() );
        return roles;
     
            }
    
}
