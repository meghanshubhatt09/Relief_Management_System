/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Network;
import Business.Enterprise.EnterpriseDirectory;
import Business.Location.LocationPoint;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author meghanshubhatt
 */
public class Network {
    private String name;
    private LocationPoint locationPoint;
    private EnterpriseDirectory enterpriseDirectory;

    public Network() {
       
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public LocationPoint getLocationPoint() {
        return locationPoint;
    }

    public void setLocationPoint(LocationPoint locationPoint) {
        this.locationPoint = locationPoint;
    }
    

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
