/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Emergency;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author arjun
 */
public class EmergencyAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmergencyAdminJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    UserAccount userAccount;
    public EmergencyAdminJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem ecoSystem, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
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
        btnUserAccountsManage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCreateManageOrganization = new javax.swing.JButton();
        btnEmployeeCreation = new javax.swing.JButton();

        jLabel1.setText("Emergency Admin");

        btnUserAccountsManage.setText("Manage User Accounts");
        btnUserAccountsManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserAccountsManageActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/medical.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/medical.png"))); // NOI18N

        btnCreateManageOrganization.setText("Organization");
        btnCreateManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateManageOrganizationActionPerformed(evt);
            }
        });

        btnEmployeeCreation.setText("Create Employee");
        btnEmployeeCreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeCreationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel1)
                .addContainerGap(319, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jLabel3)
                    .addGap(96, 96, 96)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnUserAccountsManage, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCreateManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnEmployeeCreation, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(71, 71, 71)
                            .addComponent(jLabel2)))
                    .addContainerGap(63, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(402, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnCreateManageOrganization)
                            .addGap(60, 60, 60)
                            .addComponent(btnEmployeeCreation)
                            .addGap(67, 67, 67)
                            .addComponent(btnUserAccountsManage)))
                    .addContainerGap(141, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserAccountsManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserAccountsManageActionPerformed
        // TODO add your handling code here:
//        HospitalManageUserAccounts hospitalManageUserAccounts = new HospitalManageUserAccounts(userProcessContainer, enterprise);
//        userProcessContainer.add("HospitalManageUserAccounts", hospitalManageUserAccounts);
//
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUserAccountsManageActionPerformed

    private void btnCreateManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateManageOrganizationActionPerformed
        // TODO add your handling code here:
//        HospitalManageOrganization hospitalManageOrganization = new HospitalManageOrganization(userProcessContainer, enterprise.getOrganizationDirectory());
//        userProcessContainer.add("hospitalManageOrganization", hospitalManageOrganization);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateManageOrganizationActionPerformed

    private void btnEmployeeCreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeCreationActionPerformed
        // TODO add your handling code here:
//        HospitalCreateEmployee hospitalCreateEmployee = new HospitalCreateEmployee(userProcessContainer, enterprise.getOrganizationDirectory());
//        userProcessContainer.add("hospitalCreateEmployee", hospitalCreateEmployee);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnEmployeeCreationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateManageOrganization;
    private javax.swing.JButton btnEmployeeCreation;
    private javax.swing.JButton btnUserAccountsManage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}