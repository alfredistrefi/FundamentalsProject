/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



public class Withdraw extends javax.swing.JFrame {
Connection conn = null;
   
    public Withdraw() {
        initComponents();
        conn = DBconnection.connect();
    }

    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        products = new javax.swing.JLabel();
        transfers = new javax.swing.JLabel();
        tools = new javax.swing.JLabel();
        payments = new javax.swing.JLabel();
        TransferButton = new javax.swing.JButton();
        withAmount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bal = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        withAmount1 = new javax.swing.JTextField();
        withAmount2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(199, 221, 181));

        jPanel3.setBackground(new java.awt.Color(75, 96, 67));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/Black and Gold Modern Gradient Banking Finance Logo.png"))); // NOI18N
        jLabel5.setText("jLabel5");

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(products)
                .addGap(84, 84, 84)
                .addComponent(transfers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(payments)
                .addGap(83, 83, 83)
                .addComponent(tools)
                .addGap(65, 65, 65))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(products)
                    .addComponent(transfers)
                    .addComponent(tools)
                    .addComponent(payments))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TransferButton.setBackground(new java.awt.Color(75, 96, 67));
        TransferButton.setFont(new java.awt.Font("Malayalam MN", 0, 24)); // NOI18N
        TransferButton.setForeground(new java.awt.Color(221, 234, 209));
        TransferButton.setText("Transfer");
        TransferButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransferButtonMouseClicked(evt);
            }
        });

        withAmount.setBackground(new java.awt.Color(163, 197, 133));
        withAmount.setForeground(new java.awt.Color(75, 96, 67));
        withAmount.setText("Account Username*");
        withAmount.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(75, 96, 67)));
        withAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withAmountActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(75, 96, 67));
        jLabel3.setText("Previous Transactions");

        jPanel1.setBackground(new java.awt.Color(163, 197, 133));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 937, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(163, 197, 133));

        jLabel1.setBackground(new java.awt.Color(75, 96, 67));
        jLabel1.setFont(new java.awt.Font("Al Nile", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(75, 96, 67));
        jLabel1.setText("NEW TRANSFER FROM");

        jLabel2.setBackground(new java.awt.Color(75, 96, 67));
        jLabel2.setFont(new java.awt.Font("Al Nile", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(75, 96, 67));
        jLabel2.setText("Available amount");

        bal.setBackground(new java.awt.Color(163, 197, 133));
        bal.setBorder(null);

        jTextField1.setBackground(new java.awt.Color(163, 197, 133));
        jTextField1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(75, 96, 67));
        jTextField1.setToolTipText("");
        jTextField1.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bal, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(386, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        withAmount1.setBackground(new java.awt.Color(163, 197, 133));
        withAmount1.setForeground(new java.awt.Color(75, 96, 67));
        withAmount1.setText("Account Owner*");
        withAmount1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(75, 96, 67)));
        withAmount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withAmount1ActionPerformed(evt);
            }
        });

        withAmount2.setBackground(new java.awt.Color(163, 197, 133));
        withAmount2.setForeground(new java.awt.Color(75, 96, 67));
        withAmount2.setText("Enter amount...");
        withAmount2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(75, 96, 67)));
        withAmount2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withAmount2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(withAmount2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(TransferButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(withAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(withAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withAmount2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TransferButton))
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void TransferButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransferButtonMouseClicked
        int balance = 0;
        int withdraw;
        int total;
        try {
             Connection con = null;
             PreparedStatement pst;
             
             con = DBconnection.connect();
             PreparedStatement preparedStatement = null;
             
             String query = "SELECT balance FROM balance WHERE id=1";

             preparedStatement = con.prepareStatement(query);
             ResultSet rs = preparedStatement.executeQuery(); 
             /* Executes the SQL query in this PreparedStatement object 
            and returns the ResultSet object generated by the query.*/
             
        
             
             if(rs.next()){
             balance = Integer.parseInt(rs.getString(1)); 
             }           
             
             withdraw = Integer.parseInt(withAmount.getText());
             if(balance > withdraw){
               total = balance - withdraw;
             
                String q = ("UPDATE balance SET balance=? WHERE id=?");
                      try{
                 pst = con.prepareStatement(q);
                 
                 pst.setString(1, Integer.toString(total));
                 pst.setInt(2, 1);
                 pst.executeUpdate();
                 
                 JOptionPane.showMessageDialog(null, "Succesfull withdraw!");
                 }catch(Exception e){
                 System.out.println(e);
             }
                      
             }else{
                 JOptionPane.showMessageDialog(null,"You do not have enough credit to complete this operation");
             }   
            
        }
        
        catch(Exception e) {
            
            
        }
        
        
        
        
    }//GEN-LAST:event_TransferButtonMouseClicked

    private void transfersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transfersMouseClicked
        this.setVisible(false);
        new Withdraw().setVisible(true);
    }//GEN-LAST:event_transfersMouseClicked

    private void withAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withAmountActionPerformed

    private void withAmount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withAmount1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withAmount1ActionPerformed

    private void withAmount2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withAmount2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withAmount2ActionPerformed

    private void toolsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolsMouseClicked
        this.setVisible(false);
        new Password().setVisible(true);
    }//GEN-LAST:event_toolsMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
    
       
    }//GEN-LAST:event_formWindowActivated

   
    public static void main(String args[]) {
        
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TransferButton;
    private javax.swing.JTextField bal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel payments;
    private javax.swing.JLabel products;
    private javax.swing.JLabel tools;
    private javax.swing.JLabel transfers;
    private javax.swing.JTextField withAmount;
    private javax.swing.JTextField withAmount1;
    private javax.swing.JTextField withAmount2;
    // End of variables declaration//GEN-END:variables
}
