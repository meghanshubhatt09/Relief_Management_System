/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.HashSet;
import Business.Employee.Employee;
import Business.Location.LocationPoint;
/**
 *
 * @author meghanshubhatt
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private Employee employee;
    private Role role;
    private LocationPoint locationPoint;
    private double nearestLocationPoint;
    private Type type;

    public LocationPoint getLocationPoint() {
        return locationPoint;
    }

    public void setLocationPoint(LocationPoint locationPoint) {
        this.locationPoint = locationPoint;
    }

    public double getNearestLocationPoint() {
        return nearestLocationPoint;
    }

    public void setNearestLocationPoint(double nearestLocationPoint) {
        this.nearestLocationPoint = nearestLocationPoint;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    

    public Role getRole() {
        return role;
    }

    public Employee getEmployee() {
        return employee;
    }
    private static int counter=0;
    public HashSet<Role> roles;
    
    
    public enum Type{
        NGOOrganization("NGO Organization"),
        DonationOrganization("Donation Organization"),
        BloodOrganization("Blood Organization"),
        ClinicOrganization("Clinic Organization"),
        FoodOrganization("Food Organization"),
        ShelterOrganization("Shelter Organization"),
        EmergencyRequestOrganization("Emergency Request Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        roles = new HashSet<>();
        ++counter;
    }

    public abstract HashSet<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
