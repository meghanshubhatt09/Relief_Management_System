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
    
    private String docName;
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
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDoctorId() {
        return doctorId;
    } 
    
    @Override
    public String toString(){
        return docName;
    }
    
}
