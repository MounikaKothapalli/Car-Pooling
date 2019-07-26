package View;

import Controller.Database_Queries;
import Model.DriverTrip;
import Model.Members;
import Model.RiderTrip;
import Model.Vehicle;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author mounikakothapalli
 */
public class ViewAllTripsGUI extends javax.swing.JFrame {

    
    public ViewAllTripsGUI() {
        super("View Trips");
        initComponents();
        show_Trips();
       setSize(970, 540);  //set size of frame
        setResizable(false); // frame can't be resized
        setLocationRelativeTo(null); // set frame at center of screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //default exist when prexx X icon
        jTable_Trips.setFillsViewportHeight(true);
            lblWelcome.setText("Welcome Admin");
           
        

    }

    private void show_Trips() {
         ArrayList<DriverTrip> trips=new ArrayList<DriverTrip>();
        
       trips = Database_Queries.DDL().selectAllDriverTrips(1,"Alltrips",null,null);
        
        DefaultTableModel model = (DefaultTableModel) jTable_Trips.getModel();
        model.setRowCount(0);
        Object[] row = new Object[10];
        
        for (int i = 0; i < trips.size(); i++) {
          
            Vehicle vehicle=Database_Queries.DDL().selectVehicle( trips.get(i).getVehicleID());
            row[0] = trips.get(i).getTripID();
            row[1] = trips.get(i).getSource();
            row[2] = trips.get(i).getDestination();
             row[3] = trips.get(i).getTravelDate();
            row[4] = trips.get(i).getStatus();
            model.addRow(row);
           }
        

    }
    private void Show_Details(ArrayList<DriverTrip> trips,ArrayList<RiderTrip> riderTrip) {
         
        DefaultTableModel model = (DefaultTableModel) jTable_TripsDetails.getModel();
        model.setRowCount(0);
        Object[] row = new Object[8];
        
        
          
        for (int i = 0; i < trips.size(); i++) {
          for (int j = 1; j <=riderTrip.size(); j++) {
            row[j]=riderTrip.get(j-1).getname();
        }
            Vehicle vehicle=Database_Queries.DDL().selectVehicle( trips.get(i).getVehicleID());
            row[0] = trips.get(i).getDriverName();
             row[4] = vehicle.getType();
            
         
             row[5] = trips.get(i).getTime();
             row[6] = trips.get(i).getStops();
            row[7] = (riderTrip.size())*Integer.parseInt(trips.get(i).getAmountPerHour());
            model.addRow(row);
           }
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TripsPanel = new javax.swing.JPanel();
        lblheading = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        TripsScroll = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Trips = new javax.swing.JTable();
        lblWelcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_TripsDetails = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TripsPanel.setBackground(new java.awt.Color(255, 255, 255));
        TripsPanel.setForeground(new java.awt.Color(0, 51, 51));
        TripsPanel.setLayout(null);

        lblheading.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblheading.setText("View Trips");
        TripsPanel.add(lblheading);
        lblheading.setBounds(380, 10, 200, 30);

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(155, 113, 113));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        TripsPanel.add(btnBack);
        btnBack.setBounds(820, 10, 110, 30);

        TripsScroll.setBackground(new java.awt.Color(36, 37, 130));

        jTable_Trips.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 174, 174)));
        jTable_Trips.setForeground(new java.awt.Color(170, 91, 91));
        jTable_Trips.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trip ID", "Source", "Destination", "Travel Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Trips.setGridColor(new java.awt.Color(230, 67, 123));
        jTable_Trips.setSelectionBackground(new java.awt.Color(213, 141, 166));
        jTable_Trips.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TripsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Trips);
        if (jTable_Trips.getColumnModel().getColumnCount() > 0) {
            jTable_Trips.getColumnModel().getColumn(0).setResizable(false);
            jTable_Trips.getColumnModel().getColumn(0).setHeaderValue("Trip ID");
        }

        TripsScroll.setViewportView(jScrollPane2);

        TripsPanel.add(TripsScroll);
        TripsScroll.setBounds(20, 50, 910, 240);

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblWelcome.setText("Welcome ");
        TripsPanel.add(lblWelcome);
        lblWelcome.setBounds(40, 10, 140, 20);
        TripsPanel.add(jLabel1);
        jLabel1.setBounds(790, 150, 0, 0);

        jTable_TripsDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 174, 174)));
        jTable_TripsDetails.setForeground(new java.awt.Color(170, 91, 91));
        jTable_TripsDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Driver Name", "Rider 1 Name", "Rider 2 Name", "Rider 3 Name", "Vehicle Type", "Start Time", "Stops", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_TripsDetails.setGridColor(new java.awt.Color(230, 67, 123));
        jTable_TripsDetails.setSelectionBackground(new java.awt.Color(213, 141, 166));
        jTable_TripsDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TripsDetailsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_TripsDetails);

        TripsPanel.add(jScrollPane3);
        jScrollPane3.setBounds(20, 360, 900, 90);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Trip Details");
        TripsPanel.add(jLabel2);
        jLabel2.setBounds(30, 310, 140, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/car1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        TripsPanel.add(jLabel3);
        jLabel3.setBounds(-5, -4, 960, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TripsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TripsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_TripsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TripsMouseClicked
        int i = jTable_Trips.getSelectedRow();
        TableModel model = jTable_Trips.getModel();
       tripID=Integer.parseInt(model.getValueAt(i, 0).toString());
    ArrayList<DriverTrip> driverTripDetails=new ArrayList<DriverTrip>();
      driverTripDetails = Database_Queries.DDL().selectAllDriverTrips(tripID,"Rider",null,null);
      ArrayList<RiderTrip> riderTripDetails=new ArrayList<RiderTrip>();
      riderTripDetails = Database_Queries.DDL().selectAllRidersTrips(0,tripID);
      Show_Details(driverTripDetails,riderTripDetails);
        
    }//GEN-LAST:event_jTable_TripsMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        this.dispose();
        
            AdminHomeGUI home=new AdminHomeGUI();
            home.setVisible(true);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void jTable_TripsDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TripsDetailsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_TripsDetailsMouseClicked

    int tripID = 0;
    

    Members mem;

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAllTripsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TripsPanel;
    private javax.swing.JScrollPane TripsScroll;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_Trips;
    private javax.swing.JTable jTable_TripsDetails;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblheading;
    // End of variables declaration//GEN-END:variables
}
