/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.BloodBankAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author meghanshubhatt
 */
public class BloodOrganization extends Organization{

    public BloodOrganization() {
        super(Organization.Type.BloodOrganization.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new BloodBankAdminRole());
        return roles;
    }
    
}
