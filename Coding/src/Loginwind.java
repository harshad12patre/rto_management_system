
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
public class Loginwind extends javax.swing.JFrame {   
    public Loginwind() {
    	getContentPane().setBackground(Color.DARK_GRAY);
        initComponents();
    }
     private void verify()
    {
         int responce;
        String login,pass;
    login=userid.getText();
    pass=password.getText();
        if((login.equalsIgnoreCase("rto")&&(pass.equalsIgnoreCase("123"))))
        {   
            this.setVisible(false);
            Mwindow mf=new Mwindow();
            mf.setVisible(true);
        }
     else
        {
          responce = JOptionPane.showConfirmDialog(null,"The User Name or Password entered is not valid\n"+"Want to try again?","Information",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);              
        if(responce == 0)
        { 
        setVisible(false);
        Loginwind lw=new Loginwind();
        lw.setVisible(true);
        }
        else
        {
         this.setVisible(false);    
        }
        }        
     }    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jButton1 = new javax.swing.JButton();
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2 = new javax.swing.JButton();
        jButton2.setBackground(Color.LIGHT_GRAY);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setForeground(Color.WHITE);
        jLabel1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setForeground(Color.WHITE);
        jLabel2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        userid = new javax.swing.JTextField();
        userid.setBackground(Color.LIGHT_GRAY);
        password = new javax.swing.JPasswordField();
        password.setBackground(Color.LIGHT_GRAY);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LogIn Window");
        setBounds(new java.awt.Rectangle(100, 100, 0, 0));
        setResizable(false);
        jButton1.setText("Verify");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("User Name");

        jLabel2.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(133)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        						.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(password, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
        						.addComponent(userid, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
        					.addGap(28))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jButton2)
        					.addPreferredGap(ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
        					.addComponent(jButton1)))
        			.addGap(133))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(97)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(userid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(24)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
        					.addGap(46)))
        			.addPreferredGap(ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1)
        				.addComponent(jButton2))
        			.addGap(97))
        );
        getContentPane().setLayout(layout);
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
RtoWelcome rw = new RtoWelcome();
rw.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
verify();
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginwind().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
    
}
