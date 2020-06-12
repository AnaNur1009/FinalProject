
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class LogIn1 extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    Statement st;
    public LogIn1() {
        initComponents();
        this.getContentPane().setBackground(Color.blue);
    }

   public void cek(){
        con = Koneksi.KoneksiDb();
        
        try {
            st = con.createStatement();
            String sql = "SELECT * FROM user where username = '"+txtName.getText()+"' and password = '"+txtPass.getText()+"'";
            rs = st.executeQuery(sql);
            
            if(rs.next()){
                if(rs.getString("level").equals("admin")){
                    MenuUtama mu = new MenuUtama();
                    mu.show();
                    this.dispose();
                
                }
            }else{
                JOptionPane.showMessageDialog(null, "Maaf password atau username anda salah");
                txtName.setText("");
                txtPass.setText("");
                
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jdl1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        lblName.setText("Username :");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 100, 38));

        lblPass.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        lblPass.setText("Password  :");
        getContentPane().add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 90, 30));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 270, 30));

        btnLogin.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        btnLogin.setText("LogIn");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        btnClear.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        jdl1.setBackground(new java.awt.Color(153, 153, 0));
        jdl1.setFont(new java.awt.Font("Lucida Console", 3, 24)); // NOI18N
        jdl1.setForeground(new java.awt.Color(255, 255, 255));
        jdl1.setText("      SELAMAT DATANG di TOKO KUE MANIS");
        jdl1.setOpaque(true);
        getContentPane().add(jdl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 45));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LogIn");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 80, 30));

        jLabel2.setBackground(new java.awt.Color(153, 153, 0));
        jLabel2.setFont(new java.awt.Font("MV Boli", 3, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manajemen Informatika");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 680, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoUser.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 270, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtName.setText("");
                txtPass.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        cek();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jdl1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPass;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
