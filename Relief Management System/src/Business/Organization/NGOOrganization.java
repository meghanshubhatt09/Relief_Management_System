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
public class NGOOrganization extends Organization{

    public NGOOrganization() {
        super(Type.NGOOrganization.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
