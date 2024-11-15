import java.sql.*;
import java.util.*;

public class Dao {

public static void createEmployee(Employee employee)throws SQLException
{
    Connection conn=DB.connect();
    String query=Query.insert;

    PreparedStatement pstmt= conn.prepareStatement(query);
        pstmt.setInt(1,employee.getId());
        pstmt.setString(2,employee.getName());
        pstmt.setString(3, employee.getPhoneNo());
        pstmt.setString(4,employee.getEmail());
        pstmt.setInt(5, employee.getSalary());

    pstmt.execute();
    pstmt.close();
  }
  public static void updtaeEmployeePhoneNo(int id,String phone_no)throws SQLException
{
    Connection conn=DB.connect();
    String queryPhoneNo=Query.updatePhoneNo;
    

    PreparedStatement pstmt= conn.prepareStatement(queryPhoneNo);
        pstmt.setInt(1,id);
        pstmt.setString(3, phone_no);

    
    pstmt.executeUpdate();
    pstmt.close();
  }
   public static void updtaeEmployeeEmail(int id,String email)throws SQLException
    {
        Connection conn=DB.connect();
        String queryEmail=Query.updateEmail;
        

     PreparedStatement pstmt= conn.prepareStatement(queryEmail);
        pstmt.setInt(1,id);
        pstmt.setString(4, email);

    
    pstmt.executeUpdate();
    pstmt.close();
  }

  public static ArrayList<Employee> readAllEmployee()throws SQLException
  {
        ArrayList<Employee> emplist=new ArrayList<>();
        Connection conn=DB.connect();
        String query=Query.select;
    

        Statement stmt= conn.prepareStatement(query);

        ResultSet rs=stmt.executeQuery(query);

        while(rs.next())
        {
            Employee emp=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
            emplist.add(emp);

        }

        stmt.close();

        return emplist;
  }

  public static void deleteEmployee(int id)throws SQLException
  {

        Connection conn=DB.connect();
        String query=Query.delete;

        Statement stmt= conn.prepareStatement(query);
        stmt.execute(query);

        stmt.close();

  }

}
