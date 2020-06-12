import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.LineBorder;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
public class Penjualan extends JFrame implements ActionListener{
    private final JPanel jpAntarMuka =new JPanel ();
    private JLabel lblKode = new JLabel ("Kode Pesanan"),lblTanggal = new JLabel("Tgl Pemesanan : "),
    lblNama = new JLabel("Nama Pemesan : "),lblJenisKue = new JLabel("Jenis Kue : "),
    lblJumlah = new JLabel("Jmlh Pesanan : "),lblHarga = new JLabel("Harga : "),
    lblDaftarPesanan = new JLabel("Daftar Pesanan: "),lblAlamat = new JLabel("Alamat Pemesan : "),
    lblTotal = new JLabel("Total Harga : "),lblDP = new JLabel("Uang Muka : ");
    private JTextField txtKode=new JTextField(),txtTanggal=new JTextField(),txtNamaKue=new JTextField(),txtJumlah=new JTextField(),
    txtHarga=new JTextField(),txtHarga2=new JTextField(),txtAlamat=new JTextField(),txtNama=new JTextField(),
    txtBayar=new JTextField();
    private JComboBox cboJenisKue = new JComboBox(),cboKategori = new JComboBox(),cboKategori1 = new JComboBox();
    private JButton btnTambah = new JButton ("Simpan"),btnUbah = new JButton ("Ubah"),btnHitung = new JButton ("Hitung"),
    btnBersih = new JButton ("Bersih"),btnKeluar = new JButton ("Kembali"),btnLaporan = new JButton ("Cetak "),
    btnBayar =new JButton("Bayar"),btnHapus = new JButton ("Hapus ");
    String[] strJdl={"Kode Pesanan ","Tgl Pemesanan","Nama Pemesan",
    "Jenis Kue","Nama Kue","Jumlah Pesanan","Kategori", "Total Harga", "Alamat Pemesan",
    "Pembayaran", "Pengantaran"};
    
    JTable tabel = new JTable();
JScrollPane skrTabel = new JScrollPane();
    
    Penjualan(){
        super("Entri Data Pesanan");
        setSize(900,500);
        jpAntarMuka.setLayout(null);
        jpAntarMuka.setBackground(Color.BLUE);
        
        skrTabel.getViewport().add(tabel);
       tabel.setEnabled(true);
       skrTabel.setBounds(15, 360, 700, 250);
     
        lblKode.setBounds(15, 20, 110, 25);
        lblTanggal.setBounds(15, 55, 110, 25);
        lblNama.setBounds(15, 90, 100, 25);
        lblAlamat.setBounds(15, 125, 110, 25);
        lblJenisKue.setBounds(15, 160, 110, 25);
        lblJumlah.setBounds(500, 160, 110, 25);
        lblDaftarPesanan.setBounds(15, 325,110, 25);
        lblTotal.setBounds(510, 20, 120, 25);
        lblDP.setBounds(510, 70, 120, 25);
        lblHarga.setBounds(245, 160, 120, 25);
        
        txtKode.setBounds(130, 20, 100, 25);
        txtTanggal.setBounds(130, 55, 100, 25);
        txtNama.setBounds(130, 90, 130, 25);
        txtAlamat.setBounds(130, 125, 100, 25);
        cboJenisKue.setBounds(15, 195, 100, 25);
        txtNamaKue.setBounds(130, 195, 100, 25);
        txtHarga.setBounds(235, 195, 100, 25);
        txtHarga2.setBounds(600, 20, 150, 30);;
        cboKategori.setBounds(345, 195, 80, 25);
        txtJumlah.setBounds(510, 195, 50, 25);
        cboKategori1.setBounds(575, 195, 80, 25);
        txtBayar.setBounds(600, 70, 150, 30);
        
        btnTambah.setBounds(670, 195,85, 25);
        btnBersih.setBounds(770, 195,85, 25);
        btnUbah.setBounds(670, 235,85, 25);
        btnHapus.setBounds(770, 235,85, 25);
        btnHitung.setBounds(760, 130,85, 25);
        btnBayar.setBounds(600, 130,85, 25);
        btnKeluar.setBounds(760, 420,85, 25);
        btnLaporan.setBounds(760, 370,85, 25);
        
        jpAntarMuka.add(lblKode);
        jpAntarMuka.add(lblTanggal);
        jpAntarMuka.add(lblNama);
        jpAntarMuka.add(lblJenisKue);
        jpAntarMuka.add(lblDaftarPesanan);
        jpAntarMuka.add(lblJumlah);
        jpAntarMuka.add(lblHarga);
        jpAntarMuka.add(lblAlamat);
        jpAntarMuka.add(lblTotal);
        jpAntarMuka.add(lblDP);
        
        jpAntarMuka.add(txtKode);
        jpAntarMuka.add(txtTanggal);
        jpAntarMuka.add(txtNama);
        jpAntarMuka.add(cboJenisKue);
        jpAntarMuka.add(txtNamaKue);
       jpAntarMuka.add(txtJumlah);
       jpAntarMuka.add(txtHarga);
       jpAntarMuka.add(txtHarga2);
       jpAntarMuka.add(txtAlamat);
       jpAntarMuka.add(txtBayar);
       jpAntarMuka.add(cboKategori);
       jpAntarMuka.add(cboKategori1);
        
        jpAntarMuka.add(btnTambah);
        jpAntarMuka.add(btnUbah);
        jpAntarMuka.add(btnHapus);
        jpAntarMuka.add(btnHitung);
        jpAntarMuka.add(btnLaporan);
        jpAntarMuka.add(btnBersih);
        jpAntarMuka.add(btnKeluar);
        jpAntarMuka.add(btnBayar);
        cboJenisKue.addItem("Kering");
        cboJenisKue.addItem("Basah");
        cboKategori.addItem("Toples");
        cboKategori.addItem("Biji");
        cboKategori1.addItem("Toples");
        cboKategori1.addItem("Biji");
        btnTambah.addActionListener(this);
        btnUbah.addActionListener(this);
        btnHapus.addActionListener(this);
        btnHitung.addActionListener(this);
        btnBersih.addActionListener(this);
        btnKeluar.addActionListener(this);
        btnBayar.addActionListener(this);
        btnLaporan.addActionListener(this);
      getContentPane().add(jpAntarMuka);
      setVisible(true); 
     jpAntarMuka.add(skrTabel);
    getContentPane().add(jpAntarMuka);
    TampilTabel();} 
    public void actionPerformed(ActionEvent ae){
        Object obj = ae.getSource();
        if (obj == btnTambah){
                Tambah(); 
        }
         if (obj == btnUbah){
            Ubah();
        }
          if (obj == btnHitung){
            Hitung();
        }
          if(obj == btnKeluar){ 
              Keluar();
          }
          if(obj == btnLaporan){ 
              Laporan();
          }
          if(obj == btnBayar){ 
              Bayar();
          }
          if(obj == btnHapus){ 
              Hapus();
          }
          Bersih();}
   void Bersih(){
    txtKode.setText("");
    txtTanggal.setText("");
    txtNama.setText("");
    txtAlamat.setText("");
    cboJenisKue.setSelectedIndex(0);
    txtNamaKue.setText("");
    txtHarga.setText("");
    txtJumlah.setText("");
    txtHarga2.setText("");
    txtBayar.setText("");
    cboKategori.setSelectedIndex(0);}
    void Tambah() {
        try{
       Koneksi ObjKoneksi = new Koneksi();
        Connection con = ObjKoneksi.KoneksiDb();
        Statement st = con.createStatement();
       String sql = "insert into penjualan(Kode_Pesanan, Tgl_Pemesanan, Nama_Pemesan, Alamat,Jenis_Kue ,Nama_Kue, Harga_Kue, "
               + "Total_Harga,Uang_Muka,Jumlah, Kategori)"
               + " values ('"+txtKode.getText()+"','"+txtTanggal.getText()+"','"+txtNama.getText()+"','"+txtAlamat.getText()
               +"','"+cboJenisKue.getSelectedItem()+"','"+txtNamaKue.getText()+"','"+txtHarga.getText()
               +"','"+txtHarga2.getText()+"','"+txtBayar.getText()
               +"','"+txtJumlah.getText()+"','"+cboKategori.getSelectedItem()+"')";
          int row =st.executeUpdate(sql);
          if (row ==1){
          JOptionPane.showMessageDialog(null,"Data Sudah Disimpan","infomasi",JOptionPane.INFORMATION_MESSAGE);
          con.close();}
          }catch(SQLException e){
         JOptionPane.showMessageDialog(null,"Data Tidak Disimpan" +e.getMessage(),"infomasi",JOptionPane.INFORMATION_MESSAGE);}
        TampilTabel();}
      
    void Ubah(){
         try{
       Koneksi ObjKoneksi = new Koneksi();
        Connection con = ObjKoneksi.KoneksiDb();
        Statement st = con.createStatement();
       String sql = "update penjualan set Tgl_Pemesanan = '"+txtTanggal.getText()+"',Nama_Pemesan = '"+txtNama.getText()
               +"',Alamat = '"+txtAlamat.getText()+"',Jenis_Kue = '"+cboJenisKue.getSelectedItem()
               +"',Nama_Kue='"+txtNamaKue.getText()+"',Harga_Kue='"+txtHarga.getText()
               +"',Total_Harga='"+txtHarga2.getText()+"',Uang_Muka='"+txtBayar.getText()
               +"',Jumlah='"+txtJumlah.getText()+"',Kategori='"+cboKategori.getSelectedItem()+"' where Kode_Pesanan = '"+txtKode.getText()+"'";
             
                int row =st.executeUpdate(sql); 
                if (row ==1){
                JOptionPane.showMessageDialog(null,"Data Berhasil Diubah","infomasi",JOptionPane.INFORMATION_MESSAGE);
                con.close();
                }
                }catch(SQLException e){
       JOptionPane.showMessageDialog(null,"Data Tidak Diubah" +e.getMessage(),"infomasi",JOptionPane.INFORMATION_MESSAGE);
                }
        TampilTabel();
    }
    void Hitung(){
      Double Total = (Float.parseFloat(txtHarga.getText())* Double.parseDouble(txtJumlah.getText()));
      txtHarga2.setText(Total.toString());
      Double Bayar = (Float.parseFloat(txtHarga.getText())* Double.parseDouble(txtJumlah.getText()))* 0.2;
      txtBayar.setText(Bayar.toString());  }
    void Keluar(){
        MenuUtama mu = new MenuUtama();
        mu.show();
        this.dispose();
    }
    void Bayar(){
      Bayar by = new Bayar();
        by.show();
        this.dispose();  
    }
    void Hapus(){
         try{
       Koneksi ObjKoneksi = new Koneksi();
        Connection con = ObjKoneksi.KoneksiDb();
        Statement st = con.createStatement();
        String sql = "delete from penjualan where Kode_Pesanan = '"+txtKode.getText()+"' ";
         int row = st.executeUpdate(sql);
        if (row ==1){
                JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus","infomasi",JOptionPane.INFORMATION_MESSAGE);
               
                con.close();

                }
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Data Tidak Dihapus","infomasi",JOptionPane.
                INFORMATION_MESSAGE);
    }
        TampilTabel();
        
    }
    void Laporan()  {
        try{
        Koneksi ObjKoneksi = new Koneksi();
        Connection con = ObjKoneksi.KoneksiDb();
        Statement st = con.createStatement();
        String report = ("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FinalProject\\src\\StrukPemesanan.jrxml");
        HashMap hp = new HashMap();
        hp.put("pesan",txtKode.getText());
        JasperReport jp = JasperCompileManager.compileReport(report);
        JasperPrint jpr = JasperFillManager.fillReport(jp, hp, Koneksi.KoneksiDb());
        JasperViewer.viewReport(jpr,false);
        }catch(Exception e){
    JOptionPane.showMessageDialog(rootPane, e);
        }}
    void TampilTabel(){
        try {
            Koneksi ObjKoneksi = new Koneksi();
            Connection con = ObjKoneksi.KoneksiDb();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM penjualan";
            ResultSet set = st.executeQuery(sql);
            //menampilkan data ke Tabel
            ResultSetTableModel model = new ResultSetTableModel(set);
            tabel.setModel(model);
            while(set.next()){
                txtKode.setText(set.getString("Kode_Pesanan"));
                txtTanggal.setText(set.getString("Tgl_Pemesanan"));
                txtNama.setText(set.getString("Nama_Pemesan"));
                txtAlamat.setText(set.getString("Alamat"));
                txtHarga2.setText(set.getString("Total_Harga"));
                txtBayar.setText(set.getString("Uang_Muka"));
                cboJenisKue.addItem(set.getString("Jenis_Kue"));
                txtNamaKue.setText(set.getString("Nama_Kue"));
                txtHarga.setText(set.getString("Harga_Kue"));
                txtJumlah.setText(set.getString("Jumlah"));
                cboKategori.addItem(set.getString("Kategori")); 
            }}
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"Gagal Query" +
                        e.getMessage(),"infomasi",JOptionPane.INFORMATION_MESSAGE);  
        }}
public static void main(String[] args) {
        new Penjualan();
  }

    
}



