/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FireDepartment;

//import Business.PoliceStation.PoliceStation;
import java.util.ArrayList;

/**
 *
 * @author arjun
 */
public class FireDepartmentDirectory {
    private ArrayList<FireDepartment> fireDepartmentList;
     
     public FireDepartmentDirectory(){
     fireDepartmentList = new ArrayList<FireDepartment>();
     }

    public ArrayList<FireDepartment> getFireDepartmentList() {
        return fireDepartmentList;
    }

    public void setFireDepartmentList(ArrayList<FireDepartment> fireDepartmentList) {
        this.fireDepartmentList = fireDepartmentList;
    }
    
    public FireDepartment addFireDepartment() {
        FireDepartment fire = new FireDepartment();
        fireDepartmentList.add(fire);
        return fire;
    }
    
     public void removeFireDepartment(FireDepartment fire) {
        fireDepartmentList.remove(fire);
    }
}
