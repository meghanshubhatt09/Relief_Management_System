/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author arjun
 */
public class CommunityFoodRequest extends WorkRequest{
    private int noPeopleRequestingFood;
    private String location;
    private String purpose;
    private String requestedFoodType;

    public int getNoPeopleRequestingFood() {
        return noPeopleRequestingFood;
    }

    public void setNoPeopleRequestingFood(int noPeopleRequestingFood) {
        this.noPeopleRequestingFood = noPeopleRequestingFood;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getRequestedFoodType() {
        return requestedFoodType;
    }

    public void setRequestedFoodType(String requestedFoodType) {
        this.requestedFoodType = requestedFoodType;
    }
    
}
