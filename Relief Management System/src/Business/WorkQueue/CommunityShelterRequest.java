/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author rk
 */
public class CommunityShelterRequest extends WorkRequest {
    
    private int reqId;
    private String shelterName;
    private int capacityRequired;
    
    private static int counter = 1;

    public CommunityShelterRequest() {
        this.reqId = counter++;
    }

    public int getReqId() {
        return reqId;
    }

    public void setReqId(int reqId) {
        this.reqId = reqId;
    }

    public String getShelterName() {
        return shelterName;
    }

    public void setShelterName(String shelterName) {
        this.shelterName = shelterName;
    }

    public int getCapacityRequired() {
        return capacityRequired;
    }

    public void setCapacityRequired(int capacityRequired) {
        this.capacityRequired = capacityRequired;
    }
    
    
    
    
    
}
