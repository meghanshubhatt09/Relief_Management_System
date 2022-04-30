/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author arjun
 */
public class CommunityPoliceRequest extends WorkRequest{
    private int noPeopleAffected;
    private String location;
    private boolean add;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPoliceCount() {
        return policeCount;
    }

    public void setPoliceCount(int policeCount) {
        this.policeCount = policeCount;
    }
//    private String requestedDate;
//    private String requestedTime;
    private String purpose;
    private String policeType;
    private int policeCount;

    public int getNoPeopleAffected() {
        return noPeopleAffected;
    }

    public void setNoPeopleAffected(int noPeopleAffected) {
        this.noPeopleAffected = noPeopleAffected;
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

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPoliceType() {
        return policeType;
    }

    public void setPoliceType(String policeType) {
        this.policeType = policeType;
    }

//    public String getPoliceCount() {
//        return policeCount;
//    }
//
//    public void setPoliceCount(String policeCount) {
//        this.policeCount = policeCount;
//    }
}
