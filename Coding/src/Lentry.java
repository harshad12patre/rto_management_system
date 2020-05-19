import java.sql.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
public class Lentry extends javax.swing.JFrame {
    Connection connection;
    ResultSet resultset;
    public Lentry() {
    	getContentPane().setBackground(Color.DARK_GRAY);
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jTextField1 = new javax.swing.JTextField();
        jTextField1.setBackground(Color.LIGHT_GRAY);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(Color.LIGHT_GRAY);
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
        jButton1 = new javax.swing.JButton();
        jButton1.setBackground(Color.LIGHT_GRAY);
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setForeground(new Color(240, 128, 128));
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("License Form");
        setBounds(new java.awt.Rectangle(100, 100, 700, 700));
        setResizable(false);

        jLabel1.setText("License number");

        jLabel2.setText("Full Name");

        jLabel3.setText("Father's Name");

        jLabel4.setText("Age");

        jLabel5.setText("Gender");

        jLabel6.setText("Blood Group");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel7.setForeground(Color.RED);
        jLabel7.setText("Enter Numerical Values Only");

        jLabel8.setText("(all the following entries are compulsory)");

        jMenu1.setText("License");
        jMenuItem2.setText("Search");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });

        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Registration");
        jMenuItem3.setText("New Entry");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });

        jMenu2.add(jMenuItem3);

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
        			.addGap(111)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(115)
        					.addComponent(jButton1)
        					.addPreferredGap(ComponentPlacement.RELATED, 144, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel3)
        						.addComponent(jLabel1)
        						.addComponent(jLabel4)
        						.addComponent(jLabel5)
        						.addComponent(jLabel6)
        						.addComponent(jLabel2))
        					.addGap(87)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel7)
        							.addPreferredGap(ComponentPlacement.RELATED, 18, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jTextField2, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        								.addComponent(jTextField6, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        								.addComponent(jTextField5, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        								.addComponent(jTextField3, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        								.addComponent(jTextField4, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        								.addComponent(jTextField1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
        							.addGap(34)))))
        			.addGap(111))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(176)
        			.addComponent(jLabel8)
        			.addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(30)
        			.addComponent(jLabel8)
        			.addGap(16)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(5)
        			.addComponent(jLabel7)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(13)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(27)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel4))
        			.addGap(24)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(20)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(46)
        			.addComponent(jButton1)
        			.addContainerGap(29, Short.MAX_VALUE))
        );
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

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    SearchCity sc = new SearchCity();
    sc.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    Rentry re = new Rentry();
    re.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    Rentry re = new Rentry();
    re.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    Lsearch ls = new Lsearch();
    ls.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 try{      if((jTextField1.getText()).equals("")&&(jTextField2.getText()).equals("")&&(jTextField3.getText()).equals("")&&(jTextField4.getText()).equals("")&&(jTextField5.getText()).equals("")&&(jTextField6.getText()).equals(""))
        {   
             JOptionPane.showMessageDialog(null,"Please fill the entry","Information",JOptionPane.INFORMATION_MESSAGE);              
            
        }
        else
        {
           if((jTextField1.getText()).equals("")||(jTextField2.getText()).equals("")||(jTextField3.getText()).equals("")||(jTextField4.getText()).equals("")||(jTextField5.getText()).equals("")||(jTextField6.getText()).equals(""))
        {   
             JOptionPane.showMessageDialog(null,"Please fill the entry properly.\n"+" Don't leavve blanks","Information",JOptionPane.INFORMATION_MESSAGE);              
            
        }
           else
           {
        	   Class.forName("com.mysql.cj.jdbc.Driver");
   			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/RTO","root","harshad12");
            String sql="INSERT INTO licence values(?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(2,jTextField2.getText());
            ps.setString(3,jTextField3.getText());
            ps.setString(5,jTextField5.getText());
            ps.setString(6,jTextField6.getText());
            int val1;
            val1=Integer.parseInt(jTextField1.getText());
            ps.setInt(1,val1);
            int val4;
            val4=Integer.parseInt(jTextField4.getText());
            ps.setInt(4,val4);  
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"New record saved","Information",JOptionPane.INFORMATION_MESSAGE);              
            Mwindow mw = new Mwindow();
            mw.setVisible(true);
            this.setVisible(false);
       }}
      }catch(Exception e){} 
    }//GEN-LAST:event_jButton1ActionPerformed
                    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lentry().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
 
}
