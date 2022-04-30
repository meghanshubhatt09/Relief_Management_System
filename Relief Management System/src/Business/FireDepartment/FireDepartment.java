/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FireDepartment;

/**
 *
 * @author arjun
 */
public class FireDepartment {
    private String fireDepartmentType;
    private int unitCount;

    public String getFireDepartmentType() {
        return fireDepartmentType;
    }

    public void setFireDepartmentType(String fireDepartmentType) {
        this.fireDepartmentType = fireDepartmentType;
    }

    public int getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(int unitCount) {
        this.unitCount = unitCount;
    }
    
    public String toString() {
        return fireDepartmentType;
    }
}
