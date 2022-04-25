/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Doctor;

import Business.Doctor.Doctor;
import java.util.ArrayList;

/**
 *
 * @author meghanshubhatt
 */
public class DoctorDirectory {
        private ArrayList<Doctor> doctorList;
        
          
     public DoctorDirectory(){
         System.out.println("Inside Doctor Directory");
        doctorList= new ArrayList<>();
                
    }

    public ArrayList<Doctor> getDoctorList() {
        return this.doctorList;
        
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
  
     
    public Doctor addDoctor() {
        Doctor doctor = new Doctor();
        doctorList.add(doctor);
        return doctor;
    }
    
    //Removing an Employee from the Directory
    public void removeDoctor(Doctor doctor) {
        doctorList.remove(doctor);
    }
    
}
