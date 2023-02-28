


import java.awt.Color;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCC-COMLAB
 */
public class dashBoardPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form dashBoardPage
     */
    public dashBoardPage() {
        initComponents();
        
    }
    
    Color navcolor= new Color(0,102,102);
    Color headcolor= new Color(0,204,204);
    Color bodycolor = new Color(0,153,153);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        settings = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        manageUser = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        reports = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3);
        jPanel3.setBounds(500, 0, 140, 180);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("MILKTEA SALES TRACKER");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 370, 50);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("M and M TANDEM");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 60, 170, 14);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 724, 172));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(null);

        settings.setBackground(new java.awt.Color(0, 204, 204));
        settings.setPreferredSize(new java.awt.Dimension(160, 160));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });
        settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsfolder/icons8-gear-100.png"))); // NOI18N
        settings.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 90));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SETTINGS");
        settings.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 120, -1));

        jPanel2.add(settings);
        settings.setBounds(520, 60, 120, 130);

        manageUser.setBackground(new java.awt.Color(0, 204, 204));
        manageUser.setPreferredSize(new java.awt.Dimension(160, 160));
        manageUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageUserMouseExited(evt);
            }
        });
        manageUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsfolder/icons8-admin-settings-male-100.png"))); // NOI18N
        manageUser.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 90));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MANAGE USER");
        manageUser.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 120, -1));

        jPanel2.add(manageUser);
        manageUser.setBounds(50, 60, 120, 130);

        reports.setBackground(new java.awt.Color(0, 204, 204));
        reports.setPreferredSize(new java.awt.Dimension(160, 160));
        reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsMouseExited(evt);
            }
        });
        reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsfolder/icons8-graph-report-100.png"))); // NOI18N
        reports.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 90));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("REPORTS");
        reports.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 120, -1));

        jPanel2.add(reports);
        reports.setBounds(290, 60, 120, 130);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 172, 724, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUserMouseEntered
       manageUser.setBackground(navcolor); 
    }//GEN-LAST:event_manageUserMouseEntered

    private void manageUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUserMouseExited
        manageUser.setBackground(headcolor);
    }//GEN-LAST:event_manageUserMouseExited

    private void reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseEntered
       reports.setBackground(navcolor);
    }//GEN-LAST:event_reportsMouseEntered

    private void reportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseExited
        reports.setBackground(headcolor); 
    }//GEN-LAST:event_reportsMouseExited

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
       settings.setBackground(navcolor);
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        settings.setBackground(headcolor);
    }//GEN-LAST:event_settingsMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel manageUser;
    private javax.swing.JPanel reports;
    private javax.swing.JPanel settings;
    // End of variables declaration//GEN-END:variables
}