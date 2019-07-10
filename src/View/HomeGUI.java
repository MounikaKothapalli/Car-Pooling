package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author mounikakothapalli
 */
public  class HomeGUI extends javax.swing.JFrame {
 GridBagLayout layout = new GridBagLayout();
    
    SignUpDriveGUI registerDrive;
    SignUpRideGUI registerRide;
    AdminLoginGUI admin;
    MemberLoginGUI login;
    KnowUsGUI aboutUs;
    public HomeGUI() {
        super("AdminHome");
        initComponents();
        setSize(940, 500);  //set size of frame
        setResizable(false); // frame can't be resized
        setLocationRelativeTo(null); // set frame at center of screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //default exist when prexx X icon
        btnMemberLogin.setVisible(true);
        btnDriveSignUp.setVisible(true);
        btnRideSignUp.setVisible(true);
        btnAdminLogin.setVisible(true);
        btnKnowUs.setVisible(true);
        
        // Setting Panels
        
       registerDrive = new SignUpDriveGUI();
        registerRide = new SignUpRideGUI();
        login = new MemberLoginGUI();
        admin = new AdminLoginGUI();
        aboutUs=new KnowUsGUI();
        DynamicPanel.setLayout(layout);
DynamicPanel.setBackground(new Color(0,0,0,0));

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        login.setPreferredSize(new Dimension(1600, 1600));
        login.setBackground(new Color(0,0,0,0));
       c.anchor = GridBagConstraints.NORTHWEST;
        c.weightx = 2;
        c.weighty = 1;

        DynamicPanel.add(login, c);
        
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        registerDrive.setPreferredSize(new Dimension(1600, 1600));
       //  registerDrive.setBackground(new Color(0,0,0,0));
        c.anchor = GridBagConstraints.NORTHWEST;
        c.weightx = 2;
        c.weighty = 1;
        DynamicPanel.add(registerDrive, c);
        
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        registerRide.setPreferredSize(new Dimension(1600, 1600));
       //  registerRide.setBackground(new Color(0,0,0,0));
        c.anchor = GridBagConstraints.NORTHWEST;
        c.weightx = 2;
        c.weighty = 1;
        DynamicPanel.add(registerRide, c);
       
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        aboutUs.setPreferredSize(new Dimension(1600, 1600));
       //  aboutUs.setBackground(new Color(0,0,0,0));
        c.anchor = GridBagConstraints.NORTHWEST;
        c.weightx = 2;
        c.weighty = 1;
        DynamicPanel.add(aboutUs, c);
       

        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 3;
        DynamicPanel.add(admin, c);
DynamicPanel.setOpaque(false);
        //home.setVisible(false);
        registerRide.setVisible(false);
        registerDrive.setVisible(false);
        login.setVisible(true);
        admin.setVisible(false);
        aboutUs.setVisible(false);
   
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminHomePanel = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        btnMemberLogin = new javax.swing.JButton();
        btnAdminLogin = new javax.swing.JButton();
        btnKnowUs = new javax.swing.JButton();
        btnRideSignUp = new javax.swing.JButton();
        btnDriveSignUp = new javax.swing.JButton();
        DynamicPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(36, 37, 130));

        adminHomePanel.setBackground(new java.awt.Color(255, 255, 255));
        adminHomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblWelcome.setBackground(new java.awt.Color(36, 37, 130));
        lblWelcome.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        lblWelcome.setText("Car Pooling Management System");
        adminHomePanel.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 530, -1));

        btnMemberLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnMemberLogin.setForeground(new java.awt.Color(174, 110, 110));
        btnMemberLogin.setText("Member Login");
        btnMemberLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberLoginActionPerformed(evt);
            }
        });
        adminHomePanel.add(btnMemberLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 165, 40));

        btnAdminLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnAdminLogin.setForeground(new java.awt.Color(174, 110, 110));
        btnAdminLogin.setText("Admin Login");
        btnAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminLoginActionPerformed(evt);
            }
        });
        adminHomePanel.add(btnAdminLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 165, 40));

        btnKnowUs.setBackground(new java.awt.Color(255, 255, 255));
        btnKnowUs.setForeground(new java.awt.Color(174, 110, 110));
        btnKnowUs.setText("Know Us");
        btnKnowUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKnowUsActionPerformed(evt);
            }
        });
        adminHomePanel.add(btnKnowUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 165, 40));

        btnRideSignUp.setBackground(new java.awt.Color(255, 255, 255));
        btnRideSignUp.setForeground(new java.awt.Color(174, 110, 110));
        btnRideSignUp.setText("Sign Up to Ride");
        btnRideSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRideSignUpActionPerformed(evt);
            }
        });
        adminHomePanel.add(btnRideSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 165, 40));

        btnDriveSignUp.setBackground(new java.awt.Color(255, 255, 255));
        btnDriveSignUp.setForeground(new java.awt.Color(174, 110, 110));
        btnDriveSignUp.setText("Sign Up to Drive");
        btnDriveSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDriveSignUpActionPerformed(evt);
            }
        });
        adminHomePanel.add(btnDriveSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 165, 40));

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        adminHomePanel.add(DynamicPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 710, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/car1.jpg"))); // NOI18N
        adminHomePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 950, 620));

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

    private void btnAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminLoginActionPerformed
        //DynamicPanel.setLayout(layout);
      
       admin.setBackground(new Color(0,0,0,0));
        admin.setOpaque(false);
       registerRide.setVisible(false);
        registerDrive.setVisible(false);
        login.setVisible(false);
        admin.setVisible(true);
        
        aboutUs.setVisible(false);
    }//GEN-LAST:event_btnAdminLoginActionPerformed

    private void btnMemberLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberLoginActionPerformed
        
         registerRide.setVisible(false);
        registerDrive.setVisible(false);
        login.setVisible(true);
        admin.setVisible(false);
        DynamicPanel.setBackground(new Color(0,0,0,0));
         login.setBackground(new Color(0,0,0,0));
         aboutUs.setVisible(false);
       
    }//GEN-LAST:event_btnMemberLoginActionPerformed

    private void btnKnowUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKnowUsActionPerformed
        
        registerRide.setVisible(false);
        registerDrive.setVisible(false);
        login.setVisible(false);
        admin.setVisible(false);  
         aboutUs.setVisible(true);
        
          aboutUs.setBackground(new Color(0,0,0,0));
         
    }//GEN-LAST:event_btnKnowUsActionPerformed

    private void btnDriveSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDriveSignUpActionPerformed
          registerRide.setVisible(false);
        registerDrive.setVisible(true);
        login.setVisible(false);
        admin.setVisible(false);
         aboutUs.setVisible(false);
            registerDrive.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_btnDriveSignUpActionPerformed

    private void btnRideSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRideSignUpActionPerformed
              registerRide.setVisible(true);
        registerDrive.setVisible(false);
        login.setVisible(false);
        admin.setVisible(false);  
         aboutUs.setVisible(false);
         
           registerRide.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_btnRideSignUpActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JPanel adminHomePanel;
    private javax.swing.JButton btnAdminLogin;
    private javax.swing.JButton btnDriveSignUp;
    private javax.swing.JButton btnKnowUs;
    private javax.swing.JButton btnMemberLogin;
    private javax.swing.JButton btnRideSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
