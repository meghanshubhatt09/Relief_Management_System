/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Doctor;

import Business.Organization.ClinicOrganization;

/**
 *
 * @author meghanshubhatt
 */
public class Doctor {
    
    private String doctorType;
    private String doctorId;
    private static int docCount;
    private int quantity;
 public Doctor(){
        doctorId= "DOC"+(++docCount);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    
    public String getDocName() {
        return doctorType;
    }

    public void setDocName(String doctorType) {
        this.doctorType = doctorType;
    }

    public String getDoctorId() {
        return doctorId;
    } 
    
    @Override
    public String toString(){
        return doctorType;
    }
    
}
