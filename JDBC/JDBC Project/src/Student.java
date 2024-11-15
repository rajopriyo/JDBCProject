import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import java.sql.*;

public class Student {
    
    public void createDatabase()
    {
        try {
        
            String url="jdbc:mysql://localhost:3306/student";
            String username="root";
            String password="Prince@2001";
    
            Connection conn= DriverManager.getConnection(url, username, password);
            Statement stm= conn.createStatement();
            String query="create database Employee";
            stm.execute(query);
            System.out.println("Database created Successfully = ");
            conn.close();
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void createTable()
    {
        try {
        
            String url="jdbc:mysql://localhost:3306/student";
            // String db="student";
            String username="root";
            String password="Prince@2001";
    
            Connection conn= DriverManager.getConnection(url, username, password);
            Statement stm= conn.createStatement();
            String query="create table Student (roll_no int(3),name varchar(50),email varchar(100))";
            stm.execute(query);
            System.out.println("Table created Successfully");
            conn.close();
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createData()
    {
        try {
        
            String url="jdbc:mysql://localhost:3306/student";
            // String db="student";
            String username="root";
            String password="Prince@2001";
    
            Connection conn= DriverManager.getConnection(url, username, password);
            String query="INSERT into student (roll_no,name,email) VALUES(?,?,?)";
            PreparedStatement pstm= conn.prepareStatement(query);
            pstm.setInt(1,52);
            pstm.setString(2, "Rajopriyo");
            pstm.setString(3, "rajopriyochanda2001@gmail.com");

            pstm.execute();
            System.out.println("data inserted successfully");
            conn.close();
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void readData()
    {
        try {
        
            String url="jdbc:mysql://localhost:3306/student";
            // String db="student";
            String username="root";
            String password="Prince@2001";
    
            Connection conn= DriverManager.getConnection(url, username, password);
            String query="select *from student";
            Statement stm= conn.createStatement();
          

            ResultSet rs=stm.executeQuery(query);
            System.out.println("read successfully");
            while(rs.next())
            {
                System.out.println(" Roll No= "+rs.getInt(1));
                System.out.println(" Name= "+rs.getString(2));
                System.out.println(" Email= "+rs.getString(3));
            }   

            conn.close();
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteData()
    {
        try {
        
            String url="jdbc:mysql://localhost:3306/student";
            // String db="student";
            String username="root";
            String password="Prince@2001";
    
            Connection conn= DriverManager.getConnection(url, username, password);
            Statement stm= conn.createStatement();
            String query="DELETE from student where email='rajopriyochanda2001@gmail.com'";
            stm.execute(query);
            System.out.println("deleted Successfully");
            conn.close();
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public static void main(String[] args) {
        
            Student st=new Student();
            // st.createTable();
            // st.createData();
            st.readData();
            // st.deleteData();
        }

}
