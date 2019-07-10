package View;

//import Controller.DatabaseQueries;
//import Model.EventManager;
import Controller.Database_Queries;
import Model.Members;

import javax.swing.JOptionPane;

import javax.swing.SwingUtilities;


/**
 *
 * @author mounikakothapalli
 */
public class MemberLoginGUI extends javax.swing.JPanel {

    public MemberLoginGUI() {
        initComponents();
       //JPanel jPanel1= new JPanel();
       //jPanel1.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEventManagerID = new javax.swing.JLabel();
        txtmemberID = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lbltext = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEventManagerID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEventManagerID.setText("MemberID");
        add(lblEventManagerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 30));

        txtmemberID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtmemberID.setMinimumSize(new java.awt.Dimension(20, 20));
        txtmemberID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmemberIDActionPerformed(evt);
            }
        });
        add(txtmemberID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 250, 30));

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPassword.setText("Password");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 250, 30));

        btnSubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(155, 113, 113));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 120, 40));

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(155, 113, 113));
        btnCancel.setText("Clear");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 120, 40));

        lbltext.setForeground(new java.awt.Color(255, 255, 255));
        lbltext.setText("Not Registered Yet? Click on Sign Up Button to the Right");
        add(lbltext, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 490, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
         String memberID = txtmemberID.getText();
        String password = txtPassword.getText();

        //Validations
        if (memberID.isEmpty() || password.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "MemberID or Password is Empty");
            return;
        }

        //Validation for ID
        if (!memberID.matches("^[0-9]*$")) {
            JOptionPane.showMessageDialog(null, "Invalid MemberID");
            return;
        }

        Members mem = Database_Queries.DDL().selectMemberDetails(Integer.parseInt(memberID));

        if (mem!=null && mem.getPassword()!=null && password.equals(mem.getPassword())) {
           // JOptionPane.showMessageDialog(this, "Login Succesfull");
             HomeGUI home=new HomeGUI();
             home.setVisible(false);
            this.setVisible(false);
            SwingUtilities.windowForComponent(this).dispose();
            if(mem.getDriverId()==null ||mem.getDriverId().trim().equals("") ){
            new MemberToRideHomeGUI(mem).setVisible(true);
            }// open the home page
            
            else{
                this.setVisible(false);
                 new MemberToDriveHomeGUI(mem).setVisible(true);
            }
            return;
        } else {
            //if no match found then show message for not found
            JOptionPane.showMessageDialog(this, "Member ID and Password either of that is not found.");
            return;
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtmemberID.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtmemberIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmemberIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmemberIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblEventManagerID;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lbltext;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtmemberID;
    // End of variables declaration//GEN-END:variables
}
