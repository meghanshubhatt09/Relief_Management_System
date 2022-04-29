/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.FireDepartmentAdmin;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author arjun
 */
public class FireDepartmentOrganization extends Organization{

    public FireDepartmentOrganization(String name) {
        super(name);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new FireDepartmentAdmin() );
        return roles;
     
            }
     @Override
     public Type getType() {
        return Organization.Type.FireDepartmentOrganization;
    } 
    
}
