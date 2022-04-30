/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PoliceStation;

import Business.BloodBank.BloodBank;
import java.util.ArrayList;

/**
 *
 * @author arjun
 */
public class PoliceStationDirectory {
     private ArrayList<PoliceStation> policeStationList;
     
     public PoliceStationDirectory(){
     policeStationList = new ArrayList<PoliceStation>();
     }

    public ArrayList<PoliceStation> getPoliceStationList() {
        return policeStationList;
    }

    public void setPoliceStationList(ArrayList<PoliceStation> policeStationList) {
        this.policeStationList = policeStationList;
    }
    
    public PoliceStation addPolice() {
        PoliceStation police = new PoliceStation();
        policeStationList.add(police);
        return police;
    }
    
     public void removePolice(PoliceStation police) {
        policeStationList.remove(police);
    }
    
}
