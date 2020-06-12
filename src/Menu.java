import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Menu extends JFrame implements ActionListener {
    private JPanel jpKue = new JPanel();
    private JLabel lblKering = new JLabel ("KUE KERING : "),lblKue1 = new JLabel ("1.Nastar"),
    lblKue2 = new JLabel ("2.Choco Chips"),lblKue3 = new JLabel ("3.Kastengel"),lblKue4 = new JLabel ("4.Putri Salju"),
    lblKue5 = new JLabel ("5.Lidah Kucing"),lblKue6= new JLabel ("6.Semprit"),
    lblKue7 = new JLabel ("7.Kue Kacang"),lblHarga1= new JLabel("Rp. 15000"),
    lblHarga2= new JLabel("Rp. 20000"),lblHarga3= new JLabel("Rp. 15000"),
    lblHarga4= new JLabel("Rp. 12500"),lblHarga5= new JLabel("Rp. 12500"),lblHarga6= new JLabel("Rp. 10000"),
    lblHarga7= new JLabel("Rp. 10000"),lblJenis =new JLabel("per Toples");
    private JLabel lblLogo1= new JLabel (new ImageIcon("jdl.PNG"));
    private JButton btnKeluar = new JButton ("Kembali");
    private JProgressBar barisProgres = new JProgressBar();
    Menu(){
        super("Menu Jenis Kue");
    setSize(650,600);
    jpKue.setLayout(null);
     Color Warna = Color.white;
    lblLogo1.setBorder(new LineBorder(Warna,1));
        getContentPane().add(lblLogo1,BorderLayout.NORTH);
        jpKue.setBackground(Color.BLUE);
        
    lblKering.setBounds(100, 75,130, 25);
    lblKue1.setBounds(200, 75,130, 25);
    lblHarga1.setBounds(400, 75,130, 25);
    lblKue2.setBounds(200, 100,130, 25);
    lblHarga2.setBounds(400, 100,130, 25);
    lblKue3.setBounds(200, 125,130, 25);
    lblHarga3.setBounds(400, 125,130, 25);
    lblKue4.setBounds(200, 150,130, 25);
    lblHarga4.setBounds(400, 150,130, 25);
    lblKue5.setBounds(200, 175,130, 25);
    lblHarga5.setBounds(400, 175,130, 25);
    lblKue6.setBounds(200, 200,130, 25);
    lblHarga6.setBounds(400, 200,130, 25);
    lblKue7.setBounds(200, 225,130, 25);
    lblHarga7.setBounds(400, 225,130, 25);
    lblJenis.setBounds(550, 150,130, 25);
     
    btnKeluar.setBounds(275, 400,85, 25);
    
     jpKue.add(lblKering);
     jpKue.add(lblKue1);
     jpKue.add(lblKue2);
     jpKue.add(lblKue3);
     jpKue.add(lblKue4);
     jpKue.add(lblKue5);
     jpKue.add(lblKue6);
     jpKue.add(lblKue7);
     
     jpKue.add(lblHarga1);
     jpKue.add(lblHarga2);
     jpKue.add(lblHarga3);
     jpKue.add(lblHarga4);
     jpKue.add(lblHarga5);
     jpKue.add(lblHarga6);
     jpKue.add(lblHarga7);
     
     jpKue.add(lblJenis);  
     jpKue.add(btnKeluar);
     btnKeluar.addActionListener(this);
       getContentPane().add(jpKue);
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        Object obj = ae.getSource();
        if (obj == btnKeluar){
                Keluar();
        }
    }
    void Keluar(){
        DaftarMenu mu = new DaftarMenu();
        mu.show();
        this.dispose();
    }
    public static void main(String[] args) {
        new Menu();
    }
}