import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    static Connection con=null;
    public static Connection connect(){    
       try{
            String url="jdbc:mysql://localhost:3306/hospital";
            String username="root";
            String password="Anirban@2001";

        ///coneection establishment

            con=DriverManager.getConnection(url,username,password);
            System.out.println("connection established");

        }
        catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
