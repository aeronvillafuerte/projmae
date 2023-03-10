import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.BasicStroke;
import java.awt.Color;
import static java.awt.Color.BLACK;
import static javafx.scene.paint.Color.color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCC-COMLAB
 */
public class loginForm extends javax.swing.JFrame {

    /**
     * Creates new form loginForm
     */
    public loginForm() {
        initComponents();
    }
    
    Color hover=new Color(0,204,204);
    Color defbutton= new Color(0,102,102);
    
    Border empty=BorderFactory.createEmptyBorder();
    
    void buttonBorderAnimation(JPanel panel){
        panel.setBackground(hover);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        
    }
    void buttonDefaultColor(JPanel panel){
        panel.setBackground(defbutton);
        panel.setBorder(empty);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        cancel = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        cancel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsfolder/logo (1).png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 210, 210));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 370, 430);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBackground(new java.awt.Color(0, 102, 102));
        username.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Username"));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 250, 40));

        password.setBackground(new java.awt.Color(0, 102, 102));
        password.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setToolTipText("");
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Password"));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 250, 40));

        cancel.setBackground(new java.awt.Color(0, 204, 204));
        cancel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("LOGIN");
        login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        cancel.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 30));

        jPanel3.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 110, 30));

        cancel1.setBackground(new java.awt.Color(0, 204, 204));
        cancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel1MouseExited(evt);
            }
        });
        cancel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CANCEL");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -1, 80, 30));

        jPanel3.add(cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 110, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("New User? Click Here to Register");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 380, 30));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(370, 0, 380, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void cancel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel1MouseEntered
       
    }//GEN-LAST:event_cancel1MouseEntered

    private void cancel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel1MouseExited
        
    }//GEN-LAST:event_cancel1MouseExited

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
       
       
    }//GEN-LAST:event_loginMouseExited

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        sudsalogin su = new sudsalogin();
        su.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginMouseClicked

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cancel;
    private javax.swing.JPanel cancel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel login;
    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private void buttonBorderAnimation(JLabel login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void buttonDefaultColor(JLabel login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
