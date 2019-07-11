package View;

import Controller.Database_Queries;
import Model.Members;
import Model.Vehicle;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author mounikakothapalli
 */
public class ManageVehiclesGUI extends javax.swing.JFrame {

    public ManageVehiclesGUI() {
        initComponents();
    }

    public ManageVehiclesGUI(Members mem) {
        super("Members");
        initComponents();
        this.mem = mem;
        show_Vehicles();
       setSize(970, 540);  //set size of frame
        setResizable(false); // frame can't be resized
        setLocationRelativeTo(null); // set frame at center of screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //default exist when prexx X icon
        jTable_Vehicle.setFillsViewportHeight(true);
        if (this.mem != null) {
          
            lblWelcome.setText("Welcome" + mem.getName());
            lblheading.setText("Manage My Vehicles");
        } else {
            lblWelcome.setText("Welcome " + "Admin");

        }  
        

    }

    private void show_Vehicles() {
         ArrayList<Vehicle> vehicles=new ArrayList<Vehicle>();
        if(mem!=null){
            vehicles=Database_Queries.DDL().selectMyVehicles(mem.getMemberID());
        }
        else{
       vehicles = Database_Queries.DDL().selectAllVehicles();
        }
        DefaultTableModel model = (DefaultTableModel) jTable_Vehicle.getModel();
        model.setRowCount(0);
        Object[] row = new Object[7];
        for (int i = 0; i < vehicles.size(); i++) {
            row[0] = vehicles.get(i).getVehicleId();
            row[1] = vehicles.get(i).getMemberId();
            row[2] = vehicles.get(i).getType();
            row[3] = vehicles.get(i).getMake();
            row[4] = vehicles.get(i).getcarNumber();
            row[5] = vehicles.get(i).getColor();
            row[6] = vehicles.get(i).getCondition();
            model.addRow(row);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        equipmentPanel = new javax.swing.JPanel();
        lblheading = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnAddVehicle = new javax.swing.JButton();
        btnUpdateVehicle = new javax.swing.JButton();
        btnDeleteVehicle = new javax.swing.JButton();
        equipmentScroll = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Vehicle = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblMemID = new javax.swing.JLabel();
        txtmemID = new javax.swing.JTextField();
        lblGen = new javax.swing.JLabel();
        txttype = new javax.swing.JTextField();
        comboCond = new javax.swing.JComboBox<>();
        lblMobile = new javax.swing.JLabel();
        lblmake = new javax.swing.JLabel();
        txtmake = new javax.swing.JTextField();
        lblvehNo = new javax.swing.JLabel();
        txtvehNo = new javax.swing.JTextField();
        lblVehID = new javax.swing.JLabel();
        txtvehID = new javax.swing.JTextField();
        lblcolor = new javax.swing.JLabel();
        txtcolor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        equipmentPanel.setBackground(new java.awt.Color(255, 255, 255));
        equipmentPanel.setForeground(new java.awt.Color(0, 51, 51));
        equipmentPanel.setLayout(null);

        lblheading.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblheading.setText("Manage Vehicles");
        equipmentPanel.add(lblheading);
        lblheading.setBounds(350, 0, 200, 30);

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

        btnAddVehicle.setBackground(new java.awt.Color(255, 255, 255));
        btnAddVehicle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAddVehicle.setForeground(new java.awt.Color(155, 113, 113));
        btnAddVehicle.setText("Add New");
        btnAddVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVehicleActionPerformed(evt);
            }
        });
        equipmentPanel.add(btnAddVehicle);
        btnAddVehicle.setBounds(820, 60, 110, 30);

        btnUpdateVehicle.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateVehicle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUpdateVehicle.setForeground(new java.awt.Color(155, 113, 113));
        btnUpdateVehicle.setText("Update");
        btnUpdateVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateVehicleActionPerformed(evt);
            }
        });
        equipmentPanel.add(btnUpdateVehicle);
        btnUpdateVehicle.setBounds(820, 100, 110, 30);

        btnDeleteVehicle.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteVehicle.setForeground(new java.awt.Color(155, 113, 113));
        btnDeleteVehicle.setText("Delete");
        btnDeleteVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteVehicleActionPerformed(evt);
            }
        });
        equipmentPanel.add(btnDeleteVehicle);
        btnDeleteVehicle.setBounds(820, 150, 110, 30);

        equipmentScroll.setBackground(new java.awt.Color(36, 37, 130));

        jTable_Vehicle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 174, 174)));
        jTable_Vehicle.setForeground(new java.awt.Color(170, 91, 91));
        jTable_Vehicle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MemberID", "Vehicle ID", "Type", "Make", "Vehicle No", "Color", "Condition"
            }
        ));
        jTable_Vehicle.setGridColor(new java.awt.Color(230, 67, 123));
        jTable_Vehicle.setSelectionBackground(new java.awt.Color(213, 141, 166));
        jTable_Vehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_VehicleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Vehicle);
        if (jTable_Vehicle.getColumnModel().getColumnCount() > 0) {
            jTable_Vehicle.getColumnModel().getColumn(1).setResizable(false);
            jTable_Vehicle.getColumnModel().getColumn(4).setResizable(false);
        }

        equipmentScroll.setViewportView(jScrollPane2);

        equipmentPanel.add(equipmentScroll);
        equipmentScroll.setBounds(20, 260, 910, 220);

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
        btnClear.setBounds(820, 200, 110, 30);

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblWelcome.setText("Welcome ");
        equipmentPanel.add(lblWelcome);
        lblWelcome.setBounds(40, 10, 140, 20);
        equipmentPanel.add(jLabel1);
        jLabel1.setBounds(790, 150, 0, 0);

        lblMemID.setText("MemberID");
        equipmentPanel.add(lblMemID);
        lblMemID.setBounds(40, 110, 70, 14);
        equipmentPanel.add(txtmemID);
        txtmemID.setBounds(130, 100, 150, 30);

        lblGen.setText("Condition");
        equipmentPanel.add(lblGen);
        lblGen.setBounds(440, 100, 70, 20);

        txttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttypeActionPerformed(evt);
            }
        });
        equipmentPanel.add(txttype);
        txttype.setBounds(130, 150, 150, 20);

        comboCond.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excellent", "Very Good", "Good", "Average", "Poor" }));
        comboCond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCondActionPerformed(evt);
            }
        });
        equipmentPanel.add(comboCond);
        comboCond.setBounds(570, 100, 150, 20);

        lblMobile.setText("Type");
        equipmentPanel.add(lblMobile);
        lblMobile.setBounds(40, 150, 24, 14);

        lblmake.setText("Make");
        equipmentPanel.add(lblmake);
        lblmake.setBounds(40, 200, 50, 20);

        txtmake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmakeActionPerformed(evt);
            }
        });
        equipmentPanel.add(txtmake);
        txtmake.setBounds(130, 200, 150, 20);

        lblvehNo.setText("Vehicle No");
        equipmentPanel.add(lblvehNo);
        lblvehNo.setBounds(440, 60, 90, 14);

        txtvehNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvehNoActionPerformed(evt);
            }
        });
        equipmentPanel.add(txtvehNo);
        txtvehNo.setBounds(570, 60, 150, 20);

        lblVehID.setText("VehicleID");
        equipmentPanel.add(lblVehID);
        lblVehID.setBounds(40, 60, 70, 14);

        txtvehID.setBackground(new java.awt.Color(204, 204, 204));
        txtvehID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvehIDActionPerformed(evt);
            }
        });
        equipmentPanel.add(txtvehID);
        txtvehID.setBounds(130, 56, 150, 30);

        lblcolor.setText("Color");
        equipmentPanel.add(lblcolor);
        lblcolor.setBounds(440, 150, 60, 20);
        equipmentPanel.add(txtcolor);
        txtcolor.setBounds(570, 150, 150, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/car1.jpg"))); // NOI18N
        equipmentPanel.add(jLabel2);
        jLabel2.setBounds(-15, -14, 1020, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(equipmentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 997, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(equipmentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtcolor.setText("");
        txtvehNo.setText("");
        txtmake.setText("");
       txttype.setText("");
        txtmemID.setText("");
         txttype.setText("");
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void jTable_VehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_VehicleMouseClicked
        int i = jTable_Vehicle.getSelectedRow();
        TableModel model = jTable_Vehicle.getModel();
        txtvehID.setText(model.getValueAt(i, 0).toString());
        txtmemID.setText(model.getValueAt(i, 1).toString());
        txttype.setText(model.getValueAt(i, 2).toString());
        txtmake.setText(model.getValueAt(i, 3).toString());
        txtvehNo.setText(model.getValueAt(i, 4).toString());
         txtcolor.setText(model.getValueAt(i, 5).toString());
        txtvehID.setEditable(false);
        comboCond.setSelectedItem(model.getValueAt(i, 6).toString());
            
    }//GEN-LAST:event_jTable_VehicleMouseClicked

    private void btnDeleteVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteVehicleActionPerformed
        String id = txtvehID.getText();
        Database_Queries.DML().DeleteVehicle(Integer.parseInt(id));
        JOptionPane.showMessageDialog(null, "Vehicle deleted successfully");
        show_Vehicles();
        txtvehID.setText("");
        txtmemID.setText("");
        txttype.setText("");
       txtmake.setText("");
        txtvehNo.setText("");
        txtcolor.setText("");
    }//GEN-LAST:event_btnDeleteVehicleActionPerformed

    private void btnUpdateVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateVehicleActionPerformed
       String memID = txtmemID.getText();
        String type = txttype.getText();
        String make = txtmake.getText();
         String vehNo = txtvehNo.getText();
         String color=txtcolor.getText();
       
        int ID=Integer.parseInt(txtvehID.getText());
        String condition = comboCond.getItemCount() > 0 ? comboCond.getSelectedItem().toString() : "";
        String validationMessage = "";
        if (type.trim().isEmpty()) {
            validationMessage += "Type is Empty";
        }

        if (make.trim().isEmpty()) {
            validationMessage += "\nMake is Empty";
        }
        if (vehNo.trim().isEmpty()) {
            validationMessage += "\nVehicle No is Empty";
        }

    if (color.trim () 
        .isEmpty()) {
            validationMessage += "\ncolor is Empty";
    }

    if (memID.trim () 
        .isEmpty()) {
            validationMessage += "\nMember ID is Empty";
    }

    
   if (validationMessage

    
        != "") {
            JOptionPane.showMessageDialog(null, validationMessage);
        return; // end method
    }

    
  
    Vehicle vh = new Vehicle(Integer.parseInt(memID),ID,type, make, vehNo, color, condition);
        Database_Queries.DML().UpdateVehicle(vh);
        JOptionPane.showMessageDialog(null, "Vehicle updated successfully");
        show_Vehicles();
    }//GEN-LAST:event_btnUpdateVehicleActionPerformed

    private void btnAddVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVehicleActionPerformed
       String memID = txtmemID.getText();
       String type = txttype.getText();
        String make = txtmake.getText();
        String vehNo = txtvehNo.getText();
        String color = txtcolor.getText();
        String Performance = comboCond.getItemCount() > 0 ? comboCond.getSelectedItem().toString() : "";
        String validationMessage = "";
         if (memID.trim () 
        .isEmpty()) {
            validationMessage += "\nMember ID is Empty";
    }
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

    Vehicle vh = new Vehicle(Integer.parseInt(memID), type, make, vehNo, color, Performance);

    vh.setVehicleId(Database_Queries.DML().InsertVehicle(vh));
    JOptionPane.showMessageDialog (this, 
    "Vehicle got registered successfully. Your ID is:" + vh.getVehicleId());

        txtvehID.setText("" + vh.getVehicleId());
        JOptionPane.showMessageDialog(null, "Vehicle Added successfully");
        show_Vehicles();
    }//GEN-LAST:event_btnAddVehicleActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        this.dispose();
        if(this.mem==null){
            AdminHomeGUI home = new AdminHomeGUI();
            home.setVisible(true);
        }
        else{
            MemberToDriveHomeGUI home=new MemberToDriveHomeGUI(mem);
            home.setVisible(true); 
        }
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void comboCondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCondActionPerformed

    private void txttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttypeActionPerformed

    private void txtmakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmakeActionPerformed

    private void txtvehNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvehNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvehNoActionPerformed

    private void txtvehIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvehIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvehIDActionPerformed

    String equipmentImagePath = "";
    

    Members mem;

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageVehiclesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVehicle;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteVehicle;
    private javax.swing.JButton btnUpdateVehicle;
    private javax.swing.JComboBox<String> comboCond;
    private javax.swing.JPanel equipmentPanel;
    private javax.swing.JScrollPane equipmentScroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Vehicle;
    private javax.swing.JLabel lblGen;
    private javax.swing.JLabel lblMemID;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblVehID;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblcolor;
    private javax.swing.JLabel lblheading;
    private javax.swing.JLabel lblmake;
    private javax.swing.JLabel lblvehNo;
    private javax.swing.JTextField txtcolor;
    private javax.swing.JTextField txtmake;
    private javax.swing.JTextField txtmemID;
    private javax.swing.JTextField txttype;
    private javax.swing.JTextField txtvehID;
    private javax.swing.JTextField txtvehNo;
    // End of variables declaration//GEN-END:variables
}
