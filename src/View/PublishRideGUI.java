package View;

import Controller.Database_Queries;

import Model.DriverTrip;
import Model.Members;

import Model.Vehicle;
import com.toedter.calendar.JDateChooser;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JOptionPane;


/**
 *
 * @author mounikakothapalli
 */

public class PublishRideGUI extends javax.swing.JFrame {

    public PublishRideGUI() {
        initComponents();
    }

    public PublishRideGUI(Members mem) {
        initComponents();
         setSize(970, 540);  //set size of frame
        setResizable(false); // frame can't be resized
        setLocationRelativeTo(null); // set frame at center of screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //default exist when prexx X icon

       this.mem=mem;
       JDateChooser dateChooser = new JDateChooser();
        dateChooser.setDate(new Date());
        dateChooser.getJCalendar().setMinSelectableDate(new Date());
       lblWelcome.setText("Welcome " + this.mem.getName());
       ArrayList<Vehicle> vehicles = Database_Queries.DDL().selectMyVehicles(this.mem.getMemberID());
       ArrayList<String> vehicleValues=new ArrayList<String>();
       for (Vehicle vehicle : vehicles

    
        ) { 
           
            vehicleValues.add(vehicle.getVehicleId() +"-"+vehicle.getMake());
    }
      combotravelvehicle.setModel(new DefaultComboBoxModel(vehicleValues.toArray()));
       
    }

    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        publishTripPanel = new javax.swing.JPanel();
        lblheading = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnPublish = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSource = new javax.swing.JLabel();
        txtSource = new javax.swing.JTextField();
        lbltravelTime = new javax.swing.JLabel();
        txttravelTime = new javax.swing.JTextField();
        lblslotsAvailable = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDestination = new javax.swing.JTextField();
        lbltravelvehicle = new javax.swing.JLabel();
        combotravelvehicle = new javax.swing.JComboBox<>();
        lblamountPerPerson = new javax.swing.JLabel();
        txtamountPerPerson = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();
        dateTravel = new com.toedter.calendar.JDateChooser();
        lblTravelDate = new javax.swing.JLabel();
        lblStops = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaStops = new javax.swing.JTextArea();
        comboSlots = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        publishTripPanel.setBackground(new java.awt.Color(255, 255, 255));
        publishTripPanel.setForeground(new java.awt.Color(0, 51, 51));
        publishTripPanel.setLayout(null);

        lblheading.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblheading.setText("Publish Trip");
        publishTripPanel.add(lblheading);
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
        publishTripPanel.add(btnBack);
        btnBack.setBounds(820, 10, 110, 30);

        btnPublish.setBackground(new java.awt.Color(255, 255, 255));
        btnPublish.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPublish.setForeground(new java.awt.Color(155, 113, 113));
        btnPublish.setText("Publish");
        btnPublish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublishActionPerformed(evt);
            }
        });
        publishTripPanel.add(btnPublish);
        btnPublish.setBounds(290, 430, 110, 40);

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(155, 113, 113));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        publishTripPanel.add(btnClear);
        btnClear.setBounds(550, 430, 110, 40);

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblWelcome.setText("Welcome ");
        publishTripPanel.add(lblWelcome);
        lblWelcome.setBounds(40, 10, 140, 20);
        publishTripPanel.add(jLabel1);
        jLabel1.setBounds(790, 150, 0, 0);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("* Stops Should be seperated with comma(s) all Caps and should be in single quotes");
        publishTripPanel.add(jLabel2);
        jLabel2.setBounds(160, 410, 550, 14);

        lblSource.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblSource.setText("Source");
        publishTripPanel.add(lblSource);
        lblSource.setBounds(170, 70, 80, 30);

        txtSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSourceActionPerformed(evt);
            }
        });
        publishTripPanel.add(txtSource);
        txtSource.setBounds(300, 70, 150, 30);

        lbltravelTime.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lbltravelTime.setText("Time of Travel");
        publishTripPanel.add(lbltravelTime);
        lbltravelTime.setBounds(170, 130, 130, 24);

        txttravelTime.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txttravelTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttravelTimeActionPerformed(evt);
            }
        });
        publishTripPanel.add(txttravelTime);
        txttravelTime.setBounds(300, 130, 150, 30);

        lblslotsAvailable.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblslotsAvailable.setText("Seats Avialable");
        publishTripPanel.add(lblslotsAvailable);
        lblslotsAvailable.setBounds(170, 190, 140, 24);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Destination");
        publishTripPanel.add(jLabel4);
        jLabel4.setBounds(520, 70, 100, 24);
        publishTripPanel.add(txtDestination);
        txtDestination.setBounds(690, 70, 150, 30);

        lbltravelvehicle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lbltravelvehicle.setText("Travel Vehicle");
        publishTripPanel.add(lbltravelvehicle);
        lbltravelvehicle.setBounds(520, 130, 130, 20);

        combotravelvehicle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Vehicle" }));
        combotravelvehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotravelvehicleActionPerformed(evt);
            }
        });
        publishTripPanel.add(combotravelvehicle);
        combotravelvehicle.setBounds(690, 130, 150, 20);

        lblamountPerPerson.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblamountPerPerson.setText("Amount Per Person");
        publishTripPanel.add(lblamountPerPerson);
        lblamountPerPerson.setBounds(520, 190, 180, 24);
        publishTripPanel.add(txtamountPerPerson);
        txtamountPerPerson.setBounds(690, 180, 160, 30);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Status");
        publishTripPanel.add(jLabel3);
        jLabel3.setBounds(170, 250, 60, 20);

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Active", "Cancelled" }));
        publishTripPanel.add(comboStatus);
        comboStatus.setBounds(300, 250, 150, 20);

        dateTravel.setDate(new Date());
        dateTravel.setMinSelectableDate(new Date());
        publishTripPanel.add(dateTravel);
        dateTravel.setBounds(700, 236, 150, 30);

        lblTravelDate.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTravelDate.setText("Travel Date");
        publishTripPanel.add(lblTravelDate);
        lblTravelDate.setBounds(520, 240, 110, 20);

        lblStops.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblStops.setText("Stops");
        publishTripPanel.add(lblStops);
        lblStops.setBounds(170, 320, 70, 24);

        txtAreaStops.setColumns(20);
        txtAreaStops.setRows(5);
        jScrollPane1.setViewportView(txtAreaStops);

        publishTripPanel.add(jScrollPane1);
        jScrollPane1.setBounds(300, 300, 166, 96);

        comboSlots.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Seats", "3", "2", "1" }));
        publishTripPanel.add(comboSlots);
        comboSlots.setBounds(300, 190, 160, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/car1.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        publishTripPanel.add(jLabel5);
        jLabel5.setBounds(-15, -4, 1000, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(publishTripPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(publishTripPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
         txtSource.setText("");
        txttravelTime.setText("");
        comboSlots.setSelectedIndex(0);
        txtDestination.setText("");
        combotravelvehicle.setSelectedIndex(0);
        txtamountPerPerson.setText("");
        comboStatus.setSelectedIndex(0);
        txtAreaStops.setText("");
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnPublishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublishActionPerformed

        String source = txtSource.getText();
        String traveltime = txttravelTime.getText();
        String slotsAvailable = comboSlots.getItemCount() > 1 ? comboSlots.getSelectedItem().toString() : "";
        String destination = txtDestination.getText();
        String vh = combotravelvehicle.getItemCount() > 0 ? combotravelvehicle.getSelectedItem().toString() : "";
        int vehicleID=Integer.parseInt(vh.split("-")[0]);
        String status = comboStatus.getItemCount() > 1? comboStatus.getSelectedItem().toString() : "";
        String amountPerPerson=txtamountPerPerson.getText();
        String stops=txtAreaStops.getText();
        java.util.Date d = dateTravel.getDate();
        java.sql.Date sDate = new java.sql.Date(d.getTime());
        
        String validationMessage = "";
        
        
        if (d == null) {
            validationMessage+="No Date Specified";
        }
        
        
        if (source.trim().isEmpty()) {
            validationMessage += "source is Empty";
        }

        if (destination.trim().isEmpty()) {
            validationMessage += "\ndestination is Empty";
        }
        if (traveltime.trim().isEmpty()) {
            validationMessage += "\ntraveltime is Empty";
        }

    if (slotsAvailable.trim () =="Select Seats") {
            validationMessage += "\nsSeats Available Must be Selected";
    }
if(status.trim()=="Select"){
    validationMessage += "\nsStatus Must be Selected";
}
if(vh.trim()=="Select Vehicle"){
    validationMessage += "\nsTravel Vehicle Must be Selected";
}
    if (amountPerPerson.trim () 
        .isEmpty()) {
            validationMessage += "\namountPerPerson is Empty";
    }

    
    if (validationMessage

    
        != "") {
            JOptionPane.showMessageDialog(null, validationMessage);
        return; // end method
    }

    
    //search if user exists with same email or mobile number 
    ArrayList<DriverTrip> trips = Database_Queries.DDL().selectAllDriverTrips(this.mem.getMemberID(),null,null,null);
    for (DriverTrip trip : trips

    
        ) { 
            if (vehicleID==trip.getVehicleID() && d.equals(trip.getTravelDate())) { // if match found
            JOptionPane.showMessageDialog(this, "Vehicle Selected is already booked for another trip on the same date"); // then show error meesage
            return;
        }
           

    }

        DriverTrip trip = new DriverTrip(mem.getMemberID(), vehicleID,mem.getName(),mem.getMobile(),source.toUpperCase(), destination.toUpperCase(), traveltime, amountPerPerson, slotsAvailable,status,stops,sDate);

    trip.setTripID(Database_Queries.DML().InsertTrip(trip));
    JOptionPane.showMessageDialog (this, 
    "Your Trip has been Published successfully with Trip ID: " + trip.getTripID());

        MemberToDriveHomeGUI home = new MemberToDriveHomeGUI(this.mem);
this.setVisible(false);
    home.setVisible (true);
    
    }//GEN-LAST:event_btnPublishActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       // TODO add your handling code here:
         MemberToDriveHomeGUI home = new MemberToDriveHomeGUI(this.mem);
           this.setVisible(false);
          home.setVisible (true);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSourceActionPerformed

    private void txttravelTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttravelTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttravelTimeActionPerformed

    private void combotravelvehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotravelvehicleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combotravelvehicleActionPerformed

 Members mem;

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PublishRideGUI().setVisible(true);
            }
        });
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnPublish;
    private javax.swing.JComboBox<String> comboSlots;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JComboBox<String> combotravelvehicle;
    private com.toedter.calendar.JDateChooser dateTravel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSource;
    private javax.swing.JLabel lblStops;
    private javax.swing.JLabel lblTravelDate;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblamountPerPerson;
    private javax.swing.JLabel lblheading;
    private javax.swing.JLabel lblslotsAvailable;
    private javax.swing.JLabel lbltravelTime;
    private javax.swing.JLabel lbltravelvehicle;
    private javax.swing.JPanel publishTripPanel;
    private javax.swing.JTextArea txtAreaStops;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtSource;
    private javax.swing.JTextField txtamountPerPerson;
    private javax.swing.JTextField txttravelTime;
    // End of variables declaration//GEN-END:variables
}
