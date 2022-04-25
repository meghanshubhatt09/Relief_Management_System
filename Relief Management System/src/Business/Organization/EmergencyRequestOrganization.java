/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.EmergencyRequestAdminRole;
import Business.Role.FoodAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author meghanshubhatt
 */
public class EmergencyRequestOrganization extends Organization {

    public EmergencyRequestOrganization() {
        super(Organization.Type.EmergencyRequestOrganization.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new EmergencyRequestAdminRole());
        return roles;
    }
    
}
