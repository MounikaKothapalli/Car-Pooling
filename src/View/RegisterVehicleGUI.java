package View;

import Controller.Database_Queries;

import Model.Members;

import Model.Vehicle;

import java.util.ArrayList;

import javax.swing.JOptionPane;


/**
 *
 * @author mounikakothapalli
 */

public class RegisterVehicleGUI extends javax.swing.JFrame {

    public RegisterVehicleGUI() {
        initComponents();
    }

    public RegisterVehicleGUI(Members mem) {
        initComponents();
         setSize(970, 540);  //set size of frame
        setResizable(false); // frame can't be resized
        setLocationRelativeTo(null); // set frame at center of screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //default exist when prexx X icon

       this.mem=mem;
       lblWelcome.setText("Welcome " + this.mem.getName());
       
    }

    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        equipmentPanel = new javax.swing.JPanel();
        lblheading = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        lblmake = new javax.swing.JLabel();
        txtmake = new javax.swing.JTextField();
        lblcarNum = new javax.swing.JLabel();
        txtVehNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcolor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        combocond = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        equipmentPanel.setBackground(new java.awt.Color(255, 255, 255));
        equipmentPanel.setForeground(new java.awt.Color(0, 51, 51));
        equipmentPanel.setLayout(null);

        lblheading.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblheading.setText("Register Vehicle");
        equipmentPanel.add(lblheading);
        lblheading.setBounds(410, 10, 190, 30);

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(155, 113, 113));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        equipmentPanel.add(btnBack);
        btnBack.setBounds(820, 10, 110, 30);

        btnRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(155, 113, 113));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        equipmentPanel.add(btnRegister);
        btnRegister.setBounds(260, 330, 110, 40);

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(155, 113, 113));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        equipmentPanel.add(btnClear);
        btnClear.setBounds(480, 330, 110, 40);

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblWelcome.setText("Welcome ");
        equipmentPanel.add(lblWelcome);
        lblWelcome.setBounds(40, 10, 140, 20);
        equipmentPanel.add(jLabel1);
        jLabel1.setBounds(790, 150, 0, 0);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("*After Registration Vehicle will be assigned with an ID.Please note for further process");
        equipmentPanel.add(jLabel2);
        jLabel2.setBounds(190, 270, 550, 14);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Type");
        equipmentPanel.add(jLabel3);
        jLabel3.setBounds(170, 70, 50, 30);

        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
            }
        });
        equipmentPanel.add(txtType);
        txtType.setBounds(300, 70, 150, 30);

        lblmake.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblmake.setText("Make");
        equipmentPanel.add(lblmake);
        lblmake.setBounds(170, 130, 60, 24);

        txtmake.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtmake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmakeActionPerformed(evt);
            }
        });
        equipmentPanel.add(txtmake);
        txtmake.setBounds(300, 130, 150, 30);

        lblcarNum.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblcarNum.setText("Vehicle No");
        equipmentPanel.add(lblcarNum);
        lblcarNum.setBounds(170, 190, 100, 24);
        equipmentPanel.add(txtVehNo);
        txtVehNo.setBounds(300, 190, 150, 30);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Color");
        equipmentPanel.add(jLabel4);
        jLabel4.setBounds(570, 70, 60, 24);
        equipmentPanel.add(txtcolor);
        txtcolor.setBounds(650, 70, 150, 30);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Condition");
        equipmentPanel.add(jLabel5);
        jLabel5.setBounds(560, 130, 100, 20);

        combocond.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excellent", "Very Good", "Good", "Average", "Poor" }));
        combocond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocondActionPerformed(evt);
            }
        });
        equipmentPanel.add(combocond);
        combocond.setBounds(650, 130, 160, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/car1.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        equipmentPanel.add(jLabel6);
        jLabel6.setBounds(0, -10, 1000, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(equipmentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(equipmentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
         txtType.setText("");
        txtmake.setText("");
        txtVehNo.setText("");
        txtcolor.setText("");
        combocond.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        String type = txtType.getText();
        String make = txtmake.getText();
        String vehNo = txtVehNo.getText();
        String color = txtcolor.getText();
        String Performance = combocond.getItemCount() > 0 ? combocond.getSelectedItem().toString() : "";
        String validationMessage = "";
        
        if (type.trim().isEmpty()) {
            validationMessage += "Type is Empty";
        }

        if (make.trim().isEmpty()) {
            validationMessage += "\nMake is Empty";
        }
        if (Performance.trim().isEmpty()) {
            validationMessage += "\nCondition is Empty";
        }

    if (color.trim () 
        .isEmpty()) {
            validationMessage += "\ncolor is Empty";
    }

    if (vehNo.trim () 
        .isEmpty()) {
            validationMessage += "\nVehicle No is Empty";
    }

    
    if (validationMessage

    
        != "") {
            JOptionPane.showMessageDialog(null, validationMessage);
        return; // end method
    }

    
    //search if user exists with same email or mobile number 
    ArrayList<Vehicle> Vehicles = Database_Queries.DDL().selectAllVehicles();
    for (Vehicle vehicle : Vehicles

    
        ) { 
            if (vehNo.equals(vehicle.getcarNumber())) { // if match found
            JOptionPane.showMessageDialog(this, "Vehicle with Given Registration Number already exist in system"); // then show error meesage
            return;
        }
       

    }

    Vehicle vh = new Vehicle(mem.getMemberID(), type, make, vehNo, color, Performance);

    vh.setVehicleId(Database_Queries.DML().InsertVehicle(vh));
    JOptionPane.showMessageDialog (this, 
    "Vehicle got registered successfully. Your ID is:" + vh.getVehicleId());

        MemberToDriveHomeGUI home = new MemberToDriveHomeGUI(this.mem);
this.setVisible(false);
    home.setVisible (true);
    
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       // TODO add your handling code here:
         MemberToDriveHomeGUI home = new MemberToDriveHomeGUI(this.mem);
           this.setVisible(false);
          home.setVisible (true);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeActionPerformed

    private void txtmakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmakeActionPerformed

    private void combocondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combocondActionPerformed

 Members mem;

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterVehicleGUI().setVisible(true);
            }
        });
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> combocond;
    private javax.swing.JPanel equipmentPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblcarNum;
    private javax.swing.JLabel lblheading;
    private javax.swing.JLabel lblmake;
    private javax.swing.JTextField txtType;
    private javax.swing.JTextField txtVehNo;
    private javax.swing.JTextField txtcolor;
    private javax.swing.JTextField txtmake;
    // End of variables declaration//GEN-END:variables
}
