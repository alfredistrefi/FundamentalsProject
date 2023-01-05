/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Password extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst;
    
     
   
   
    public Password() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        newPassword = new javax.swing.JPasswordField();
        confPassword = new javax.swing.JPasswordField();
        oldPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        products = new javax.swing.JLabel();
        transfers = new javax.swing.JLabel();
        tools = new javax.swing.JLabel();
        payments = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(199, 221, 181));
        jPanel3.setForeground(new java.awt.Color(199, 221, 181));

        jPanel4.setBackground(new java.awt.Color(163, 197, 133));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel4.setFont(new java.awt.Font("Myanmar Sangam MN", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(75, 96, 67));
        jLabel4.setText("Old Password:");

        jLabel5.setFont(new java.awt.Font("Myanmar Sangam MN", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(75, 96, 67));
        jLabel5.setText("Confirm Password:");

        jLabel6.setFont(new java.awt.Font("Myanmar Sangam MN", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(75, 96, 67));
        jLabel6.setText("New Password:");

        Save.setBackground(new java.awt.Color(75, 96, 67));
        Save.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 18)); // NOI18N
        Save.setForeground(new java.awt.Color(221, 234, 209));
        Save.setText("Save changes");
        Save.setAlignmentX(0.5F);
        Save.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
        });

        newPassword.setBackground(new java.awt.Color(221, 234, 209));
        newPassword.setForeground(new java.awt.Color(75, 96, 67));
        newPassword.setBorder(null);

        confPassword.setBackground(new java.awt.Color(221, 234, 209));
        confPassword.setForeground(new java.awt.Color(75, 96, 67));
        confPassword.setBorder(null);

        oldPassword.setBackground(new java.awt.Color(221, 234, 209));
        oldPassword.setForeground(new java.awt.Color(75, 96, 67));
        oldPassword.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(75, 96, 67));
        jLabel3.setText("Change Password");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel3)))
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel3)
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(oldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(75, 96, 67));

        products.setBackground(new java.awt.Color(255, 255, 255));
        products.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        products.setForeground(new java.awt.Color(255, 255, 255));
        products.setText("Products");

        transfers.setBackground(new java.awt.Color(255, 255, 255));
        transfers.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        transfers.setForeground(new java.awt.Color(255, 255, 255));
        transfers.setText("Transfers");
        transfers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transfersMouseClicked(evt);
            }
        });

        tools.setBackground(new java.awt.Color(255, 255, 255));
        tools.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        tools.setForeground(new java.awt.Color(255, 255, 255));
        tools.setText("User Tools");
        tools.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolsMouseClicked(evt);
            }
        });

        payments.setBackground(new java.awt.Color(255, 255, 255));
        payments.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        payments.setForeground(new java.awt.Color(255, 255, 255));
        payments.setText("Payments");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/images/Black and Gold Modern Gradient Banking Finance Logo.png"))); // NOI18N
        jLabel7.setText("jLabel5");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(products)
                .addGap(93, 93, 93)
                .addComponent(transfers)
                .addGap(78, 78, 78)
                .addComponent(payments)
                .addGap(86, 86, 86)
                .addComponent(tools)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transfers)
                    .addComponent(payments)
                    .addComponent(tools)
                    .addComponent(products))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
        try {
            Connection con = null;
            PreparedStatement pst;
            
            con = DBconnection.connect();
            PreparedStatement preparedStatement = null;
            
            String oldPassTxt = oldPassword.getText();
            String newPassTxt = newPassword.getText();
            String confPassTxt = confPassword.getText();
            String oldPass = null;
           
            String query = "SELECT * FROM users";
            preparedStatement = con.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            
            if(rs.next()){
                oldPass = rs.getString(3);  
            }
            if(oldPassTxt.equals(oldPass) && newPassTxt.equals(confPassTxt)){
                String q = ("UPDATE users SET password=? WHERE id=?");
                      try{
                 pst = con.prepareStatement(q);
                 pst.setString(1, newPassTxt);
                 pst.setInt(2, 1);
                 
                 pst.executeUpdate();
                 
                 JOptionPane.showMessageDialog(null, "Password changed successfully!");
                 }catch(Exception e){
                 System.out.println(e);
             }
                
            }else{
                JOptionPane.showMessageDialog(null, "Passwords not matching!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Password.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_SaveMouseClicked

    private void transfersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transfersMouseClicked
        this.setVisible(false);
        new Withdraw().setVisible(true);
    }//GEN-LAST:event_transfersMouseClicked

    private void toolsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolsMouseClicked
        this.setVisible(false);
        new Password().setVisible(true);
    }//GEN-LAST:event_toolsMouseClicked
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JPasswordField confPassword;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JPasswordField oldPassword;
    private javax.swing.JLabel payments;
    private javax.swing.JLabel products;
    private javax.swing.JLabel tools;
    private javax.swing.JLabel transfers;
    // End of variables declaration//GEN-END:variables

}