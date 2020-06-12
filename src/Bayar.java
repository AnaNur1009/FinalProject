import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.sql.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.LineBorder;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.compilers.JRBshEvaluator;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;

public class Bayar extends JFrame implements ActionListener{
    private final JPanel jpBayar =new JPanel ();
    private JLabel lblKode = new JLabel ("Kode Pesanan :"),lblTotal = new JLabel ("Total Bayar :"),lblDP = new JLabel ("Uang Muka :"),
            lblSisa = new JLabel ("Sisa Pembayaran :"),lblTF = new JLabel ("Transfer"),
            lblTunai = new JLabel ("Tunai");
    private JTextField txtKode=new JTextField(),txtTotal=new JTextField(),txtDP=new JTextField(),txtSisa=new JTextField();
    private JCheckBox ChkTunai = new JCheckBox(),ChkTF = new JCheckBox();
    private JButton btnCari = new JButton ("Cari Kode"),btnSimpan = new JButton ("Simpan"),
            btnBersih = new JButton ("Bersih"),btnKembali = new JButton ("Kembali"),
            btnCetak = new JButton ("Cetak");
  
Bayar(){
        super("Transaksi Pembayaran");
        setSize(410,450);
        jpBayar.setLayout(null);
        jpBayar.setBackground(Color.BLUE);
        
    lblKode.setBounds(15, 20, 160, 25);
    lblTotal.setBounds(15, 50, 160, 25);
    lblDP.setBounds(15, 80, 160, 25);
    lblSisa.setBounds(15, 110, 160, 25);
    lblTF.setBounds(120, 170, 160, 25);
    lblTunai.setBounds(250, 170, 160, 25);
    ChkTF.setBounds(70, 170, 50, 25);
    ChkTunai.setBounds(200, 170, 50, 25);
    txtKode.setBounds(130, 20, 90, 25);
    txtTotal.setBounds(130, 50, 90, 25);
    txtDP.setBounds(130, 80, 90, 25);
    txtSisa.setBounds(130, 110, 90, 25);
    btnBersih.setBounds(245,110,95,25);
    btnSimpan.setBounds(20,260,95,25);
    btnCetak.setBounds(150,260,95,25);
    btnKembali.setBounds(280,260,95,25);
    btnCari.setBounds(245,20,95,25);
      
        jpBayar.add(lblTotal);
        jpBayar.add(txtTotal);
        jpBayar.add(lblDP);
        jpBayar.add(lblTF);
        jpBayar.add(lblTunai);
        jpBayar.add(ChkTunai);
        jpBayar.add(ChkTF);
        jpBayar.add(txtDP);
        jpBayar.add(lblSisa);
        jpBayar.add(txtSisa);
        jpBayar.add(lblKode);
        jpBayar.add(txtKode);
        jpBayar.add(btnSimpan);
        jpBayar.add(btnBersih);
        jpBayar.add(btnKembali);
        jpBayar.add(btnCetak);
        jpBayar.add(btnCari);
        
         btnBersih.addActionListener(this);
         btnSimpan.addActionListener(this);
         btnKembali.addActionListener(this);
         btnCari.addActionListener(this);
         btnCetak.addActionListener(this);
         ChkTF.addActionListener(this);
         ChkTunai.addActionListener(this);
         
        getContentPane().add(jpBayar);
       setVisible(true);
    getContentPane().add(jpBayar);
}

public void actionPerformed(ActionEvent ae){
        Object obj = ae.getSource();
        if (obj == btnKembali){
                Kembali();  
        }
        if (obj == btnSimpan){
                Simpan();  
        }
         if (obj == btnCetak){
                Cetak();  
        }
         if (obj == btnBersih){
                Bersih();  
        }
          if (obj == btnCari){
                Cari();  
        }
        Jumlah();
}
void Jumlah(){
 Double Hitung = (Double.parseDouble(txtTotal.getText())-Double.parseDouble(txtDP.getText()));
  txtSisa.setText(Hitung.toString());
}
void Simpan(){
     try{
       Koneksi ObjKoneksi = new Koneksi();
        Connection con = ObjKoneksi.KoneksiDb();
        Statement st = con.createStatement();
        String Sistem;
         Sistem = "";
          if(ChkTF.isSelected()){
        Sistem += ChkTF.getText()+"Transfer";
        }
     if(ChkTunai.isSelected()){
        Sistem += ChkTunai.getText()+"Tunai";
    }
       String sql = "insert into bayar(Kode_Pesanan,Total, DP, Sisa,Sistem)"
               + " values ('"+txtKode.getText()+"','"+txtTotal.getText()+"','"+txtDP.getText()+"','"+txtSisa.getText()+"','"+Sistem+"')";
             
                int row =st.executeUpdate(sql);
                if (row ==1){
                JOptionPane.showMessageDialog(null,"Data sudah " +
                        " disimpan","infomasi",JOptionPane.INFORMATION_MESSAGE);
                con.close();
                }
                }catch(SQLException e){
       JOptionPane.showMessageDialog(null,"Data tidak ditambahkan ke" +
                        e.getMessage(),"infomasi",JOptionPane.INFORMATION_MESSAGE);
                }
}
public void Cetak(){
      try{
        Koneksi ObjKoneksi = new Koneksi();
        Connection con = ObjKoneksi.KoneksiDb();
        Statement st = con.createStatement();
        String report = ("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FinalProject\\src\\StrukPembayaran.jrxml");
        HashMap hp = new HashMap();
        hp.put("Bayar",txtKode.getText());
        JasperReport jp = JasperCompileManager.compileReport(report);
        JasperPrint jpr = JasperFillManager.fillReport(jp, hp, Koneksi.KoneksiDb());
        JasperViewer.viewReport(jpr,false);
        }catch(Exception e){
    JOptionPane.showMessageDialog(rootPane, e);
        }}
void Bersih(){
    txtTotal.setText("");
    txtDP.setText("");
    txtSisa.setText("");
    txtKode.setText("");
}
void Kembali(){
 MenuUtama mu = new MenuUtama();
        mu.show();
        this.dispose();   
}
void Cari(){
 try {
            Koneksi ObjKoneksi = new Koneksi();
            Connection con = ObjKoneksi.KoneksiDb();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM penjualan where Kode_Pesanan = '"+txtKode.getText()+"'";
            ResultSet set = st.executeQuery(sql);
            
            while(set.next()){
                txtTotal.setText(set.getString("Total_Harga"));
                txtDP.setText(set.getString("Uang_Muka"));    
            }}
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"Gagal Query" +
                        e.getMessage(),"infomasi",JOptionPane.INFORMATION_MESSAGE);  
        }   
}
public static void main(String[] args) {
       new Bayar();
        
     }
}
