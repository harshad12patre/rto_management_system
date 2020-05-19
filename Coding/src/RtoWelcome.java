import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class RtoWelcome extends javax.swing.JFrame {
     
    public RtoWelcome() {
    	setResizable(false);
    	getContentPane().setBackground(Color.DARK_GRAY);
        initComponents();
    }  
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jButton1 = new javax.swing.JButton();
        jButton1.setForeground(Color.BLACK);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2 = new javax.swing.JButton();
        jButton2.setBackground(Color.LIGHT_GRAY);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome To RTO");
        setBounds(new java.awt.Rectangle(100, 100, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new Font("Arial", Font.PLAIN, 48));
        jLabel1.setForeground(Color.LIGHT_GRAY);
        jLabel1.setText("WELCOME");

        jLabel2.setFont(new Font("Arial", Font.PLAIN, 36));
        jLabel2.setForeground(Color.LIGHT_GRAY);
        jLabel2.setText("TO");

        jLabel3.setFont(new Font("Arial", Font.BOLD, 48));
        jLabel3.setForeground(Color.WHITE);
        jLabel3.setText("RTO Management");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(173, Short.MAX_VALUE)
        			.addComponent(jButton1)
        			.addGap(106)
        			.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
        			.addGap(174))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(255)
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(255, Short.MAX_VALUE))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(128)
        			.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        			.addGap(129))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(81)
        			.addComponent(jLabel3)
        			.addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(40)
        			.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel2)
        			.addGap(18)
        			.addComponent(jLabel3)
        			.addGap(61)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1)
        				.addComponent(jButton2))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Loginwind lw = new Loginwind();
        lw.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
      
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RtoWelcome().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
}
