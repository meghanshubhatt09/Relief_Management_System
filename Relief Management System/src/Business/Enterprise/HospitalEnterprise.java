/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.BloodBankAdminRole;
import Business.Role.ClinicAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author meghanshubhatt
 */
public class HospitalEnterprise  extends Enterprise{

    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.Hospital);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
         roles.add(new ClinicAdminRole());
         roles.add(new BloodBankAdminRole());
         return roles;
    }
    
}
