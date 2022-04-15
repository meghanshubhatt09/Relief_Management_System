/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import Business.Network.NetworkDirectory;
/**
 *
 * @author meghanshubhatt
 */

        
public class EcoSystem {
    
    private static EcoSystem business;
    private NetworkDirectory networkDirectory;
    
    
       public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }
       
     private EcoSystem() {
        networkDirectory = new NetworkDirectory();
    }

    public NetworkDirectory getNetworkDirectory() {
        return networkDirectory;
    }

    
}
