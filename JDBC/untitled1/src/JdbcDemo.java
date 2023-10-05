import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/JDBC";
        String uname = "postgres";
        String pass = "*******";
        String sql = "SELECT * FROM Persons";

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection established");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()){
            System.out.println("THIS IS NEW RECORD");
            System.out.println("PersonID : " + rs.getString("PersonID"));
            System.out.println("FirstName : " + rs.getString("FirstName"));
            System.out.println("LastName : " + rs.getString("LastName"));
            System.out.println("Address : " + rs.getString("Address"));
            System.out.println("City : " + rs.getString("City"));
        }

        con.close();
        System.out.println("Connection closed");
    }
}
