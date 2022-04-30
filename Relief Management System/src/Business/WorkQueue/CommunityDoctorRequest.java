/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author meghanshubhatt
 */
public class CommunityDoctorRequest extends WorkRequest{
    
    private int noDoctorRequired;
    private int noPeopleAffected;

    public int getNoPeopleAffected() {
        return noPeopleAffected;
    }

    public void setNoPeopleAffected(int noPeopleAffected) {
        this.noPeopleAffected = noPeopleAffected;
    }
    private String location;
    private boolean add;
    private String requestedDate;
    private String requestedTime;
    private String purpose;
    private String doctorType;
    private String zip;

    public String getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(String doctorType) {
        this.doctorType = doctorType;
    }
    
    public CommunityDoctorRequest(){
        add = false;
    }

    public int getNoDoctorRequired() {
        return noDoctorRequired;
    }

    public void setNoDoctorRequired(int noDoctorRequired) {
        this.noDoctorRequired = noDoctorRequired;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public String getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(String requestedDate) {
        this.requestedDate = requestedDate;
    }

    public String getRequestedTime() {
        return requestedTime;
    }

    public void setRequestedTime(String requestedTime) {
        this.requestedTime = requestedTime;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    
    
    
}
