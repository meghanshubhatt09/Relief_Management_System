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

    public EmergencyRequestOrganization(String name) {
        super(name);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new EmergencyRequestAdminRole());
        return roles;
    }
    
       @Override
     public Type getType() {
        return Organization.Type.EmergencyRequestOrganization;
    }
    
}
