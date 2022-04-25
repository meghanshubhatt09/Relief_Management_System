/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.FoodAdminRole;
import Business.Role.Role;
import Business.Role.ServiceProviderAdminRole;
import Business.Role.ShelterAdminRole;
import java.util.HashSet;

/**
 *
 * @author meghanshubhatt
 */
public class ServiceProviderEnterprise extends Enterprise{

    public ServiceProviderEnterprise(String name) {
        super(name, EnterpriseType.ServiceProvider);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
         roles.add(new FoodAdminRole());
         roles.add(new ShelterAdminRole());
         roles.add(new ServiceProviderAdminRole());
         return roles;
    }


    
}
