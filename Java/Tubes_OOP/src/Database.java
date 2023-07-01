import java.sql.*;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author Abiyoga Dhaniswara
 */
public class Database {

    
    private static ArrayList<String> Kota = new ArrayList<>();
    public static Connection getConnection() throws SQLException{
        Connection conn = null;
        try{
            String url = "jdbc:mysql://localhost:3306/tubes_oop";
            String user = "root";
            String password = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(url,user,password);
        } catch(SQLException e){
           JOptionPane.showMessageDialog(null,"Koneksi ke Database gagal! \nerror: "+e.getMessage());
           System.exit(0);
        }
        return conn;
    }
    
    public void setTableDatabase(String sql){
        try(Connection conn = getConnection();
                Statement stmt = conn.createStatement()){
            stmt.execute(sql);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Gagal set Database! \nerror :"+e.getMessage());
            System.exit(0);
        }
    }
    
    protected void setKota(String kota){
        Kota.add(kota);
    }
    //Overloading
    protected void setKota(String kota1, String kota2){
        Kota.add(kota1);
        Kota.add(kota2);
    }
    //Overloading
    protected void setKota(String kota1, String kota2, String kota3){
        Kota.add(kota1);
        Kota.add(kota2);
        Kota.add(kota3);
    }
    //Overloading
    protected void setKota(String kota1, String kota2, String kota3, String kota4){
        Kota.add(kota1);
        Kota.add(kota2);
        Kota.add(kota3);
        Kota.add(kota4);
    }
    
    public static ArrayList<String> getKota(){
        return Database.Kota;
    }
}
