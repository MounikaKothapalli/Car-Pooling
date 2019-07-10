package View;

//import Controller.DatabaseQueries;
//import Model.EventManager;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


/**
 *
 * @author mounikakothapalli
 */
public class KnowUsGUI extends javax.swing.JPanel {

    public KnowUsGUI() {
        initComponents();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAdminID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAdminID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAdminID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/CarHeader-banner3.jpg"))); // NOI18N
        add(lblAdminID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 630, 210));

        jTextArea1.setBackground(new java.awt.Color(240, 221, 221));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("This system is specially designed for those people who have to travel daily from one place another.In this \nway, one needs to spend that much daily petrol by their vehicle and cost become huge for a single person.\nHe picks people on the route and shares the fuel costs.In this, he is not only decreasing the cost as well \nas he is reducing the pollution which is created by the car.Which would be double if one person comes \nwith one car. If he picks four-people he can reduce it even 4 times the pollution which earlier produces.\n");
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 690, 110));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAdminID;
    // End of variables declaration//GEN-END:variables
}
