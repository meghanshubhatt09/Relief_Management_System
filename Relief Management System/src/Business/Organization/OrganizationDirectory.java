/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Location.LocationPoint;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author meghanshubhatt
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    
    public Organization createOrganization(Type type, String name, LocationPoint locationPoint ){
        Organization organization = null;
        if (type.getValue().equals(Type.NGOOrganization.getValue())){
            organization = new NGOOrganization(name);
            organization.setLocationPoint(locationPoint);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DonationOrganization.getValue())){
            organization = new DonationOrganization(name);
            organization.setLocationPoint(locationPoint);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ClinicOrganization.getValue())){
            organization = new ClinicOrganization(name);
             organization.setLocationPoint(locationPoint);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.BloodOrganization.getValue())){
            organization = new BloodOrganization(name);
             organization.setLocationPoint(locationPoint);
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.FoodOrganization.getValue())){
            organization = new FoodOrganization(name);
            organization.setLocationPoint(locationPoint);
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.ShelterOrganization.getValue())){
            organization = new ShelterOrganization(name);
            organization.setLocationPoint(locationPoint);
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.EmergencyRequestOrganization.getValue())){
            organization = new EmergencyRequestOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.FireDepartmentOrganization.getValue())){
            organization = new FireDepartmentOrganization(name);
            organizationList.add(organization);
        
        } else if (type.getValue().equals(Type.PoliceOrganization.getValue())){
            organization = new PoliceOrganization(name);
            organizationList.add(organization);
        }
           else if (type.getValue().equals(Type.FSOrganization.getValue())){
            organization = new FSOrganization(name);
            organization.setLocationPoint(locationPoint);
            organizationList.add(organization);
        }

        
        return organization;
    }
}
