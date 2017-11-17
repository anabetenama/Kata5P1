package kata5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class KATA5 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName ("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:BD.DB");
        
        Statement st = con.createStatement();
        String query = "SELECT * from PEOPLE";
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            
        }
    }
    
}
