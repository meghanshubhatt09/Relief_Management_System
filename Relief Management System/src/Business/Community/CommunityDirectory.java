/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Community;

import java.util.ArrayList;
import Business.Community.Community;

/**
 *
 * @author arjun
 */
public class CommunityDirectory {
    private ArrayList<Community> communityList;
    public CommunityDirectory(){
        communityList = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    
    
    public Community addCommunity(){
        Community community = new Community();
        communityList.add(community);
        return community;
    }
    
    public void removeCommunity(Community community){
        communityList.remove(community);
    }
    
}
