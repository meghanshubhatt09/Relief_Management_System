/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.FoodAndShelter;

import Buisness.FoodAndShelterDistributor.Food;
import Buisness.FoodAndShelterDistributor.FoodDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.xml.validation.Validator;

/**
 *
 * @author rk
 */
public class CreateFoodJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateFoodJPanel
     */
    JPanel userProcessContainer;
   Enterprise enterprise;
   EcoSystem ecoSystem;
   UserAccount userAccount;
   OrganizationDirectory organizationDirectory;
    public CreateFoodJPanel(JPanel userProcessContainer,
   Enterprise enterprise,
   EcoSystem ecoSystem,
   UserAccount userAccount,
   OrganizationDirectory organizationDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organizationDirectory = organizationDirectory;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        
       populateFoodTable();
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
        txtFoodType = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFoodPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFood = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Food Panel");

        txtFoodType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoodTypeActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(102, 217, 255));
        jLabel2.setText("Food Type :");

        txtFoodPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFoodPriceKeyPressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(102, 217, 255));
        jLabel4.setText("Food Price in Dollars:");

        tblFood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Food Type", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFood);

        btnBack.setBackground(new java.awt.Color(102, 217, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(102, 217, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFoodType, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(txtFoodPrice)))))
                .addGap(302, 302, 302))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFoodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addComponent(btnCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFoodTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoodTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoodTypeActionPerformed

    private void txtFoodPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFoodPriceKeyPressed
        // TODO add your handling code here:
        //Validator.onlyInteger(evt, txtFoodPrice);
    }//GEN-LAST:event_txtFoodPriceKeyPressed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        FoodDirectory fd = new FoodDirectory();
        if(!txtFoodType.getText().equals("")){
            Food food = ecoSystem.getFoodDirectory().addFoodType();
            food.setFoodType(txtFoodType.getText());
            food.setPrice(Integer.parseInt(txtFoodPrice.getText()));
            populateFoodTable();
//            NGOWorkRequest nGOWorkRequest = new NGOWorkRequest();
//            nGOWorkRequest.setDoctor(doctor);
//            txtDoctorType.setText("");
//            txtNumDoctor.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnCreateActionPerformed
 private void populateFoodTable() {
       DefaultTableModel table= (DefaultTableModel) tblFood.getModel();
       table.setRowCount(0);
      for (Food food : ecoSystem.getFoodDirectory().getFoodList()) {
//            
           Object[] row = new Object[3];
           row[0]= food.getFoodId();
           row[1]= food.getFoodType();
           row[2]=food.getPrice();
           table.addRow(row);
    }  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFood;
    private javax.swing.JTextField txtFoodPrice;
    private javax.swing.JTextField txtFoodType;
    // End of variables declaration//GEN-END:variables
}
