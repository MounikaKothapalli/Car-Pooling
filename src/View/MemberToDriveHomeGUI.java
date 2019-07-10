package View;

import Model.Members;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


/**
 *
 * @author mounikakothapalli
 */
public class MemberToDriveHomeGUI extends javax.swing.JFrame {
GridBagLayout layout = new GridBagLayout();
RegisterVehicleGUI registerVehicle;
    public MemberToDriveHomeGUI() {
        super("DriveHome");
        initComponents();
    }

    public MemberToDriveHomeGUI(Members mem) {
        super("MemberToDriveHome");
        setSize(940, 400);
        initComponents();
        setResizable(false); // frame can't be resized
        setLocationRelativeTo(null); // set frame at center of screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //default exist when prexx X icon
        this.mem = mem;
        lblWelcome.setText("Welcome " + this.mem.getName());
        if(mem.getSubscribe()==0){
            btnViewNotifications.setVisible(false);
        }
       

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homePnel = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnRegisterVehicle = new javax.swing.JButton();
        btnPublishRide = new javax.swing.JButton();
        btnManageMyVehicle = new javax.swing.JButton();
        btntripsHistory = new javax.swing.JButton();
        btnViewNotifications = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnUpdateMydetails = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homePnel.setBackground(new java.awt.Color(0, 0, 0));
        homePnel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblWelcome.setText("Welcome");
        homePnel.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 15, -1, -1));

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(206, 135, 135));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        homePnel.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 76, -1));

        btnRegisterVehicle.setBackground(new java.awt.Color(255, 255, 255));
        btnRegisterVehicle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRegisterVehicle.setForeground(new java.awt.Color(206, 135, 135));
        btnRegisterVehicle.setText("Register My Vehicle");
        btnRegisterVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterVehicleActionPerformed(evt);
            }
        });
        homePnel.add(btnRegisterVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 320, 50));

        btnPublishRide.setBackground(new java.awt.Color(255, 255, 255));
        btnPublishRide.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPublishRide.setForeground(new java.awt.Color(206, 135, 135));
        btnPublishRide.setText("Publish a Ride");
        btnPublishRide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublishRideActionPerformed(evt);
            }
        });
        homePnel.add(btnPublishRide, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 320, 50));

        btnManageMyVehicle.setBackground(new java.awt.Color(255, 255, 255));
        btnManageMyVehicle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnManageMyVehicle.setForeground(new java.awt.Color(206, 135, 135));
        btnManageMyVehicle.setText("Manage All My Registered Vehicles");
        btnManageMyVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMyVehicleActionPerformed(evt);
            }
        });
        homePnel.add(btnManageMyVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 320, 50));

        btntripsHistory.setBackground(new java.awt.Color(255, 255, 255));
        btntripsHistory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btntripsHistory.setForeground(new java.awt.Color(206, 135, 135));
        btntripsHistory.setText("Manage My Trips");
        btntripsHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntripsHistoryActionPerformed(evt);
            }
        });
        homePnel.add(btntripsHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 320, 50));

        btnViewNotifications.setBackground(new java.awt.Color(255, 255, 255));
        btnViewNotifications.setForeground(new java.awt.Color(206, 135, 135));
        btnViewNotifications.setText("View Notifications");
        btnViewNotifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewNotificationsActionPerformed(evt);
            }
        });
        homePnel.add(btnViewNotifications, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 320, 50));
        homePnel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 430, -1, -1));

        btnUpdateMydetails.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateMydetails.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnUpdateMydetails.setForeground(new java.awt.Color(206, 135, 135));
        btnUpdateMydetails.setText("Update My Details");
        btnUpdateMydetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMydetailsActionPerformed(evt);
            }
        });
        homePnel.add(btnUpdateMydetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 320, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/car1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        homePnel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 940, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewNotificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewNotificationsActionPerformed
NotificationsGUI notification=new NotificationsGUI(mem);
this.setVisible(false);
notification.setVisible(true);
    }//GEN-LAST:event_btnViewNotificationsActionPerformed

    private void btntripsHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntripsHistoryActionPerformed
ManageDriverTripsGUI driverTrips=new ManageDriverTripsGUI(mem);
this.setVisible(false);
driverTrips.setVisible(true);
    }//GEN-LAST:event_btntripsHistoryActionPerformed

    private void btnManageMyVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMyVehicleActionPerformed
    ManageVehiclesGUI manageVehicle=new ManageVehiclesGUI(this.mem);
    this.setVisible(false);
    manageVehicle.setVisible(true);
    }//GEN-LAST:event_btnManageMyVehicleActionPerformed

    private void btnPublishRideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublishRideActionPerformed
PublishRideGUI publishRide=new PublishRideGUI(this.mem);
    this.setVisible(false);
        publishRide.setVisible(true);
    }//GEN-LAST:event_btnPublishRideActionPerformed

    private void btnRegisterVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterVehicleActionPerformed
    RegisterVehicleGUI registerVehicle=new RegisterVehicleGUI(this.mem);
    this.setVisible(false);
        registerVehicle.setVisible(true);
    }//GEN-LAST:event_btnRegisterVehicleActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.setVisible(false);
        this.dispose();
        HomeGUI home = new HomeGUI();
        home.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnUpdateMydetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMydetailsActionPerformed
        // TODO add your handling code here:
        UpdateMyDetailsGUI update=new UpdateMyDetailsGUI(this.mem);
this.setVisible(false);
update.setVisible(true);
    }//GEN-LAST:event_btnUpdateMydetailsActionPerformed

    Members mem;

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberToDriveHomeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageMyVehicle;
    private javax.swing.JButton btnPublishRide;
    private javax.swing.JButton btnRegisterVehicle;
    private javax.swing.JButton btnUpdateMydetails;
    private javax.swing.JButton btnViewNotifications;
    private javax.swing.JButton btntripsHistory;
    private javax.swing.JPanel homePnel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
