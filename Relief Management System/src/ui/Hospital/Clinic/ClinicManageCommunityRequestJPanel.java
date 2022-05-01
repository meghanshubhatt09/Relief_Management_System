/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Hospital.Clinic;

import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.Utils.HeaderColors;
import Business.WorkQueue.CommunityDoctorRequest;
import Business.WorkQueue.NGOWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.xml.validation.Validator;

/**
 *
 * @author meghanshubhatt
 */
public class ClinicManageCommunityRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClinicManageCommunityRequestJPanel
     */
    JPanel userProcessContainer;
    OrganizationDirectory organizationDirectory;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    UserAccount userAccount;
    
    
    public ClinicManageCommunityRequestJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory, Enterprise enterprise,EcoSystem ecoSystem,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = organizationDirectory;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        tblAvailableDoctor.getTableHeader().setDefaultRenderer(new HeaderColors());
        tblRequestTableCommunity.getTableHeader().setDefaultRenderer(new HeaderColors());
        
        populateAvailableDoctorTbl();
        populateDoctorType();
        populateRequestTable();
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequestTableCommunity = new javax.swing.JTable();
        btnAssignToMe = new javax.swing.JButton();
        btnDeleteReqHosp = new javax.swing.JButton();
        btnApproveReqHospital = new javax.swing.JButton();
        btnRejectReqHospital = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAvailableDoctor = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbDocType = new javax.swing.JComboBox<>();
        txtNoDoctors = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Hospital Manage Request From Community");

        jLabel2.setBackground(new java.awt.Color(102, 217, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Purpose :");

        jLabel4.setBackground(new java.awt.Color(102, 217, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Request for Doctors");

        tblRequestTableCommunity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No of Doctors required", "No of People Affected", "Date of requirement", "Date of resolution", "Location", "Doctor Type", "Status", "Sender", "Receiver"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequestTableCommunity);

        btnAssignToMe.setBackground(new java.awt.Color(102, 217, 255));
        btnAssignToMe.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnAssignToMe.setText("Assign to me");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        btnDeleteReqHosp.setBackground(new java.awt.Color(255, 153, 153));
        btnDeleteReqHosp.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDeleteReqHosp.setText("Delete Request");
        btnDeleteReqHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteReqHospActionPerformed(evt);
            }
        });

        btnApproveReqHospital.setBackground(new java.awt.Color(102, 217, 255));
        btnApproveReqHospital.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnApproveReqHospital.setText("Approve Request");
        btnApproveReqHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveReqHospitalActionPerformed(evt);
            }
        });

        btnRejectReqHospital.setBackground(new java.awt.Color(255, 153, 153));
        btnRejectReqHospital.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnRejectReqHospital.setText("Reject Request");
        btnRejectReqHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectReqHospitalActionPerformed(evt);
            }
        });

        tblAvailableDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor Type", "No of Doctors"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAvailableDoctor);

        jLabel5.setText("Doctors available at Hospital");

        btnBack.setBackground(new java.awt.Color(102, 217, 255));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(102, 217, 255));
        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("No. of Doctors:");

        btnAdd.setBackground(new java.awt.Color(102, 217, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(102, 217, 255));
        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("Doctor Type:");

        txtNoDoctors.setBackground(new java.awt.Color(204, 204, 204));
        txtNoDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoDoctorsActionPerformed(evt);
            }
        });
        txtNoDoctors.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNoDoctorsKeyPressed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 153, 153));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAssignToMe)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDeleteReqHosp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnApproveReqHospital)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRejectReqHospital))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtNoDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(45, 45, 45)
                                                .addComponent(btnAdd)
                                                .addGap(157, 157, 157))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnDelete))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(cmbDocType, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBack)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRejectReqHospital)
                            .addComponent(btnApproveReqHospital)
                            .addComponent(btnDeleteReqHosp)
                            .addComponent(btnAssignToMe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnDelete))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(cmbDocType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNoDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addContainerGap(112, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblRequestTableCommunity.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to assign the Request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            CommunityDoctorRequest c =  (CommunityDoctorRequest)tblRequestTableCommunity.getValueAt(selectedRow, 6);
            //NGOWorkRequest p=(NGOWorkRequest) tblRequestTableCommunity.getValueAt(selectedRow, 4);

            c.setStatus("Pending");
            c.setReceiver(userAccount);

            populateRequestTable();

        }

    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnDeleteReqHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteReqHospActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblRequestTableCommunity.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            WorkRequest p=(WorkRequest) tblRequestTableCommunity.getValueAt(selectedRow, 6);

            userAccount.getWorkQueue().getWorkRequestList().remove(p);
            ecoSystem.getWorkQueue().getWorkRequestList().remove(p);
            enterprise.getWorkQueue().getWorkRequestList().remove(p);

            JOptionPane.showMessageDialog(null, "You have successfully deleted the request");
            populateRequestTable();
        }
    }//GEN-LAST:event_btnDeleteReqHospActionPerformed

    private void btnApproveReqHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveReqHospitalActionPerformed
        // TODO add your handling code here:

        int selectedRow= tblRequestTableCommunity.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            CommunityDoctorRequest p=(CommunityDoctorRequest) tblRequestTableCommunity.getValueAt(selectedRow, 6);

            int temp=0;
            if(p.getReceiver()!= null){
                if (p.getStatus().equalsIgnoreCase("Pending")) {
                    UserAccount a =p.getSender();
                    if(ecoSystem.getDoctorList().getDoctorList().size()<= 0){
                        JOptionPane.showMessageDialog(null, "No Doctors available.");
                        return;
                    }
                    for (Doctor v : ecoSystem.getDoctorList().getDoctorList()) {
                        if (v.getDocName() == p.getDoctorType()){
                        //if(p.getDocName().equals(v.getDocName())){
                            if(v.getQuantity()- p.getNoDoctorRequired()<0){
                                JOptionPane.showMessageDialog(null, "Not enough Doctors available. Wait for sometime");
                                return;
                            }
                            temp=1;
                            v.setQuantity(v.getQuantity()- p.getNoDoctorRequired());
                            break;
                            //}
                        }   

                    }
                    if(temp==0){
                        JOptionPane.showMessageDialog(null, "No Doctors available");
                        return;
                    }

                    p.setStatus("Approved");
                    Date resolveDate = new Date();
                    p.setResolveDate(resolveDate);
                    JOptionPane.showMessageDialog(null, "You have successfully completed the request");
                    populateAvailableDoctorTbl();
                    populateRequestTable();
                } else if(p.getStatus().equalsIgnoreCase("Rejected")){
                    JOptionPane.showMessageDialog(null, "You cannot approve the rejected request.");

                }else {
                    JOptionPane.showMessageDialog(null, "Cannot Approve the request 2 times.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Please assign first");
            }

        }
    }//GEN-LAST:event_btnApproveReqHospitalActionPerformed

    private void btnRejectReqHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectReqHospitalActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblRequestTableCommunity.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to reject the Request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            CommunityDoctorRequest p=(CommunityDoctorRequest) tblRequestTableCommunity.getValueAt(selectedRow, 6);
            if(p.getStatus().equalsIgnoreCase("Approved")){
                JOptionPane.showMessageDialog(null, "Cannot Reject the Approved request", "Warning", JOptionPane.WARNING_MESSAGE);
            }else if(p.getStatus().equalsIgnoreCase("Rejected")){
                JOptionPane.showMessageDialog(null, "Cannot Reject the request 2 times", "Warning", JOptionPane.WARNING_MESSAGE);
            }else{
                if (p.getStatus().equalsIgnoreCase("Pending")) {
                    p.setStatus("Rejected");
                    p.setReceiver(userAccount);
                    Date resolveDate = new Date();
                    p.setResolveDate(resolveDate);
                }else{
                    JOptionPane.showMessageDialog(null, "Please assign first");
                }
            }
            populateRequestTable();

        }
    }//GEN-LAST:event_btnRejectReqHospitalActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(!txtNoDoctors.getText().equals("")){
            int quant = 0;
            try{
            quant = Integer.parseInt(txtNoDoctors.getText());
            }
            catch(Exception e)
                    {
            JOptionPane.showMessageDialog(null, "Enter a proper value !", "Warning", JOptionPane.WARNING_MESSAGE);            
                    }
            String v =  (String) cmbDocType.getSelectedItem();
            int temp = 0;
            for (Doctor doctor : ecoSystem.getDoctorList().getDoctorList()) {
                if (v.equals(doctor.getDocName())) {
                    temp = 1;
                    doctor.setQuantity(doctor.getQuantity() + quant);
                }
            }

            if (temp == 0) {
                
                JOptionPane.showMessageDialog(null, "Add Doctor Type in Manage Doctor JPanel", "Warning", JOptionPane.WARNING_MESSAGE);


            }
            populateAvailableDoctorTbl();
        }else{
            JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtNoDoctorsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoDoctorsKeyPressed
        // TODO add your handling code here:
        //Validator.onlyInteger(evt, txtNoDoctors);
    }//GEN-LAST:event_txtNoDoctorsKeyPressed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblAvailableDoctor.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the doctor details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            Doctor p= (Doctor) tblAvailableDoctor.getValueAt(selectedRow, 0);

            ecoSystem.getDoctorList().removeDoctor(p);
            JOptionPane.showMessageDialog(null, "You have successfully deleted the doctor details");
            populateAvailableDoctorTbl();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNoDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoDoctorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoDoctorsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnApproveReqHospital;
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteReqHosp;
    private javax.swing.JButton btnRejectReqHospital;
    private javax.swing.JComboBox<String> cmbDocType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAvailableDoctor;
    private javax.swing.JTable tblRequestTableCommunity;
    private javax.swing.JTextField txtNoDoctors;
    // End of variables declaration//GEN-END:variables

    private void populateAvailableDoctorTbl() {
       DefaultTableModel model = (DefaultTableModel) tblAvailableDoctor.getModel();

        model.setRowCount(0);

        for (Doctor doctor : ecoSystem.getDoctorList().getDoctorList()) {

            Object[] row = new Object[2];
            row[0] = doctor;
            row[1] = doctor.getQuantity();
            model.addRow(row);

        }
    }

    private void populateDoctorType() {
        for (Doctor doctor : ecoSystem.getDoctorList().getDoctorList()){
            cmbDocType.addItem(doctor.getDocName());
        }
    }

    private void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblRequestTableCommunity.getModel();
        
        model.setRowCount(0);
        

        for (WorkRequest work : ecoSystem.getWorkQueue().getWorkRequestList()){
           if(work instanceof CommunityDoctorRequest){ 
               
               if(((CommunityDoctorRequest) work).getReceiver()==null || ((CommunityDoctorRequest) work).getReceiver() == userAccount){
                Object[] row = new Object[9];
            row[0] = ((CommunityDoctorRequest) work).getNoDoctorRequired();
            row[2] = ((CommunityDoctorRequest) work).getRequestDate() ;
            row[3] = ((CommunityDoctorRequest) work).getResolveDate() ;
            row[4] = ((CommunityDoctorRequest) work).getLocation();
            row[6] = work;
            row[1] = ((CommunityDoctorRequest) work).getNoPeopleAffected();
            row[5] = ((CommunityDoctorRequest) work).getDoctorType();
            row[7] = ((CommunityDoctorRequest) work).getSender();
            
            if(((CommunityDoctorRequest) work).getReceiver() != null){
            row[8] = ((CommunityDoctorRequest) work).getReceiver();
            }
            model.addRow(row);
               
               }
               
           
           }
        }
    }
}
