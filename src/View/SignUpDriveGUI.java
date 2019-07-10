package View;


/**
 *
 * @author mounikakothapalli
 */

import Controller.Database_Queries;
import Model.Members;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class SignUpDriveGUI extends javax.swing.JPanel {

   
    public SignUpDriveGUI() {
        initComponents();
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblMobile = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        addressScroll = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblConfirmPassword = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        btnRegisterDrive = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        cmbGender = new javax.swing.JComboBox<>();
        lblAlert = new javax.swing.JLabel();
        lblDriverID = new javax.swing.JLabel();
        txtDriverID = new javax.swing.JTextField();
        chkSubscribe = new javax.swing.JCheckBox();

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/BackgroundHeader.jpg"))); // NOI18N
        background.setText("jLabel2");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblName.setText("Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 50, -1, -1));

        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 150, -1));

        lblMobile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMobile.setText("Mobile");
        add(lblMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtMobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 150, -1));

        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 133, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEmail.setText("Email");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, 18));

        lblGender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblGender.setText("Gender");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        lblAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAddress.setText("Address");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        txtAddress.setColumns(20);
        txtAddress.setLineWrap(true);
        txtAddress.setRows(5);
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        addressScroll.setViewportView(txtAddress);

        add(addressScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 148, 78));

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPassword.setText("Password");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 133, -1));

        lblConfirmPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblConfirmPassword.setText("Confirm Password");
        add(lblConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        txtConfirmPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPasswordActionPerformed(evt);
            }
        });
        add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 133, -1));

        btnRegisterDrive.setBackground(new java.awt.Color(255, 255, 255));
        btnRegisterDrive.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRegisterDrive.setForeground(new java.awt.Color(186, 108, 108));
        btnRegisterDrive.setText("Register");
        btnRegisterDrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterDriveActionPerformed(evt);
            }
        });
        add(btnRegisterDrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 120, 40));

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(186, 108, 108));
        btnCancel.setText("Clear");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 120, 40));

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Female", "Male", "Others", " " }));
        cmbGender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, -1));

        lblAlert.setForeground(new java.awt.Color(255, 255, 255));
        lblAlert.setText("*After registration is Successful, You will be provided with a Member ID. Please note ID is required for LOGIN.");
        add(lblAlert, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 740, -1));

        lblDriverID.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblDriverID.setText("Driver's ID");
        add(lblDriverID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        txtDriverID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(txtDriverID, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 130, -1));

        chkSubscribe.setBackground(new java.awt.Color(219, 212, 212));
        chkSubscribe.setForeground(new java.awt.Color(255, 255, 255));
        chkSubscribe.setText("Subscribe for Notifications");
        chkSubscribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSubscribeActionPerformed(evt);
            }
        });
        add(chkSubscribe, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 230, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtName.setText("");
        txtMobile.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
        txtConfirmPassword.setText("");
        cmbGender.setSelectedIndex(0);
        txtAddress.setText("");
        chkSubscribe.setSelected(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnRegisterDriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterDriveActionPerformed
        String name = txtName.getText();
        String mobile = txtMobile.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        String password = txtPassword.getText();
        String confirmPassword = txtConfirmPassword.getText();
        String gender = cmbGender.getItemCount() > 1 ? cmbGender.getSelectedItem().toString() : "";
        int subscribe = chkSubscribe.isSelected() ? 1 : 0;
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

    if (password.trim () 
        .isEmpty()) {
            validationMessage += "\nPassword is Empty";
    }

    if (confirmPassword.trim () 
        .isEmpty()) {
            validationMessage += "\nConfirm Password is Empty";
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

    if (!password.equals (confirmPassword) 
        ) {
            JOptionPane.showMessageDialog(null, "Password not match");
        return; // end method
    }

    //search if user exists with same email or mobile number 
    ArrayList<Members> Members = Database_Queries.DDL().selectAllMembers();
    for (Members member : Members

    
        ) { 
            if (email.equals(member.getEmail()) && !driverId.equals(null)) { // if match found
            JOptionPane.showMessageDialog(this, "Member with Given Email ID already exist in system"); // then show error meesage
            return;
        }
        if (mobile.equals(member.getMobile())&& !driverId.equals(null)) { // if match found
            JOptionPane.showMessageDialog(this, "Member with given Mobile No. already exist in system"); // then show error meesage
            return;
        }
        if (driverId.equals(member.getDriverId())) { // if match found
            JOptionPane.showMessageDialog(this, "Member with given Driver's License already exist in system"); // then show error meesage
            return;
        }

    }

    Members em = new Members(name, mobile, email, address, password, gender, subscribe,driverId);

    em.setMemberID (Database_Queries.DML().InsertMember(em));
    JOptionPane.showMessageDialog (this, 
    "Member To Drive got registered successfully. Your ID is:" + em.getMemberID() + "\nPlease use the given ID for login");
 this.setVisible(false);
           
             SwingUtilities.windowForComponent(this).dispose();
        HomeGUI home = new HomeGUI();

    home.setVisible (
true);
    }//GEN-LAST:event_btnRegisterDriveActionPerformed

    private void txtConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPasswordActionPerformed

    private void chkSubscribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSubscribeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkSubscribeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane addressScroll;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRegisterDrive;
    private javax.swing.JCheckBox chkSubscribe;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAlert;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblDriverID;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtDriverID;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
