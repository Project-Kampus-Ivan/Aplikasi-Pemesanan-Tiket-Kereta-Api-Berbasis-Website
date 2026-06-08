
package koneksi;
import java.sql.*;
public class Koneksi {
    private static Connection conn;
    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_rutekereta","root","");
            }
        } catch(Exception e){ e.printStackTrace(); }
        return conn;
    }
}
