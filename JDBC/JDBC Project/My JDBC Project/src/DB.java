import java.sql.*;

public class DB {

    static Connection conn=null;
    public static Connection connect()throws SQLException
    {
        try {
        

            String url="jdbc:mysql://localhost:3306/login";
            String username="root";
            String password="Prince@2001";

            con=DriverManager.getConnection(url,username,password);
            System.out.println("connection established");
    
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
    
}
