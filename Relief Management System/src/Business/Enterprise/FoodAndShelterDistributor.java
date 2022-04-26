/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.FSAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author rk
 */
public class FoodAndShelterDistributor extends Enterprise {

    public FoodAndShelterDistributor(String name) {
        super(name, EnterpriseType.FSDistributor);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new FSAdminRole());

        return roles;
    }

}
