/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.GoogleMaps;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Location.EventWaypoint;
import Business.Location.LocationPoint;
import Business.Location.MyWaypoint;
import Business.Location.WaypointRender;
import Business.Network.Network;
import Business.Organization.OrganizationDirectory;
import com.sun.tools.javac.Main;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Point;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.VirtualEarthTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.viewer.WaypointPainter;
import ui.AdminPanels.NetworkMangWAJPanel;
import ui.Hospital.HospitalManageOrganization;
import ui.NGO.SetupNGOInfoJPanel;
import ui.ServiceProvider.SPManageOrganization;

/**
 *
 * @author rk
 */
public class OrganizationMapJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrganizationMapJPanel
     */
    private final Set<MyWaypoint> waypoints = new HashSet<>();
    private EventWaypoint event;
    private final JPanel userProcessContainer;
    private final Enterprise enterprise;
     private final EcoSystem ecoSystem;
    LocationPoint locationPoint;
    private double x;
    private double y;
    
    
    
    

    public OrganizationMapJPanel( JPanel userProcessContainer,EcoSystem ecoSystem,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
         this.ecoSystem = ecoSystem;
        locationPoint = new LocationPoint();
        map();
        //init();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXMapViewer = new org.jxmapviewer.JXMapViewer();
        comboMapType = new javax.swing.JComboBox<>();
        cmdAdd = new javax.swing.JButton();

        jXMapViewer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jXMapViewerMousePressed(evt);
            }
        });

        comboMapType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Open Stree", "Virtual Earth", "Hybrid", "Satellite" }));
        comboMapType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMapTypeActionPerformed(evt);
            }
        });

        cmdAdd.setText("Set Location");
        cmdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXMapViewerLayout = new javax.swing.GroupLayout(jXMapViewer);
        jXMapViewer.setLayout(jXMapViewerLayout);
        jXMapViewerLayout.setHorizontalGroup(
            jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXMapViewerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
                .addComponent(comboMapType, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jXMapViewerLayout.setVerticalGroup(
            jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXMapViewerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMapType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdAdd))
                .addContainerGap(517, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jXMapViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jXMapViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboMapTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMapTypeActionPerformed
        TileFactoryInfo info;
        int index = comboMapType.getSelectedIndex();
        if (index == 0) {
            info = new OSMTileFactoryInfo();
        } else if (index == 1) {
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.MAP);
        } else if (index == 2) {
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.HYBRID);
        } else {
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.SATELLITE);
        }
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        jXMapViewer.setTileFactory(tileFactory);
    }//GEN-LAST:event_comboMapTypeActionPerformed

    
    private void cmdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddActionPerformed

        try{
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        if (userProcessContainer.getComponent(componentArray.length - 1) instanceof SPManageOrganization) {
            SPManageOrganization orgManagement = (SPManageOrganization) userProcessContainer.getComponent(componentArray.length - 1);
            orgManagement.populateLongituteLatitude(locationPoint);
        } 
        else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof NetworkMangWAJPanel) {
            NetworkMangWAJPanel orgManagement = (NetworkMangWAJPanel) userProcessContainer.getComponent(componentArray.length - 1);
            orgManagement.populateLongituteLatitude(locationPoint);
        } 
           else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof HospitalManageOrganization) {
            HospitalManageOrganization orgManagement = (HospitalManageOrganization) userProcessContainer.getComponent(componentArray.length - 1);
            orgManagement.populateLongituteLatitude(locationPoint);
        } 
            else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof SetupNGOInfoJPanel) {
            SetupNGOInfoJPanel orgManagement = (SetupNGOInfoJPanel) userProcessContainer.getComponent(componentArray.length - 1);
            orgManagement.populateLongituteLatitude(locationPoint);
        } 
        
        else {
            System.out.println("ELSE LOCATION " + componentArray.length);
            System.out.println("ELSE CONTAINER " + userProcessContainer.toString());
        }

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Set Position first");
        }


    }//GEN-LAST:event_cmdAddActionPerformed

        private void addWaypoint(MyWaypoint waypoint) {
        for (MyWaypoint d : waypoints) {
            jXMapViewer.remove(d.getButton());
        }
        waypoints.add(waypoint);
        initWaypoint();
    }

    private void initWaypoint() {
        WaypointPainter<MyWaypoint> wp = new WaypointRender();
        wp.setWaypoints(waypoints);
        jXMapViewer.setOverlayPainter(wp);
        for (MyWaypoint d : waypoints) {
            jXMapViewer.add(d.getButton());
        }
    }
    private void jXMapViewerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXMapViewerMousePressed
        // TODO add your handling code here:
        //Point p = new Point();
        //x.setLocation();
        
        
                        Point p = evt.getPoint();
                GeoPosition geo = jXMapViewer.convertPointToGeoPosition(p);
                //System.out.println("X:"+geo.getLattitude()+",Y:"+geo.getLongitude());
                
                //organizationDirectory.getOrganizationList().
                
                locationPoint.setLatitude(geo.getLatitude());
                locationPoint.setLongitude(geo.getLongitude());
                //ecoSystem.setLocationPoint(locationPoint);
            
        
        addWaypoint(new MyWaypoint("Test 001", event, new GeoPosition(geo.getLatitude(),geo.getLongitude())));
        System.out.println("location"+" "+jXMapViewer.getAddressLocation().getLatitude());
        //jXMapViewer.getLocation().getX()
        System.out.println("location X"+" "+geo.getLatitude());
        System.out.println("location Y"+" "+geo.getLongitude());
    }//GEN-LAST:event_jXMapViewerMousePressed

    
    private void map(){
                Network network = null;
        for(Network n:ecoSystem.getNetworkList())
        {
            for(Enterprise e:n.getEnterpriseDirectory().getEnterpriseList())
            {
                if (enterprise.equals(e)){
                    network = n;
                    x = network.getLocationPoint().getLatitude();
                    y = network.getLocationPoint().getLongitude();
                    break;
                }
            }
            
        }
        
        init();
        
        System.out.println("Network Name "+network);
        System.out.println("Network Name "+network.getLocationPoint());
    }
  private void init() {
        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        jXMapViewer.setTileFactory(tileFactory);
        GeoPosition geo = new GeoPosition(x,y);
        jXMapViewer.setAddressLocation(geo);
        //jXMapViewer.setLocation(WIDTH, WIDTH);
        jXMapViewer.setZoom(5);
        

        //  Create event mouse move
        MouseInputListener mm = new PanMouseInputListener(jXMapViewer);
        //jXMapViewer.addMouseListener(mm);
        jXMapViewer.addMouseListener(mm);
        jXMapViewer.addMouseMotionListener(mm);
        jXMapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCenter(jXMapViewer));
        event = getEvent();
    }
  private EventWaypoint getEvent() {
        return (MyWaypoint waypoint) -> {
            JOptionPane.showMessageDialog(OrganizationMapJPanel.this, waypoint.getName());
        };
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAdd;
    private javax.swing.JComboBox<String> comboMapType;
    private org.jxmapviewer.JXMapViewer jXMapViewer;
    // End of variables declaration//GEN-END:variables
}