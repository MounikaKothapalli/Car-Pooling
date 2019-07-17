package View;

import Controller.Database_Queries;
import Model.Members;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author mounikakothapalli
 */
public class ManageMembersGUI extends javax.swing.JFrame {

    public ManageMembersGUI() {
        initComponents();
    }

    public ManageMembersGUI(Members mem) {
        super("Manage Members");
        initComponents();
        this.mem = mem;
        show_members();
        setSize(940, 550);  //set size of frame
        setResizable(false); // frame can't be resized
        setLocationRelativeTo(null); // set frame at center of screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //default exist when prexx X icon
        jTable_Member.setFillsViewportHeight(true);

       lblWelcome.setText(lblWelcome.getText() + "Admin");
        

    }

    private void show_members() {
        ArrayList<Members> members = Database_Queries.DDL().selectAllMembers();

        DefaultTableModel model = (DefaultTableModel) jTable_Member.getModel();
        model.setRowCount(0);
        Object[] row = new Object[6];
        for (int i = 0; i < members.size(); i++) {
            row[0] = members.get(i).getMemberID();
            row[1] = members.get(i).getName();
            row[2] = members.get(i).getMobile();
            row[3] = members.get(i).getEmail();
            row[4] = members.get(i).getAddress();
            row[5] = members.get(i).getDriverId();
            model.addRow(row);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        equipmentPanel = new javax.swing.JPanel();
        lblheading = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnAddMember = new javax.swing.JButton();
        btnUpdateMember = new javax.swing.JButton();
        btnDeleteMember = new javax.swing.JButton();
        equipmentScroll = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Member = new javax.swing.JTable();
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
        jLabel3 = new javax.swing.JLabel();
        txtDriverID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAddress = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        equipmentPanel.setBackground(new java.awt.Color(255, 255, 255));
        equipmentPanel.setForeground(new java.awt.Color(0, 51, 51));
        equipmentPanel.setLayout(null);

        lblheading.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblheading.setText("Manage Members");
        equipmentPanel.add(lblheading);
        lblheading.setBounds(350, 0, 140, 30);

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
        btnBack.setBounds(810, 10, 110, 30);

        btnAddMember.setBackground(new java.awt.Color(255, 255, 255));
        btnAddMember.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAddMember.setForeground(new java.awt.Color(155, 113, 113));
        btnAddMember.setText("Add New");
        btnAddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMemberActionPerformed(evt);
            }
        });
        equipmentPanel.add(btnAddMember);
        btnAddMember.setBounds(810, 70, 110, 30);

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
        btnUpdateMember.setBounds(810, 110, 110, 30);

        btnDeleteMember.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteMember.setForeground(new java.awt.Color(155, 113, 113));
        btnDeleteMember.setText("Delete");
        btnDeleteMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMemberActionPerformed(evt);
            }
        });
        equipmentPanel.add(btnDeleteMember);
        btnDeleteMember.setBounds(810, 150, 110, 30);

        equipmentScroll.setBackground(new java.awt.Color(36, 37, 130));

        jTable_Member.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 174, 174)));
        jTable_Member.setForeground(new java.awt.Color(170, 91, 91));
        jTable_Member.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MemberID", "Name", "MobileNo", "Email", "Address", "DriverID"
            }
        ));
        jTable_Member.setGridColor(new java.awt.Color(230, 67, 123));
        jTable_Member.setSelectionBackground(new java.awt.Color(213, 141, 166));
        jTable_Member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_MemberMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Member);

        equipmentScroll.setViewportView(jScrollPane2);

        equipmentPanel.add(equipmentScroll);
        equipmentScroll.setBounds(10, 260, 930, 250);

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
        btnClear.setBounds(810, 190, 110, 30);

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblWelcome.setText("Welcome ");
        equipmentPanel.add(lblWelcome);
        lblWelcome.setBounds(40, 10, 140, 20);
        equipmentPanel.add(jLabel1);
        jLabel1.setBounds(790, 150, 0, 0);

        jLabel4.setText("Name");
        equipmentPanel.add(jLabel4);
        jLabel4.setBounds(40, 110, 45, 14);
        equipmentPanel.add(txtName);
        txtName.setBounds(130, 100, 150, 30);

        lblGen.setText("Gender");
        equipmentPanel.add(lblGen);
        lblGen.setBounds(410, 100, 45, 20);

        txtMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileActionPerformed(evt);
            }
        });
        equipmentPanel.add(txtMobile);
        txtMobile.setBounds(130, 150, 150, 20);

        comboGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Female", "Male", "Others" }));
        comboGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGenActionPerformed(evt);
            }
        });
        equipmentPanel.add(comboGen);
        comboGen.setBounds(500, 100, 150, 20);

        lblMobile.setText("Mobile");
        equipmentPanel.add(lblMobile);
        lblMobile.setBounds(40, 150, 32, 14);

        jLabel2.setText("Email");
        equipmentPanel.add(jLabel2);
        jLabel2.setBounds(40, 200, 50, 20);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        equipmentPanel.add(txtEmail);
        txtEmail.setBounds(130, 200, 150, 20);

        jLabel3.setText("Driver's ID");
        equipmentPanel.add(jLabel3);
        jLabel3.setBounds(410, 60, 90, 14);

        txtDriverID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDriverIDActionPerformed(evt);
            }
        });
        equipmentPanel.add(txtDriverID);
        txtDriverID.setBounds(500, 50, 150, 20);

        jLabel5.setText("MemberID");
        equipmentPanel.add(jLabel5);
        jLabel5.setBounds(40, 60, 70, 14);

        txtID.setBackground(new java.awt.Color(204, 204, 204));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        equipmentPanel.add(txtID);
        txtID.setBounds(130, 56, 150, 30);

        jLabel6.setText("Address");
        equipmentPanel.add(jLabel6);
        jLabel6.setBounds(410, 160, 60, 20);

        txtAreaAddress.setColumns(20);
        txtAreaAddress.setRows(5);
        jScrollPane1.setViewportView(txtAreaAddress);

        equipmentPanel.add(jScrollPane1);
        jScrollPane1.setBounds(500, 150, 166, 96);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/car1.jpg"))); // NOI18N
        equipmentPanel.add(jLabel7);
        jLabel7.setBounds(-15, -24, 970, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(equipmentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(equipmentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtAreaAddress.setText("");
        txtDriverID.setText("");
        txtEmail.setText("");
       txtMobile.setText("");
        txtName.setText("");
        comboGen.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void jTable_MemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_MemberMouseClicked
        int i = jTable_Member.getSelectedRow();
        TableModel model = jTable_Member.getModel();
        txtID.setText(model.getValueAt(i, 0).toString());
        txtName.setText(model.getValueAt(i, 1).toString());
        txtMobile.setText(model.getValueAt(i, 2).toString());
        txtEmail.setText(model.getValueAt(i, 3).toString());
        txtAreaAddress.setText(model.getValueAt(i, 4).toString());
        
        if(model.getValueAt(i, 5)==null)
            txtDriverID.setText(null);
        else
        txtDriverID.setText(model.getValueAt(i, 5).toString());
        txtID.setEditable(false);
     //   comboGen.setSelectedItem(model.getValueAt(i, 6).toString());
            
    }//GEN-LAST:event_jTable_MemberMouseClicked

    private void btnDeleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMemberActionPerformed
        String id = txtID.getText();
        Database_Queries.DML().DeleteMember(Integer.parseInt(id));
        JOptionPane.showMessageDialog(null, "Member deleted successfully");
        show_members();
        txtID.setText("");
        txtName.setText("");
        txtMobile.setText("");
       txtEmail.setText("");
        txtAreaAddress.setText("");
        txtDriverID.setText("");
        comboGen.setSelectedIndex(0);
    }//GEN-LAST:event_btnDeleteMemberActionPerformed

    private void btnUpdateMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMemberActionPerformed
       String name = txtName.getText();
        String mobile = txtMobile.getText();
        String email = txtEmail.getText();
        String address = txtAreaAddress.getText();
        String password = "default";
        int ID=Integer.parseInt(txtID.getText());
        String gender = comboGen.getItemCount() > 0 ? comboGen.getSelectedItem().toString() : "";
        int subscribe = 1;
        String driverId=txtDriverID.getText().trim()==""?null:txtDriverID.getText();
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
        JOptionPane.showMessageDialog(null, "Member updated successfully");
        show_members();
    }//GEN-LAST:event_btnUpdateMemberActionPerformed

    private void btnAddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMemberActionPerformed

       String name = txtName.getText();
        String mobile = txtMobile.getText();
        String email = txtEmail.getText();
        String address = txtAreaAddress.getText();
        String password = "default";
        
        String gender = comboGen.getItemCount() > 1 ? comboGen.getSelectedItem().toString() : "";
        int subscribe = 1;
        String driverId=txtDriverID.getText().trim()==""?null:txtDriverID.getText();
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

        txtID.setText("" + em.getMemberID());
        JOptionPane.showMessageDialog(null, "Member Added successfully");
        show_members();
    }//GEN-LAST:event_btnAddMemberActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        this.dispose();
        
            AdminHomeGUI home = new AdminHomeGUI();
            home.setVisible(true);
        
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
                new ManageMembersGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMember;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteMember;
    private javax.swing.JButton btnUpdateMember;
    private javax.swing.JComboBox<String> comboGen;
    private javax.swing.JPanel equipmentPanel;
    private javax.swing.JScrollPane equipmentScroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Member;
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
    // End of variables declaration//GEN-END:variables
}
