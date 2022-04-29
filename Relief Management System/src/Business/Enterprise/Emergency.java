/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.FireDepartmentAdmin;
import Business.Role.PoliceAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author arjun
 */
public class Emergency extends Enterprise{
    public Emergency(String name) {
        super(name, EnterpriseType.Emergency);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new PoliceAdminRole());
        roles.add(new FireDepartmentAdmin());
         return roles;
    }
    
}
