
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class MenuUtama extends javax.swing.JFrame {
    
    public MenuUtama() {
        initComponents();
        this.getContentPane().setBackground(Color.blue);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Pembayaran = new javax.swing.JButton();
        MenuU = new javax.swing.JButton();
        Pemesanan = new javax.swing.JButton();
        Laporan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Logout1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TOKO KUE MANIS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 500, 50));

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Terjamin enaknya....");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 90, -1, -1));

        Pembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jual1.png"))); // NOI18N
        Pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PembayaranActionPerformed(evt);
            }
        });
        getContentPane().add(Pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 400, 170, 80));

        MenuU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.png"))); // NOI18N
        MenuU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUActionPerformed(evt);
            }
        });
        getContentPane().add(MenuU, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 170, 80));

        Pemesanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beli.png"))); // NOI18N
        Pemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PemesananActionPerformed(evt);
            }
        });
        getContentPane().add(Pemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 400, 170, 80));

        Laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Laporan1.png"))); // NOI18N
        Laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanActionPerformed(evt);
            }
        });
        getContentPane().add(Laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(827, 400, 170, 80));

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 2, 12)); // NOI18N
        jLabel4.setText("LogOut");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1198, 486, 60, 30));

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 2, 12)); // NOI18N
        jLabel5.setText("Daftar Menu");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 90, 30));

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 2, 12)); // NOI18N
        jLabel6.setText("Pemesanan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 490, 90, 30));

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 2, 12)); // NOI18N
        jLabel7.setText("Pembayaran");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 486, 90, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simbol1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 50, 310, -1));

        Logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LgOut.png"))); // NOI18N
        Logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout1ActionPerformed(evt);
            }
        });
        getContentPane().add(Logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1097, 400, 170, 80));

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 2, 12)); // NOI18N
        jLabel8.setText("Laporan");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 491, 60, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUActionPerformed
        DaftarMenu dm = new DaftarMenu();
        dm.show();
        this.dispose(); 
    }//GEN-LAST:event_MenuUActionPerformed

    private void PemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PemesananActionPerformed
        Penjualan pj = new Penjualan();
        pj.show();
        this.dispose(); 
    }//GEN-LAST:event_PemesananActionPerformed

    private void PembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PembayaranActionPerformed
        Bayar by = new Bayar();
        by.show();
        this.dispose(); 
    }//GEN-LAST:event_PembayaranActionPerformed

    private void LaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanActionPerformed
            try{
    JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("LpPenjualan.jasper"),null, Koneksi.KoneksiDb());
    JasperPrint jpp = JasperFillManager.fillReport(getClass().getResourceAsStream("Laporan.jasper"),null, Koneksi.KoneksiDb());
    JasperViewer.viewReport(jp,false); 
    JasperViewer.viewReport(jpp,false);
}catch(Exception e){
    JOptionPane.showMessageDialog(rootPane, e);
}
    }//GEN-LAST:event_LaporanActionPerformed
    private void Logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout1ActionPerformed
         LogIn1 li = new LogIn1();
        li.show();
        this.dispose(); 
    }//GEN-LAST:event_Logout1ActionPerformed

    public static void main(String[] args) throws Exception {
        MenuUtama frame = new MenuUtama();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Laporan;
    private javax.swing.JButton Logout1;
    private javax.swing.JButton MenuU;
    private javax.swing.JButton Pembayaran;
    private javax.swing.JButton Pemesanan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
