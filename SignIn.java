/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class SignIn extends javax.swing.JFrame {

    /**
     * Creates new form SignIn
     */
    public SignIn() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 36)); // NOI18N
        jLabel1.setText("Username");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 300));
        setMinimumSize(new java.awt.Dimension(600, 400));

        jPanel2.setPreferredSize(new java.awt.Dimension(648, 400));
        jPanel2.setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 51, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(180, 440, 96, 34);

        jButton2.setBackground(new java.awt.Color(204, 51, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(550, 440, 88, 34);

        jLabel2.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 36)); // NOI18N
        jLabel2.setText("Password :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(140, 320, 170, 34);

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel2.add(username);
        username.setBounds(380, 170, 181, 38);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel2.add(password);
        password.setBounds(380, 310, 181, 34);

        jButton3.setBackground(new java.awt.Color(204, 51, 0));
        jButton3.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(8, 24, 24));
        jButton3.setText("Create an account");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(527, 30, 230, 50);

        jLabel3.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 36)); // NOI18N
        jLabel3.setText("Username :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(140, 180, 180, 38);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel6.setText("QUIZ");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(50, 20, 110, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("Login Form");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(230, 100, 290, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\Final.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 800, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 String username1=username.getText();
    String password1= password.getText();
        try
{
Class.forName("oracle.jdbc.driver.OracleDriver");

    java.sql.Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","NISHTHA123","naina1234");
System.out.println("connected");
String sql="Select USERNAME,PASSWORD from SIGNIN where USERNAME='"+username1+"' and PASSWORD='"+password1+"'";

    PreparedStatement pst=con.prepareStatement(sql);
    System.out.println("connected");
    
    
    ResultSet rs=pst.executeQuery();
System.out.println("connected");
    

    //    String username=Loginusername1.getText();
//String password=Loginpassword1.getText();
//if(username.equals("nishtha")&& password.equals("nishtha123"))
    if(rs.next())
{
    JOptionPane.showMessageDialog(null, "details are correct");
   Categories ct=new Categories();
   ct.setVisible(true);
  // jButton2.show(IF);
    
}
else
{
    JOptionPane.showMessageDialog(null, "wrong details");
}
}
 catch(Exception e)
{
System.out.println(e);
}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
      // String s1="nishtha"; // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
      // String s2="nishtha123"; // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Signin2 s=new Signin2();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    public javax.swing.JPasswordField password;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
