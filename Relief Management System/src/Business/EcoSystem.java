/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import Business.Network.Network;
import java.util.ArrayList;
/**
 *
 * @author meghanshubhatt
 */
public class EcoSystem {
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    
    
       public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }
       
       
        public ArrayList<Network> getNetworkList() {
        return networkList;
    }
        
        
       public static void setInstance(EcoSystem system) {
        business=system;
    }
       
       public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
}
