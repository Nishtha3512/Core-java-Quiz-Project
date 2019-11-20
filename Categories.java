package package1;


import package1.Playquiz_1;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Categories extends javax.swing.JFrame {
public static String cat;
    
    public Categories() {
        initComponents();
       //  cat=(String)cb.getSelectedItem();
        
         try
{
Class.forName("oracle.jdbc.driver.OracleDriver");

    java.sql.Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","NISHTHA123","naina1234");
System.out.println("connected");
String sql="Select CAT FROM CATEGORIES";

    PreparedStatement pst=con.prepareStatement(sql);
   // System.out.println(sql);
   // System.out.println(cat);
    System.out.println("connected");
    
    
    ResultSet rs=pst.executeQuery();
  //  System.out.println(rs);
System.out.println("connected");
    while(rs.next())
    {
       
     //System.out.println(rs.getString("QUESTION"));
   cb.addItem(rs.getString("CAT"));
    }
}
 catch(Exception e)
{
System.out.println(e);
}
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cb = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 300));
        setMinimumSize(new java.awt.Dimension(700, 500));

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Select category of quiz");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 140, 330, 29);

        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });
        jPanel1.add(cb);
        cb.setBounds(210, 220, 80, 22);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(360, 290, 100, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel3.setText("QUIZ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 40, 120, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\Final.jpg")); // NOI18N
        jLabel2.setText("QUIZ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, -30, 670, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       
        /* cat=(String)cb.getSelectedItem();
        
         try
{
Class.forName("oracle.jdbc.driver.OracleDriver");

    java.sql.Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","NISHTHA123","naina1234");
System.out.println("connected");
String sql="Select CAT FROM QUIZ";

    PreparedStatement pst=con.prepareStatement(sql);
    System.out.println(cat);
    System.out.println("connected");
    
    
    ResultSet rs=pst.executeQuery();
System.out.println("connected");
    while(rs.next())
    {
       
     //System.out.println(rs.getString("QUESTION"));
   cb.addItem(rs.getString("CAT"));
    }
}
 catch(Exception e)
{
System.out.println(e);
}*/
        cat=(String)cb.getSelectedItem();
        System.out.println(cat);
 Playquiz_1 p=new Playquiz_1();
       p.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
      
    }//GEN-LAST:event_cbActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Categories().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
