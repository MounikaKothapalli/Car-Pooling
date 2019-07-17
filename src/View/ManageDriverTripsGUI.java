package View;

import Controller.Database_Queries;
import Model.DriverTrip;
import Model.Members;
import Model.RiderTrip;
import Model.Vehicle;
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
public class ManageDriverTripsGUI extends javax.swing.JFrame {

    public ManageDriverTripsGUI() {
        initComponents();
    }

    public ManageDriverTripsGUI(Members mem) {
        super("Driver Trips");
        initComponents();
        this.mem = mem;
        show_Trips();
       setSize(970, 550);  //set size of frame
        setResizable(false); // frame can't be resized
        setLocationRelativeTo(null); // set frame at center of screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //default exist when prexx X icon
        jTable_driverTrip.setFillsViewportHeight(true);
            lblWelcome.setText("Welcome " + mem.getName());
           
        

    }

    private void show_Trips() {
         ArrayList<DriverTrip> trips=new ArrayList<DriverTrip>();
         Database_Queries.DML().UpdateDriverStatus(0,"Done");
       trips = Database_Queries.DDL().selectAllDriverTrips(this.mem.getMemberID(),null,null,null);
        
        DefaultTableModel model = (DefaultTableModel) jTable_driverTrip.getModel();
        model.setRowCount(0);
        Object[] row = new Object[10];
        
        for (int i = 0; i < trips.size(); i++) {
          
            Vehicle vehicle=Database_Queries.DDL().selectVehicle( trips.get(i).getVehicleID());
            row[0] = trips.get(i).getTripID();
             row[1] = vehicle.getType();
            
            row[2] = trips.get(i).getSource();
            row[3] = trips.get(i).getDestination();
           
            row[4] = trips.get(i).getSlotsAvailable();
           
            row[5] = trips.get(i).getStops();
            row[6] = trips.get(i).getAmountPerHour();
             row[7] = trips.get(i).getTime();
             row[8] = trips.get(i).getTravelDate();
            row[9] = trips.get(i).getStatus();
            model.addRow(row);
           }
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        equipmentPanel = new javax.swing.JPanel();
        lblheading = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnCancelTrip = new javax.swing.JButton();
        equipmentScroll = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_driverTrip = new javax.swing.JTable();
        lblWelcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        equipmentPanel.setBackground(new java.awt.Color(255, 255, 255));
        equipmentPanel.setForeground(new java.awt.Color(0, 51, 51));
        equipmentPanel.setLayout(null);

        lblheading.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblheading.setText("Manage My Trips");
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

        btnCancelTrip.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelTrip.setForeground(new java.awt.Color(155, 113, 113));
        btnCancelTrip.setText("Cancel Trip");
        btnCancelTrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelTripActionPerformed(evt);
            }
        });
        equipmentPanel.add(btnCancelTrip);
        btnCancelTrip.setBounds(360, 430, 110, 40);

        equipmentScroll.setBackground(new java.awt.Color(36, 37, 130));

        jTable_driverTrip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 174, 174)));
        jTable_driverTrip.setForeground(new java.awt.Color(170, 91, 91));
        jTable_driverTrip.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trip ID", "Vehicle", "Source", "Destination", "Slots Available", "Stops", "Amount Charged ", "Time", "Travel Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_driverTrip.setGridColor(new java.awt.Color(230, 67, 123));
        jTable_driverTrip.setSelectionBackground(new java.awt.Color(213, 141, 166));
        jTable_driverTrip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_driverTripMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_driverTrip);
        if (jTable_driverTrip.getColumnModel().getColumnCount() > 0) {
            jTable_driverTrip.getColumnModel().getColumn(1).setResizable(false);
            jTable_driverTrip.getColumnModel().getColumn(6).setResizable(false);
        }

        equipmentScroll.setViewportView(jScrollPane2);

        equipmentPanel.add(equipmentScroll);
        equipmentScroll.setBounds(20, 50, 880, 370);

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblWelcome.setText("Welcome ");
        equipmentPanel.add(lblWelcome);
        lblWelcome.setBounds(40, 10, 140, 20);
        equipmentPanel.add(jLabel1);
        jLabel1.setBounds(790, 150, 0, 0);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/car1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        equipmentPanel.add(jLabel2);
        jLabel2.setBounds(-5, -4, 960, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(equipmentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(equipmentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_driverTripMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_driverTripMouseClicked
        int i = jTable_driverTrip.getSelectedRow();
      btnCancelTrip.setEnabled(true);
        TableModel model = jTable_driverTrip.getModel();
       tripID=Integer.parseInt(model.getValueAt(i, 0).toString());
       String status=model.getValueAt(i, 9).toString();
       if(!status.equals("Active")){
           btnCancelTrip.setEnabled(false);
       }
      
        
    }//GEN-LAST:event_jTable_driverTripMouseClicked

    private void btnCancelTripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelTripActionPerformed
       Database_Queries.DML().UpdateDriverStatus(tripID,"Cancelled");
        Database_Queries.DML().UpdateRiderStatus(tripID,0,"Cancelled",null);
        JOptionPane.showMessageDialog(null, "Your Trip With Booking ID: "+tripID+" has been cancelled");
              this.setVisible(false);
                MemberToDriveHomeGUI home=new MemberToDriveHomeGUI(mem);
            home.setVisible(true);
    }//GEN-LAST:event_btnCancelTripActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        this.dispose();
        
            MemberToDriveHomeGUI home=new MemberToDriveHomeGUI(mem);
            home.setVisible(true);
        
    }//GEN-LAST:event_btnBackActionPerformed

    int tripID = 0;
    

    Members mem;

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageDriverTripsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancelTrip;
    private javax.swing.JPanel equipmentPanel;
    private javax.swing.JScrollPane equipmentScroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_driverTrip;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblheading;
    // End of variables declaration//GEN-END:variables
}
