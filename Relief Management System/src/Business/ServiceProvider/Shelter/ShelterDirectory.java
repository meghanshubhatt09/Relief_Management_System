/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ServiceProvider.Shelter;

import java.util.ArrayList;

/**
 *
 * @author rk
 */
public class ShelterDirectory {
    
      private ArrayList<Shelter> shelterList;

    public ShelterDirectory() {
        this.shelterList = new ArrayList<>();
    }

    public ArrayList<Shelter> getShelterList() {
        return shelterList;
    }

    public void setShelterList(ArrayList<Shelter> shelterList) {
        this.shelterList = shelterList;
    }
    
       public Shelter addShelter() {
        Shelter shelter = new Shelter();
        shelterList.add(shelter);
        return shelter;
    }
    
    //Removing a FoodType from the Directory
    public void removeFoodType(Shelter shelter) {
        shelterList.remove(shelter);
    }
      
      
    
}
