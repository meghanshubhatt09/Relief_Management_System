/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author meghanshubhatt
 */
public class FoodOrganization extends Organization {

    public FoodOrganization() {
        super(Organization.Type.FoodOrganization.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        return null;
    }
    
}
