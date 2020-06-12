
import java.awt.Color;

public class DaftarMenu extends javax.swing.JFrame {

    public DaftarMenu() {
        initComponents();
        this.getContentPane().setBackground(Color.blue);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KueKering = new javax.swing.JButton();
        KueBasah = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Kembali = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KueKering.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        KueKering.setText("Kue Kering");
        KueKering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KueKeringActionPerformed(evt);
            }
        });
        getContentPane().add(KueKering, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 213, 138, 51));

        KueBasah.setFont(new java.awt.Font("Sitka Subheading", 3, 18)); // NOI18N
        KueBasah.setText("Kue Basah");
        KueBasah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KueBasahActionPerformed(evt);
            }
        });
        getContentPane().add(KueBasah, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 213, 138, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jdl1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 240, 50));

        Kembali.setFont(new java.awt.Font("Sitka Text", 1, 10)); // NOI18N
        Kembali.setText("Kembali");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        getContentPane().add(Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simbol1.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KueKeringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KueKeringActionPerformed
        Menu m = new Menu();
        m.show();
        this.dispose(); 
    }//GEN-LAST:event_KueKeringActionPerformed

    private void KueBasahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KueBasahActionPerformed
        Menu2 mm = new Menu2();
        mm.show();
        this.dispose(); 
    }//GEN-LAST:event_KueBasahActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        MenuUtama mu = new MenuUtama();
        mu.show();
        this.dispose(); 
    }//GEN-LAST:event_KembaliActionPerformed

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
            java.util.logging.Logger.getLogger(DaftarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kembali;
    private javax.swing.JButton KueBasah;
    private javax.swing.JButton KueKering;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
