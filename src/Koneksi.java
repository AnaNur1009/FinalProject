
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {   

    

    
    Connection Koneksi = null;
    public static Connection KoneksiDb(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection Koneksi = DriverManager.getConnection("jdbc:mysql://localhost/kasir","root","");
           return Koneksi;
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
        }
    }

    

    

    
}
    


