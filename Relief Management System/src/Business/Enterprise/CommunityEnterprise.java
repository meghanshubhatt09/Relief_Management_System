/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author meghanshubhatt
 */
public class CommunityEnterprise extends Enterprise{

    public CommunityEnterprise(String name) {
        super(name, EnterpriseType.Community);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        return null;
    }
    
}
