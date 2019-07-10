package View;

import Model.IAdmin;


/**
 *
 * @author mounikakothapalli
 */
public class AdminHomeGUI extends javax.swing.JFrame {

     
    IAdmin model;
    public AdminHomeGUI() {
        super("AdminHome");
        initComponents();
        setSize(940, 500);  //set size of frame
        setResizable(false); // frame can't be resized
        setLocationRelativeTo(null); // set frame at center of screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //default exist when prexx X icon
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminHomePanel = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnMembersManagement = new javax.swing.JButton();
        btnVehicleManagement = new javax.swing.JButton();
        btnViewTrips = new javax.swing.JButton();
        btnManageNotifications = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(36, 37, 130));

        adminHomePanel.setBackground(new java.awt.Color(0, 0, 0));
        adminHomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblWelcome.setBackground(new java.awt.Color(36, 37, 130));
        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblWelcome.setText("Welcome Admin");
        adminHomePanel.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 15, -1, -1));

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(206, 135, 135));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        adminHomePanel.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        btnMembersManagement.setBackground(new java.awt.Color(255, 255, 255));
        btnMembersManagement.setForeground(new java.awt.Color(206, 135, 135));
        btnMembersManagement.setText("Manage Members");
        btnMembersManagement.setToolTipText("");
        btnMembersManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMembersManagementActionPerformed(evt);
            }
        });
        adminHomePanel.add(btnMembersManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 165, 100));

        btnVehicleManagement.setBackground(new java.awt.Color(255, 255, 255));
        btnVehicleManagement.setForeground(new java.awt.Color(206, 135, 135));
        btnVehicleManagement.setText("Manage Vehicles");
        btnVehicleManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehicleManagementActionPerformed(evt);
            }
        });
        adminHomePanel.add(btnVehicleManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 165, 100));

        btnViewTrips.setBackground(new java.awt.Color(255, 255, 255));
        btnViewTrips.setForeground(new java.awt.Color(206, 135, 135));
        btnViewTrips.setText("View Trips");
        btnViewTrips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTripsActionPerformed(evt);
            }
        });
        adminHomePanel.add(btnViewTrips, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 165, 100));

        btnManageNotifications.setBackground(new java.awt.Color(255, 255, 255));
        btnManageNotifications.setForeground(new java.awt.Color(206, 135, 135));
        btnManageNotifications.setText("Manage Notifications");
        btnManageNotifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNotificationsActionPerformed(evt);
            }
        });
        adminHomePanel.add(btnManageNotifications, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 165, 100));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/car1.jpg"))); // NOI18N
        Background.setText("jLabel1");
        Background.setToolTipText("");
        adminHomePanel.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminHomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminHomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here
        this.setVisible(false);
        this.dispose();
        HomeGUI home = new HomeGUI();
        home.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnVehicleManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehicleManagementActionPerformed
        
       ManageVehiclesGUI vehicleGUI=new ManageVehiclesGUI(null);
        this.setVisible(false);
        vehicleGUI.setVisible(true);
    }//GEN-LAST:event_btnVehicleManagementActionPerformed

    private void btnMembersManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembersManagementActionPerformed
        
        ManageMembersGUI memberGUI=new ManageMembersGUI(null);
        this.setVisible(false);
        memberGUI.setVisible(true);
        
    }//GEN-LAST:event_btnMembersManagementActionPerformed

    private void btnManageNotificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNotificationsActionPerformed
         NotificationsGUI noteGUI=new NotificationsGUI(null);
         this.setVisible(false);
         noteGUI.setVisible(true);
    }//GEN-LAST:event_btnManageNotificationsActionPerformed

    private void btnViewTripsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTripsActionPerformed
             ViewAllTripsGUI viewTrips=new ViewAllTripsGUI();
         this.setVisible(false);
         viewTrips.setVisible(true);
    }//GEN-LAST:event_btnViewTripsActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel adminHomePanel;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageNotifications;
    private javax.swing.JButton btnMembersManagement;
    private javax.swing.JButton btnVehicleManagement;
    private javax.swing.JButton btnViewTrips;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
