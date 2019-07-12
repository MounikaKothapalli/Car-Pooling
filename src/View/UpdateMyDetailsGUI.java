package View;

import Controller.Database_Queries;
import Model.Members;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author mounikakothapalli
 */
public class UpdateMyDetailsGUI extends javax.swing.JFrame {

    public UpdateMyDetailsGUI() {
        initComponents();
    }

    public UpdateMyDetailsGUI(Members mem) {
        super("Update Details");
        initComponents();
        this.mem = mem;
        
        setSize(960, 520);  //set size of frame
        setResizable(false); // frame can't be resized
        setLocationRelativeTo(null); // set frame at center of screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //default exist when prexx X icon
       
       lblWelcome.setText("Welcome " + this.mem.getName());
       if(this.mem.getDriverId()==null){
           txtDriverID.setVisible(false);
           lblDriverID.setVisible(false);
       }
        txtMobile.setEnabled(false);
                txtEmail.setEnabled(false);
                txtMobile.setText(this.mem.getMobile());
                txtEmail.setText(this.mem.getEmail());
                txtName.setText(this.mem.getName());
                txtID.setText(String.valueOf(this.mem.getMemberID()));
                txtAreaAddress.setText(this.mem.getAddress());
                txtDriverID.setText(this.mem.getDriverId());
                comboGen.setSelectedItem(this.mem.getGender());
                txtPwd.setText(this.mem.getPassword());

    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        equipmentPanel = new javax.swing.JPanel();
        lblheading = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnUpdateMember = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblGen = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        comboGen = new javax.swing.JComboBox<>();
        lblMobile = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblDriverID = new javax.swing.JLabel();
        txtDriverID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAddress = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtPwd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        equipmentPanel.setBackground(new java.awt.Color(255, 255, 255));
        equipmentPanel.setForeground(new java.awt.Color(0, 51, 51));
        equipmentPanel.setLayout(null);

        lblheading.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblheading.setText("Manage My Details");
        equipmentPanel.add(lblheading);
        lblheading.setBounds(350, 0, 180, 30);

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
        btnBack.setBounds(760, 10, 110, 30);

        btnUpdateMember.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateMember.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUpdateMember.setForeground(new java.awt.Color(155, 113, 113));
        btnUpdateMember.setText("Update");
        btnUpdateMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMemberActionPerformed(evt);
            }
        });
        equipmentPanel.add(btnUpdateMember);
        btnUpdateMember.setBounds(310, 350, 110, 40);

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
        btnClear.setBounds(560, 350, 110, 40);

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblWelcome.setText("Welcome ");
        equipmentPanel.add(lblWelcome);
        lblWelcome.setBounds(40, 10, 140, 20);
        equipmentPanel.add(jLabel1);
        jLabel1.setBounds(790, 150, 0, 0);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Name");
        equipmentPanel.add(jLabel4);
        jLabel4.setBounds(80, 110, 45, 19);
        equipmentPanel.add(txtName);
        txtName.setBounds(210, 110, 150, 30);

        lblGen.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblGen.setText("Gender");
        equipmentPanel.add(lblGen);
        lblGen.setBounds(510, 70, 60, 20);

        txtMobile.setBackground(new java.awt.Color(204, 204, 204));
        txtMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileActionPerformed(evt);
            }
        });
        equipmentPanel.add(txtMobile);
        txtMobile.setBounds(210, 160, 150, 20);

        comboGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Female", "Male", "Others" }));
        comboGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGenActionPerformed(evt);
            }
        });
        equipmentPanel.add(comboGen);
        comboGen.setBounds(610, 60, 150, 30);

        lblMobile.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblMobile.setText("Mobile");
        equipmentPanel.add(lblMobile);
        lblMobile.setBounds(80, 150, 70, 20);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Email");
        equipmentPanel.add(jLabel2);
        jLabel2.setBounds(510, 110, 50, 20);

        txtEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        equipmentPanel.add(txtEmail);
        txtEmail.setBounds(610, 110, 150, 20);

        lblDriverID.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblDriverID.setText("Driver's ID");
        equipmentPanel.add(lblDriverID);
        lblDriverID.setBounds(510, 220, 90, 16);

        txtDriverID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDriverIDActionPerformed(evt);
            }
        });
        equipmentPanel.add(txtDriverID);
        txtDriverID.setBounds(610, 210, 150, 30);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setText("MemberID");
        equipmentPanel.add(jLabel5);
        jLabel5.setBounds(80, 70, 90, 19);

        txtID.setBackground(new java.awt.Color(204, 204, 204));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        equipmentPanel.add(txtID);
        txtID.setBounds(210, 60, 150, 30);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setText("Address");
        equipmentPanel.add(jLabel6);
        jLabel6.setBounds(80, 210, 60, 20);

        txtAreaAddress.setColumns(20);
        txtAreaAddress.setRows(5);
        jScrollPane1.setViewportView(txtAreaAddress);

        equipmentPanel.add(jScrollPane1);
        jScrollPane1.setBounds(210, 210, 166, 96);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setText("Password");
        equipmentPanel.add(jLabel8);
        jLabel8.setBounds(510, 160, 80, 20);
        equipmentPanel.add(txtPwd);
        txtPwd.setBounds(610, 150, 150, 30);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/car1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        equipmentPanel.add(jLabel3);
        jLabel3.setBounds(-15, -24, 980, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(equipmentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(equipmentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtAreaAddress.setText("");
        txtDriverID.setText("");
       txtPwd.setText("");
        txtName.setText("");
        txtDriverID.setText("");
        comboGen.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMemberActionPerformed
       String name = txtName.getText();
        String mobile = mem.getMobile();
        String email = mem.getEmail();
        String address = txtAreaAddress.getText();
        String password = txtPwd.getText();
        int ID=Integer.parseInt(txtID.getText());
        String gender = comboGen.getItemCount() > 1 ? comboGen.getSelectedItem().toString() : "";
        int subscribe = mem.getSubscribe();
         String driverId=txtDriverID.getText();
        
        String validationMessage = "";
        if (name.trim().isEmpty()) {
            validationMessage += "Name is Empty";
        }

        if (mobile.trim().isEmpty()) {
            validationMessage += "\nMobile is Empty";
        }
        if (gender.trim()=="Select") {
            validationMessage += "\nGender Must be selected";
        }

    if (email.trim () 
        .isEmpty()) {
            validationMessage += "\nEmail is Empty";
    }

    if (address.trim () 
        .isEmpty()) {
            validationMessage += "\nAddress is Empty";
    }

    
   if (validationMessage

    
        != "") {
            JOptionPane.showMessageDialog(null, validationMessage);
        return; // end method
    }

    if (!email.matches ( 
        "^(.+)@(.+)$")) {
            JOptionPane.showMessageDialog(null, "Invalid Email");
        return; // end method
    }

    if (!mobile.matches ( 
        "^[0-9]*$")) {
            JOptionPane.showMessageDialog(null, "Invalid Mobile");
        return; // end method
    }
    //search if user exists with same email or mobile number 
  
    Members em = new Members(ID,name, mobile, email, address, password, gender, subscribe,driverId);
        Database_Queries.DML().UpdateMember(em);
        JOptionPane.showMessageDialog(null, "Your Details have updated successfully");
        
    }//GEN-LAST:event_btnUpdateMemberActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        this.dispose();
        if(this.mem.getDriverId()==null){
             MemberToRideHomeGUI home = new MemberToRideHomeGUI(this.mem);
            home.setVisible(true);
        }
        else{
            MemberToDriveHomeGUI home = new MemberToDriveHomeGUI(this.mem);
            home.setVisible(true);
        }
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void comboGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboGenActionPerformed

    private void txtMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtDriverIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDriverIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDriverIDActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    String equipmentImagePath = "";
    

    Members mem;

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMyDetailsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnUpdateMember;
    private javax.swing.JComboBox<String> comboGen;
    private javax.swing.JPanel equipmentPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDriverID;
    private javax.swing.JLabel lblGen;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblheading;
    private javax.swing.JTextArea txtAreaAddress;
    private javax.swing.JTextField txtDriverID;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPwd;
    // End of variables declaration//GEN-END:variables
}
