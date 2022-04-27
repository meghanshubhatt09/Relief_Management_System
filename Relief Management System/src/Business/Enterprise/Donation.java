/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.DonationAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author meghanshubhatt
 */
public class Donation extends Enterprise{

    public Donation(String name) {
        super(name, EnterpriseType.Donation);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new DonationAdminRole());
        return roles;
    }
    
}
