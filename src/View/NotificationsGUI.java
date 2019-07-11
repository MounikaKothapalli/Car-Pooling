package View;

import Controller.Database_Queries;
import Model.Admin;
import Model.Members;
import Model.Notification;
import java.awt.Color;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author mounikakothapalli
 */
public class NotificationsGUI extends javax.swing.JFrame {

    public NotificationsGUI() {
        initComponents();
       
    }

    public NotificationsGUI(Members mem) {
        super("Manage Members");
        initComponents();
        this.mem = mem;
        show_Notifications();
        setSize(940, 530);  //set size of frame
        setResizable(false); // frame can't be resized
        setLocationRelativeTo(null); // set frame at center of screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //default exist when prexx X icon
        jTable_Notifications.setFillsViewportHeight(true);
 
       
        if (mem != null) {
            txtMessage.setEnabled(false);
            txtMessage.setBackground(new Color(204, 204, 204));
            btnSend.setVisible(false);
            btnClear.setVisible(false);
            lblWelcome.setText("Welcome " + mem.getName());
            lblheading.setText("View Notifications");
        } else {
            lblWelcome.setText(lblWelcome.getText() + "Admin");

        }
      
        

    }

     private void show_Notifications() {
        ArrayList<Notification> notifications = Database_Queries.DDL().selectAllNotifications();

        if (mem != null) {
            for (int i = 0; i < notifications.size(); i++) {
                Notification notification = notifications.get(i);
                if (notification.getMemberId()!= mem.getMemberID()) {
                    notifications.remove(i);
                }
            }
        } else {
            notifications = Database_Queries.DDL().selectDistinctNotifications();
        }
        DefaultTableModel model = (DefaultTableModel) jTable_Notifications.getModel();
        model.setRowCount(0);
        Object[] row = new Object[2];
        for (int i = 0; i < notifications.size(); i++) {
            row[0] = notifications.get(i).getMessage();
            row[1] = notifications.get(i).getSentDate();
            model.addRow(row);
        }

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        notificationPanel = new javax.swing.JPanel();
        lblheading = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        equipmentScroll = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Notifications = new javax.swing.JTable();
        lblWelcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        notificationPanel.setBackground(new java.awt.Color(255, 255, 255));
        notificationPanel.setForeground(new java.awt.Color(0, 51, 51));
        notificationPanel.setLayout(null);

        lblheading.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblheading.setText("Manage Notifications");
        notificationPanel.add(lblheading);
        lblheading.setBounds(310, 10, 170, 30);

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(203, 103, 103));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        notificationPanel.add(btnBack);
        btnBack.setBounds(760, 10, 110, 30);

        equipmentScroll.setBackground(new java.awt.Color(36, 37, 130));

        jTable_Notifications.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTable_Notifications.setForeground(new java.awt.Color(170, 91, 91));
        jTable_Notifications.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sent On"
            }
        ));
        jTable_Notifications.setGridColor(new java.awt.Color(230, 67, 123));
        jTable_Notifications.setSelectionBackground(new java.awt.Color(213, 141, 166));
        jTable_Notifications.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_NotificationsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Notifications);
        if (jTable_Notifications.getColumnModel().getColumnCount() > 0) {
            jTable_Notifications.getColumnModel().getColumn(1).setResizable(false);
        }

        equipmentScroll.setViewportView(jScrollPane2);

        notificationPanel.add(equipmentScroll);
        equipmentScroll.setBounds(60, 240, 740, 240);

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblWelcome.setText("Welcome ");
        notificationPanel.add(lblWelcome);
        lblWelcome.setBounds(40, 10, 140, 20);
        notificationPanel.add(jLabel1);
        jLabel1.setBounds(790, 150, 0, 0);

        txtMessage.setColumns(20);
        txtMessage.setRows(5);
        txtMessage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setViewportView(txtMessage);

        notificationPanel.add(jScrollPane1);
        jScrollPane1.setBounds(250, 60, 166, 96);

        btnSend.setBackground(new java.awt.Color(255, 255, 255));
        btnSend.setForeground(new java.awt.Color(203, 103, 103));
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        notificationPanel.add(btnSend);
        btnSend.setBounds(260, 190, 100, 40);

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setForeground(new java.awt.Color(203, 103, 103));
        btnClear.setText("Clear");
        notificationPanel.add(btnClear);
        btnClear.setBounds(380, 190, 90, 40);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("* Notifications will be sent to the users who has subscribed during Registration");
        notificationPanel.add(jLabel2);
        jLabel2.setBounds(140, 160, 550, 18);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/car1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        notificationPanel.add(jLabel3);
        jLabel3.setBounds(-5, -4, 960, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notificationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notificationPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_NotificationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_NotificationsMouseClicked
       int i = jTable_Notifications.getSelectedRow();
        TableModel model = jTable_Notifications.getModel();
        txtMessage.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_jTable_NotificationsMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
         this.setVisible(false);
        this.dispose();
        if (btnSend.isVisible()) {
            AdminHomeGUI home = new AdminHomeGUI();
            home.setVisible(true);
        } else  if (mem.getDriverId()==null){
            MemberToRideHomeGUI home = new MemberToRideHomeGUI(mem);
            home.setVisible(true);
        }
        else{
            MemberToDriveHomeGUI home = new MemberToDriveHomeGUI(mem);
            home.setVisible(true);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        String message = txtMessage.getText();
        if (message.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Message is empty");
            return;
        }

        
        Admin admin = new Admin();
        ArrayList<Members> members = Database_Queries.DDL().selectAllMembers();
        admin.setMembers(members);

        for (int i = 0; i < admin.getMembers().size(); i++) {
            Members memb = admin.getMembers().get(i);
            if (memb.getSubscribe() == 1) //sending message to only subscribed users
            {
                memb.update(message + " to Member:" + memb.getMemberID()+ " " + memb.getName());
                Notification notification = new Notification(memb.getMemberID(), message, new java.sql.Date(new Date().getTime()));
                Database_Queries.DML().InsertNotification(notification);
            }
        }

        JOptionPane.showMessageDialog(null, "Notifications sent to all subscribed Members");
        show_Notifications();
    }//GEN-LAST:event_btnSendActionPerformed

    

    Members mem;

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotificationsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSend;
    private javax.swing.JScrollPane equipmentScroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Notifications;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblheading;
    private javax.swing.JPanel notificationPanel;
    private javax.swing.JTextArea txtMessage;
    // End of variables declaration//GEN-END:variables
}
