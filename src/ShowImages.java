/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinm
 */
public class ShowImages extends javax.swing.JFrame {

    /**
     * Creates new form ShowImages
     */
    public ShowImages() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        ShowPanel = new javax.swing.JPanel();
        ShowLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cost = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        artist = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 77, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        username.setForeground(new java.awt.Color(255, 77, 0));
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 120, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 70));

        ShowPanel.setBackground(new java.awt.Color(255, 255, 255));
        ShowPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 77, 0), 4));
        ShowPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ShowLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        ShowPanel.add(ShowLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 350, 230));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("COST      :");
        ShowPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("TYPE      :");
        ShowPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("TITLE     :");
        ShowPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        jButton1.setText("CLOSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ShowPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("ARTIST   :");
        ShowPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, 20));

        cost.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShowPanel.add(cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 180, 20));

        type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShowPanel.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 180, 20));

        title.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShowPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 180, 20));

        artist.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShowPanel.add(artist, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 180, 20));

        getContentPane().add(ShowPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 550, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Home h=new Home();
        h.setVisible(true);
        h.username.setText(username.getText());
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ShowImages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowImages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowImages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowImages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowImages().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel ShowLabel;
    public javax.swing.JPanel ShowPanel;
    public javax.swing.JLabel artist;
    public javax.swing.JLabel cost;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JLabel title;
    public javax.swing.JLabel type;
    public javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
