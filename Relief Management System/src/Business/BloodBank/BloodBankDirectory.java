/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.BloodBank;

import java.util.ArrayList;

/**
 *
 * @author meghanshubhatt
 */
public class BloodBankDirectory {
    private ArrayList<BloodBank> bloodBankList;

    public BloodBankDirectory() {
        bloodBankList = new ArrayList<>();
    }

    public ArrayList<BloodBank> getBloodBankList() {
        return bloodBankList;
    }

    public void setBloodBankList(ArrayList<BloodBank> bloodBankList) {
        this.bloodBankList = bloodBankList;
    }
    
    public BloodBank addBlood() {
        BloodBank blood = new BloodBank();
        bloodBankList.add(blood);
        return blood;
    }
    
    //Removing an Employee from the Directory
    public void removeBlood(BloodBank blood) {
        bloodBankList.remove(blood);
    }
    
    
    
}
