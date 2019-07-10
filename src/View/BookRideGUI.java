package View;

import Controller.Database_Queries;
import Model.DriverTrip;
import Model.IDriver;
import Model.IRiderTrip;
import Model.Members;
import Model.RiderTrip;
import Model.Vehicle;
import com.toedter.calendar.JDateChooser;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author mounikakothapalli
 */
public class BookRideGUI  extends javax.swing.JFrame {

    IRiderTrip riderModel;
    IDriver driverModel;
    Database_Queries controller;
    public BookRideGUI() {
        initComponents();
    }

    public BookRideGUI(Members mem) {
        super("Book A Ride");
        initComponents();
        this.mem = mem;
        setSize(960, 500);  //set size of frame
        setResizable(false); // frame can't be resized
        setLocationRelativeTo(null); // set frame at center of screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //default exist when prexx X icon
        jTable_Trips.setFillsViewportHeight(true);
         JDateChooser dateChooser = new JDateChooser();
         Date d=new Date();
         SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy");
         
        dateChooser.setSelectableDateRange(new Date(sdf.format(d)),new Date(sdf.format(d)));
            lblWelcome.setText("Welcome " + mem.getName());
            
    }

    private void show_Trips() {
         ArrayList<DriverTrip> trips=new ArrayList<DriverTrip>();
        java.util.Date d = dateTravel.getDate();
        java.sql.Date sDate = new java.sql.Date(d.getTime());
       trips = Database_Queries.DDL().selectAllDriverTrips(0,txtFrom.getText(),txtTo.getText(),sDate);
        
        DefaultTableModel model = (DefaultTableModel) jTable_Trips.getModel();
        model.setRowCount(0);
        Object[] row = new Object[11];
        if(trips.size()==0){
            JOptionPane.showMessageDialog(null, "No Rides Found for the Enered details");
            return;
        }
        for (int i = 0; i < trips.size(); i++) {
           
            Vehicle vehicle=Database_Queries.DDL().selectVehicle( trips.get(i).getVehicleID());
            row[0] = trips.get(i).getTripID();
            row[1] = trips.get(i).getDriverID();
            row[2] = trips.get(i).getDriverName();
            
            row[3] = trips.get(i).getSource();
            row[4] = trips.get(i).getDestination();
            row[5] = trips.get(i).getTime();
            row[6] = trips.get(i).getSlotsAvailable();
            row[7] = trips.get(i).getAmountPerHour();
            row[8] = trips.get(i).getStops();
            row[9] = vehicle.getType();
            row[10] = trips.get(i).getStatus();
            model.addRow(row);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookRidePanel = new javax.swing.JPanel();
        lblheading = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        equipmentScroll = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Trips = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTo = new javax.swing.JLabel();
        txtSource = new javax.swing.JLabel();
        txtFrom = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        dateTravel = new com.toedter.calendar.JDateChooser();
        btnBookRide = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bookRidePanel.setBackground(new java.awt.Color(255, 255, 255));
        bookRidePanel.setForeground(new java.awt.Color(0, 51, 51));
        bookRidePanel.setLayout(null);

        lblheading.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblheading.setText("Choose Ride");
        bookRidePanel.add(lblheading);
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
        bookRidePanel.add(btnBack);
        btnBack.setBounds(820, 10, 110, 30);

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(155, 113, 113));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        bookRidePanel.add(btnSearch);
        btnSearch.setBounds(300, 140, 110, 40);

        equipmentScroll.setBackground(new java.awt.Color(36, 37, 130));

        jTable_Trips.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 174, 174)));
        jTable_Trips.setForeground(new java.awt.Color(170, 91, 91));
        jTable_Trips.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TripID", "Driver ID", "Driver Name", "From", "To", "Time", "Slots Available", "Amount Charged", "Stops", "Vehicle", "Status"
            }
        ));
        jTable_Trips.setGridColor(new java.awt.Color(230, 67, 123));
        jTable_Trips.setSelectionBackground(new java.awt.Color(213, 141, 166));
        jTable_Trips.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TripsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Trips);
        if (jTable_Trips.getColumnModel().getColumnCount() > 0) {
            jTable_Trips.getColumnModel().getColumn(2).setResizable(false);
            jTable_Trips.getColumnModel().getColumn(5).setResizable(false);
        }

        equipmentScroll.setViewportView(jScrollPane2);

        bookRidePanel.add(equipmentScroll);
        equipmentScroll.setBounds(20, 200, 920, 220);

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(155, 113, 113));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        bookRidePanel.add(btnClear);
        btnClear.setBounds(450, 140, 110, 40);

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblWelcome.setText("Welcome ");
        bookRidePanel.add(lblWelcome);
        lblWelcome.setBounds(40, 10, 140, 20);
        bookRidePanel.add(jLabel1);
        jLabel1.setBounds(790, 150, 0, 0);

        lblTo.setText("To");
        bookRidePanel.add(lblTo);
        lblTo.setBounds(320, 80, 70, 20);

        txtSource.setText("From");
        bookRidePanel.add(txtSource);
        txtSource.setBounds(80, 80, 90, 14);

        txtFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromActionPerformed(evt);
            }
        });
        bookRidePanel.add(txtFrom);
        txtFrom.setBounds(130, 80, 150, 20);

        lblDate.setText("Date");
        bookRidePanel.add(lblDate);
        lblDate.setBounds(550, 80, 60, 20);
        bookRidePanel.add(txtTo);
        txtTo.setBounds(370, 80, 150, 20);

        dateTravel.setDate(new Date());
        dateTravel.setMaxSelectableDate(new java.util.Date(253370786514000L));
        dateTravel.setMinSelectableDate(new Date());
        bookRidePanel.add(dateTravel);
        dateTravel.setBounds(610, 80, 150, 20);

        btnBookRide.setForeground(new java.awt.Color(155, 113, 113));
        btnBookRide.setText("Book Ride");
        btnBookRide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookRideActionPerformed(evt);
            }
        });
        bookRidePanel.add(btnBookRide);
        btnBookRide.setBounds(380, 430, 120, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/car1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        bookRidePanel.add(jLabel2);
        jLabel2.setBounds(-5, -4, 970, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookRidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookRidePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFromActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtTo.setText("");
        txtFrom.setText("");
        dateTravel.setDate(new Date());

    }//GEN-LAST:event_btnClearActionPerformed

    private void jTable_TripsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TripsMouseClicked
        int i = jTable_Trips.getSelectedRow();
        TableModel model = jTable_Trips.getModel();
        java.util.Date d = dateTravel.getDate();
        java.sql.Date sDate = new java.sql.Date(d.getTime());
        tripRide=new RiderTrip(Integer.parseInt(model.getValueAt(i, 0).toString()),this.mem.getMemberID(),
                txtFrom.getText(),txtTo.getText(),model.getValueAt(i, 5).toString(),
                model.getValueAt(i, 7).toString(),"Active",sDate,this.mem.getName(),this.mem.getMobile(),
                model.getValueAt(i, 6).toString());
      
       
       

    }//GEN-LAST:event_jTable_TripsMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
      
        String from = txtFrom.getText();
        String to = txtTo.getText();
       java.util.Date  d = dateTravel.getDate();
              
        java.sql.Date sDate = new java.sql.Date(d.getTime());
        String validationMessage = "";
        if (from.trim ()
            .isEmpty()) {
            validationMessage += "From is Empty";
        }
        if (to.trim().isEmpty()) {
            validationMessage += "\nTo is Empty";
        }

        if (sDate==null) {
            validationMessage += "\nDate is Empty";
        }
       
        if (validationMessage

            != "") {
            JOptionPane.showMessageDialog(null, validationMessage);
            return; // end method
        }

        //search if user exists with same email or mobile number
       show_Trips();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        this.dispose();
        
            MemberToRideHomeGUI home=new MemberToRideHomeGUI(mem);
            home.setVisible(true);
        

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBookRideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookRideActionPerformed
        // TODO add your handling code here:
       boolean isSuccess= Database_Queries.DML().InsertBookingInfo(this.tripRide);
       if(isSuccess){
          if(Database_Queries.DML().UpdateTrip(this.tripRide.getTripID(),Integer.parseInt(this.tripRide.getSlotsAvailable()),"Active")) {
              JOptionPane.showMessageDialog(null, "Booked your Ride Successfully.Your Booking ID: "+this.tripRide.getTripID());
              this.setVisible(false);
                MemberToRideHomeGUI home=new MemberToRideHomeGUI(mem);
            home.setVisible(true);
          }
       }
       else{
             JOptionPane.showMessageDialog(null, "There is Some Problem in Booking. Please Try Again");
       }
    }//GEN-LAST:event_btnBookRideActionPerformed

    
    
RiderTrip tripRide ;
    Members mem;

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookRideGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bookRidePanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookRide;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSearch;
    private com.toedter.calendar.JDateChooser dateTravel;
    private javax.swing.JScrollPane equipmentScroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Trips;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTo;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblheading;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JLabel txtSource;
    private javax.swing.JTextField txtTo;
    // End of variables declaration//GEN-END:variables
}
