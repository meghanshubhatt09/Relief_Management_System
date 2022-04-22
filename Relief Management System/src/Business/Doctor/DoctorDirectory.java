/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Doctor;

import java.util.ArrayList;

/**
 *
 * @author meghanshubhatt
 */
public class DoctorDirectory {
    private ArrayList<Doctor> doctorList;

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
     public DoctorDirectory(){
        doctorList= new ArrayList<>();
                
    }
     
    public Doctor addDoctor() {
        Doctor doctor = new Doctor();
        doctorList.add(doctor);
        return doctor;
    }
    
 
    public void removeDoctor(Doctor doctor) {
        doctorList.remove(doctor);
    }
    
}
