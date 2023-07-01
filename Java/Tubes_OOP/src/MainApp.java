/*
 * @author Abiyoga Dhaniswara
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Database db = new Database();
            db.setTableDatabase("CREATE TABLE IF NOT EXISTS Account (ID_Account INT AUTO_INCREMENT PRIMARY KEY, Nama_Lengkap TEXT NOT NULL, Umur INT NOT NULL, No_Hp TEXT NOT NULL, Username TEXT NOT NULL UNIQUE, Password TEXT NOT NULL)");
            db.setTableDatabase("CREATE TABLE IF NOT EXISTS Transaksi (ID_Transaksi INT AUTO_INCREMENT PRIMARY KEY, ID_Account INT NOT NULL, Kota_Asal TEXT NOT NULL, Kota_Tujuan TEXT NOT NULL, Tipe_Kereta TEXT NOT NULL, Jadwal TEXT NOT NULL, Jumlah_Beli INT NOT NULL, Total_Harga INT NOT NULL)");
            db.setKota("Jakarta","Sukabumi","Bandung","Semarang");

            LoginFrame Login = new LoginFrame();
            Login.setVisible(true);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }    
}
