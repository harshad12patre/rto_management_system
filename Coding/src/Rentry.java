
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.*;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;
public class Rentry extends javax.swing.JFrame {
    Connection connection;
    public Rentry() {
    	getContentPane().setBackground(Color.DARK_GRAY);
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setForeground(Color.LIGHT_GRAY);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setForeground(Color.LIGHT_GRAY);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setForeground(Color.LIGHT_GRAY);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setForeground(Color.LIGHT_GRAY);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setForeground(Color.LIGHT_GRAY);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setForeground(Color.LIGHT_GRAY);
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setForeground(Color.LIGHT_GRAY);
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setForeground(Color.LIGHT_GRAY);
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setForeground(Color.LIGHT_GRAY);
        jLabel11 = new javax.swing.JLabel();
        jLabel11.setForeground(Color.LIGHT_GRAY);
        jLabel19 = new javax.swing.JLabel();
        jLabel19.setForeground(Color.LIGHT_GRAY);
        jTextField2 = new javax.swing.JTextField();
        jTextField2.setBackground(Color.LIGHT_GRAY);
        jTextField3 = new javax.swing.JTextField();
        jTextField3.setBackground(Color.LIGHT_GRAY);
        jTextField4 = new javax.swing.JTextField();
        jTextField4.setBackground(Color.LIGHT_GRAY);
        jTextField5 = new javax.swing.JTextField();
        jTextField5.setBackground(Color.LIGHT_GRAY);
        jTextField6 = new javax.swing.JTextField();
        jTextField6.setBackground(Color.LIGHT_GRAY);
        jTextField7 = new javax.swing.JTextField();
        jTextField7.setBackground(Color.LIGHT_GRAY);
        jTextField8 = new javax.swing.JTextField();
        jTextField8.setBackground(Color.LIGHT_GRAY);
        jTextField9 = new javax.swing.JTextField();
        jTextField9.setBackground(Color.LIGHT_GRAY);
        jTextField10 = new javax.swing.JTextField();
        jTextField10.setBackground(Color.LIGHT_GRAY);
        jTextField11 = new javax.swing.JTextField();
        jTextField11.setBackground(Color.LIGHT_GRAY);
        jButton1 = new javax.swing.JButton();
        jButton1.setBackground(Color.LIGHT_GRAY);
        jTextField1 = new javax.swing.JTextField();
        jTextField1.setBackground(Color.LIGHT_GRAY);
        jTextField1.setForeground(Color.BLACK);
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(new Color(233, 150, 122));
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration Form");
        setBounds(new java.awt.Rectangle(100, 100, 0, 0));
        setResizable(false);
        jLabel2.setText("Regstn. No.");

        jLabel3.setText("Engine No.");

        jLabel4.setText("Chasis No.");

        jLabel5.setText("Vehicle no.");

        jLabel6.setText("State");

        jLabel7.setText("Full Name");

        jLabel8.setText("Father's Name");

        jLabel9.setText("Address");

        jLabel10.setText("Model Name");

        jLabel11.setText("Mfg. By");

        jLabel19.setText("Mfg. Year");

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel12.setForeground(Color.RED);
        jLabel12.setText("Enter Numerical Values Only");

        jLabel1.setText("(all the following entries are compulsory)");

        jMenu1.setText("License");
        jMenuItem1.setText("New Entry");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });

        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Search");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Registration");
        jMenuItem4.setText("Search");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });

        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Search");
        jMenuItem5.setText("City");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });

        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Help");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem6.setText("Help");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });

        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Exit");
        jMenuItem7.setText("Exit to Desktop");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });

        jMenu5.add(jMenuItem7);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(186)
        			.addComponent(jLabel1)
        			.addContainerGap(186, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(36)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel8)
        				.addComponent(jLabel7)
        				.addComponent(jLabel6)
        				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        					.addComponent(jLabel5)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel3)
        						.addComponent(jLabel4)))
        				.addComponent(jLabel2)
        				.addComponent(jLabel9)
        				.addComponent(jLabel10)
        				.addComponent(jLabel11)
        				.addComponent(jLabel19))
        			.addGap(69)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel12)
        					.addContainerGap())
        				.addGroup(layout.createParallelGroup(Alignment.LEADING)
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(jTextField11, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        						.addContainerGap())
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(jTextField10, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        						.addContainerGap())
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(jTextField9, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        						.addContainerGap())
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(jTextField8, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        						.addContainerGap())
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        						.addGap(244))
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addContainerGap())
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(jTextField3, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        						.addContainerGap())
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(jTextField4, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        						.addContainerGap())
        					.addGroup(layout.createSequentialGroup()
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        								.addGap(85))
        							.addComponent(jTextField6, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        							.addComponent(jTextField5, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(jButton1)
        						.addGap(104)))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel1)
        					.addGap(14)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel2)
        						.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        					.addGap(2)
        					.addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel3)
        							.addGap(9))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)))
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jLabel4)
        						.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel5))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel6))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel7))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel8)
        						.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel10)
        						.addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel11)
        						.addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel19)
        						.addComponent(jTextField11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(191)
        					.addComponent(jButton1)))
        			.addContainerGap(40, Short.MAX_VALUE))
        );
        layout.linkSize(SwingConstants.VERTICAL, new Component[] {jTextField2, jTextField3, jTextField4, jTextField5, jTextField6, jTextField7, jTextField8, jTextField9, jTextField10, jTextField11});
        layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jTextField2, jTextField3, jTextField4, jTextField5, jTextField6, jTextField7, jTextField8, jTextField9, jTextField10, jTextField11, jTextField1});
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
this.setVisible(false);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
     Help hp = new Help();
     hp.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        SearchCity sc = new SearchCity();
        sc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    Rsearch rs = new Rsearch();
    rs.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Lentry le = new Lentry();
        le.setVisible(true);
        this.setVisible(false);   
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try
    {
         if((jTextField1.getText()).equals("")&&(jTextField2.getText()).equals("")&&(jTextField3.getText()).equals("")&&(jTextField4.getText()).equals("")&&(jTextField5.getText()).equals("")&&(jTextField6.getText()).equals("")&&(jTextField7.getText()).equals("")&&(jTextField8.getText()).equals("")&&(jTextField9.getText()).equals("")&&(jTextField10.getText()).equals("")&&(jTextField11.getText()).equals(""))
        {   
             JOptionPane.showMessageDialog(null,"Please fill the entry","Information",JOptionPane.INFORMATION_MESSAGE);              
            
        }
        else
        {
           if((jTextField1.getText()).equals("")||(jTextField2.getText()).equals("")||(jTextField3.getText()).equals("")||(jTextField4.getText()).equals("")||(jTextField5.getText()).equals("")||(jTextField6.getText()).equals("")||(jTextField7.getText()).equals("")||(jTextField8.getText()).equals("")||(jTextField9.getText()).equals("")||(jTextField10.getText()).equals("")||(jTextField11.getText()).equals(""))
        {   
             JOptionPane.showMessageDialog(null,"Please fill the entry properly.\n"+" Don't live blanks","Information",JOptionPane.INFORMATION_MESSAGE);              
            
        }
           else
           {
        	   Class.forName("com.mysql.cj.jdbc.Driver");
   			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/RTO","root","harshad12");
        String sql="INSERT INTO registration values(?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(2,jTextField2.getText());
        ps.setString(3,jTextField3.getText());
        ps.setString(4,jTextField4.getText());
        ps.setString(5,jTextField5.getText());
        ps.setString(6,jTextField6.getText());
        ps.setString(7,jTextField7.getText());
        ps.setString(8,jTextField8.getText());
        ps.setString(9,jTextField9.getText());
        ps.setString(10,jTextField10.getText());
        int val1,val11;
        val1=Integer.parseInt(jTextField1.getText());
        val11=Integer.parseInt(jTextField11.getText());
        ps.setInt(1,val1);
        ps.setInt(11,val11);  
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null,"New record saved","Information",JOptionPane.INFORMATION_MESSAGE);              
        setVisible(false);
        Mwindow mw = new Mwindow();
        mw.setVisible(true);
    }}
       }catch(Exception e){}
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
                                         
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rentry().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
    
}
