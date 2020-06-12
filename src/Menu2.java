import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Menu2 extends JFrame implements ActionListener {
    private JPanel jpKue = new JPanel();
    private JLabel lblBasah = new JLabel ("KUE BASAH :"),lblKue8 = new JLabel ("1. Putu Ayu"),
    lblKue9 = new JLabel ("2. Banana Cake"),lblKue10 = new JLabel ("3. Bika Ambon"),lblKue11 = new JLabel ("4. Brownis"),
    lblKue12 = new JLabel ("5. Cup Cake"),lblKue13 = new JLabel ("6. Bolu Kukus"),lblKue14 = new JLabel ("7. Bakpao"),
    lblHarga8= new JLabel("Rp. 1000"),lblHarga9= new JLabel("Rp. 2000"),lblHarga10= new JLabel("Rp. 2000"),
    lblHarga11= new JLabel("Rp. 2000"),lblHarga12= new JLabel("Rp. 2500"),lblHarga13= new JLabel("Rp. 1500"),
    lblHarga14= new JLabel("Rp. 2000"),lblJenis =new JLabel("per Biji");
    private JLabel lblLogo1= new JLabel (new ImageIcon("jdl.PNG"));
    private JButton btnKeluar = new JButton ("Kembali");
    private JProgressBar barisProgres = new JProgressBar();
    Menu2(){
        super("Menu Jenis Kue");
    setSize(650,600);
    jpKue.setLayout(null);
     Color Warna = Color.white;
    lblLogo1.setBorder(new LineBorder(Warna,1));
        getContentPane().add(lblLogo1,BorderLayout.NORTH);
        jpKue.setBackground(Color.BLUE);
        
    lblBasah.setBounds(100, 75,600, 25);
    lblKue8.setBounds(200, 75,130, 25);
    lblHarga8.setBounds(400, 75,130, 25);
    lblKue9.setBounds(200, 100,130, 25);
    lblHarga9.setBounds(400, 100,130, 25);
    lblKue10.setBounds(200, 125,130, 25);
    lblHarga10.setBounds(400, 125,130, 25);
    lblKue11.setBounds(200, 150,130, 25);
    lblHarga11.setBounds(400, 150,130, 25);
    lblKue12.setBounds(200, 175,130, 25);
    lblHarga12.setBounds(400, 175,130, 25);
    lblKue13.setBounds(200, 200,130, 25);
    lblHarga13.setBounds(400, 200,130, 25);
    lblKue14.setBounds(200, 225,130, 25); 
    lblHarga14.setBounds(400, 225,130, 25);
    lblJenis.setBounds(550, 150,130, 25);
    
    btnKeluar.setBounds(275, 400,85, 25);
      
     jpKue.add(lblBasah);
     jpKue.add(lblKue8);
     jpKue.add(lblKue9);
     jpKue.add(lblKue10);
     jpKue.add(lblKue11);
     jpKue.add(lblKue12);
     jpKue.add(lblKue13);
     jpKue.add(lblKue14);
     
     jpKue.add(lblHarga8);
     jpKue.add(lblHarga9);
     jpKue.add(lblHarga10);
     jpKue.add(lblHarga11);
     jpKue.add(lblHarga12);
     jpKue.add(lblHarga13);
     jpKue.add(lblHarga14);
     
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
        new Menu2();
    }
}