package View;

import Model.Members;


/**
 *
 * @author mounikakothapalli
 */
public class MemberToRideHomeGUI extends javax.swing.JFrame {

    public MemberToRideHomeGUI() {
        initComponents();

    }

    public MemberToRideHomeGUI(Members mem) {
        super("MemberToRideHome");
        setSize(900, 400);
        initComponents();
        setResizable(false); // frame can't be resized
        setLocationRelativeTo(null); // set frame at center of screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //default exist when prexx X icon
        this.mem = mem;
        lblWelcome.setText("Welcome " + mem.getName());
        if(mem.getSubscribe()==0){
            btnViewNotifications.setVisible(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MemHomePanel = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnChooseRide = new javax.swing.JButton();
        btnManageMyRides = new javax.swing.JButton();
        btnUpdateMyDetails = new javax.swing.JButton();
        btnViewNotifications = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MemHomePanel.setBackground(new java.awt.Color(0, 0, 0));
        MemHomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblWelcome.setText("Welcome");
        MemHomePanel.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 15, -1, -1));

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(206, 135, 135));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        MemHomePanel.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 76, -1));

        btnChooseRide.setBackground(new java.awt.Color(255, 255, 255));
        btnChooseRide.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnChooseRide.setForeground(new java.awt.Color(206, 135, 135));
        btnChooseRide.setText("Choose A Ride");
        btnChooseRide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseRideActionPerformed(evt);
            }
        });
        MemHomePanel.add(btnChooseRide, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 280, 50));

        btnManageMyRides.setBackground(new java.awt.Color(255, 255, 255));
        btnManageMyRides.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnManageMyRides.setForeground(new java.awt.Color(206, 135, 135));
        btnManageMyRides.setText("Manage My Booked Rides");
        btnManageMyRides.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMyRidesActionPerformed(evt);
            }
        });
        MemHomePanel.add(btnManageMyRides, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 280, 50));

        btnUpdateMyDetails.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateMyDetails.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUpdateMyDetails.setForeground(new java.awt.Color(206, 135, 135));
        btnUpdateMyDetails.setText("Update My Details");
        btnUpdateMyDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMyDetailsActionPerformed(evt);
            }
        });
        MemHomePanel.add(btnUpdateMyDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 280, 50));

        btnViewNotifications.setBackground(new java.awt.Color(255, 255, 255));
        btnViewNotifications.setForeground(new java.awt.Color(206, 135, 135));
        btnViewNotifications.setText("View Notifications");
        btnViewNotifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewNotificationsActionPerformed(evt);
            }
        });
        MemHomePanel.add(btnViewNotifications, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 280, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/car1.jpg"))); // NOI18N
        MemHomePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -10, 980, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MemHomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MemHomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChooseRideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseRideActionPerformed
BookRideGUI bookRide=new BookRideGUI(this.mem);
this.setVisible(false);
bookRide.setVisible(true);
    }//GEN-LAST:event_btnChooseRideActionPerformed

    private void btnManageMyRidesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMyRidesActionPerformed
       ManageRiderTripsGUI rides=new ManageRiderTripsGUI(this.mem);
this.setVisible(false);
rides.setVisible(true);
    }//GEN-LAST:event_btnManageMyRidesActionPerformed

    private void btnUpdateMyDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMyDetailsActionPerformed
         UpdateMyDetailsGUI update=new UpdateMyDetailsGUI(mem);
this.setVisible(false);
update.setVisible(true);
    }//GEN-LAST:event_btnUpdateMyDetailsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.setVisible(false);
        this.dispose();
        HomeGUI home = new HomeGUI();
        home.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnViewNotificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewNotificationsActionPerformed
     NotificationsGUI notification=new NotificationsGUI(mem);
this.setVisible(false);
notification.setVisible(true);
    }//GEN-LAST:event_btnViewNotificationsActionPerformed

    Members mem;

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberToRideHomeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MemHomePanel;
    private javax.swing.JButton btnChooseRide;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageMyRides;
    private javax.swing.JButton btnUpdateMyDetails;
    private javax.swing.JButton btnViewNotifications;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
