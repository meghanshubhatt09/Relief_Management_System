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
        private ArrayList<Doctor> doctorTypeList;
        
          
     public DoctorDirectory(){
         System.out.println("Inside Doctor Directory");
        doctorTypeList= new ArrayList<>();
                
    }

    public ArrayList<Doctor> getDoctorList() {
        return this.doctorTypeList;
        
    }

    public void setDoctorList(ArrayList<Doctor> doctorTypeList) {
        this.doctorTypeList = doctorTypeList;
    }
  
     
    public Doctor addDoctor() {
        Doctor doctor = new Doctor();
        doctorTypeList.add(doctor);
        return doctor;
    }
    
    //Removing an Employee from the Directory
    public void removeDoctor(Doctor doctor) {
        doctorTypeList.remove(doctor);
    }
    
}
