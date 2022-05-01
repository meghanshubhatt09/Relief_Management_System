/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Hospital.BloodBank;

import Business.BloodBank.BloodBank;
import Business.BloodBank.BloodBankDirectory;
import Business.Doctor.Doctor;
import Business.Doctor.DoctorDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.Utils.HeaderColors;
import Business.WorkQueue.CommunityBloodRequest;
import Business.WorkQueue.CommunityDonationRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author meghanshubhatt
 */
public class BloodBankManageBloodTypeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodBankManageBloodTypeJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    
    public BloodBankManageBloodTypeJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory,Enterprise enterprise,UserAccount userAccount,EcoSystem ecoSystem) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        tblBloodBank.getTableHeader().setDefaultRenderer(new HeaderColors());
        bloodDonationAdd();
        populateBloodTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnDeleteDoctor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBloodBank = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtBloodGroupType = new javax.swing.JTextField();
        btnAddDoctor = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Manage Blood Type");

        btnBack.setBackground(new java.awt.Color(102, 217, 255));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDeleteDoctor.setBackground(new java.awt.Color(255, 153, 153));
        btnDeleteDoctor.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDeleteDoctor.setText("Delete Record");
        btnDeleteDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDoctorActionPerformed(evt);
            }
        });

        tblBloodBank.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Blood Type", "No. of Packets "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBloodBank);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Blood Type :");

        txtBloodGroupType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBloodGroupType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodGroupTypeActionPerformed(evt);
            }
        });

        btnAddDoctor.setBackground(new java.awt.Color(102, 217, 255));
        btnAddDoctor.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnAddDoctor.setText("Add");
        btnAddDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDoctorActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/administratorBig.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddDoctor)
                                    .addComponent(txtBloodGroupType, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(195, 195, 195)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(btnDeleteDoctor))))))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteDoctor)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtBloodGroupType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddDoctor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDoctorActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblBloodBank.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the doctor details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            BloodBank p=(BloodBank) tblBloodBank.getValueAt(selectedRow, 0);
            
            ecoSystem.getBloodDirectory().removeBlood(p);
            JOptionPane.showMessageDialog(null, "You have successfully deleted the doctor details");
            populateBloodTable();
        }
    }//GEN-LAST:event_btnDeleteDoctorActionPerformed

    private void txtBloodGroupTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodGroupTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodGroupTypeActionPerformed

    private void btnAddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDoctorActionPerformed
        // TODO add your handling code here:
        BloodBankDirectory bankDirectory = new BloodBankDirectory();
        if(!txtBloodGroupType.getText().equals("")){
            BloodBank bloodBank = ecoSystem.getBloodDirectory().addBlood();
            bloodBank.setBloodGroupType(txtBloodGroupType.getText());
            bloodBank.setBloodPackets(0);
            
            populateBloodTable();
            
            CommunityBloodRequest communityBloodRequest = new CommunityBloodRequest();
            communityBloodRequest.setBloodType(bloodBank);
            
            CommunityDonationRequest communityDonationRequest = new CommunityDonationRequest();
            communityDonationRequest.setBloodType(bloodBank);
            
            txtBloodGroupType.setText("");
            bloodDonationAdd();

        }else{
            JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAddDoctorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDoctor;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteDoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBloodBank;
    private javax.swing.JTextField txtBloodGroupType;
    // End of variables declaration//GEN-END:variables

    private void populateBloodTable() {
     DefaultTableModel table= (DefaultTableModel) tblBloodBank.getModel();
     table.setRowCount(0);
      for (BloodBank bloodBank : ecoSystem.getBloodDirectory().getBloodBankList()) {
            
           Object[] row = new Object[2];
           row[0]= bloodBank;
           row[1]=bloodBank.getBloodPackets();
           table.addRow(row);
    }  
    }
    
    
    private void bloodDonationAdd(){
        
         for (WorkRequest work : ecoSystem.getWorkQueue().getWorkRequestList())
             for (BloodBank bloodBank : ecoSystem.getBloodDirectory().getBloodBankList()){
               
             if (work instanceof CommunityDonationRequest)
//                     System.out.println(((CommunityDonationRequest) work).getNoBloodPacketsRequired()
//                     );
             {
     
            
                   
                    if (work.getStatus().equalsIgnoreCase("Requested"))
                    {
                        System.out.println("BLOOD BANK"+work);
                        if (((CommunityDonationRequest) work).getRequestedBloodType().equals(bloodBank.getBloodGroupType()) )
                           {
                               System.out.println("ui.Hospital.BloodBank.BloodBankManageBloodTypeJPanel.bloodDonationAdd()"+bloodBank.getBloodGroupType());
                              
                               
                            bloodBank.setBloodPackets(bloodBank.getBloodPackets() + ((CommunityDonationRequest) work).getNoBloodPacketsRequired());
                            work.setStatus("Approved");
                            work.setReceiver(userAccount);
                            Date resolveDate = new Date();
                            work.setResolveDate(resolveDate);

                           }
                    }
                 
                 
             }
             
         
             }
         populateBloodTable();
         
    
    }
    
    
}
