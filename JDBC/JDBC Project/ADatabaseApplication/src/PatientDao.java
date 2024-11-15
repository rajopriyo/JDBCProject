import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
public class PatientDao {
    
    public static void createPatient(Patient pt)throws SQLException{
        Connection con=Database.connect();
        String query=Query.insert;
        PreparedStatement pst=con.prepareStatement(query);
        pst.setInt(1, pt.getid());
        pst.setString(2, pt.get_patient_name());
        pst.setString(3, pt.get_doctor_name());
        pst.setInt(4, pt.get_phone_no());
        pst.setString(5, pt.get_disease_name());
        pst.setInt(6, pt.get_bill());
        pst.executeUpdate();
        pst.close();
    }
     public static void updatePatient(int id,String name)throws SQLException{
        Connection con=Database.connect();
        String query=Query.update;
        PreparedStatement pst=con.prepareStatement(query);
        pst.setString(1, name);
        pst.setInt(2, id);
        pst.executeUpdate();
        pst.close();
    }
    public static void delete(int id)throws SQLException{
        Connection con=Database.connect();
        String query=Query.delete;
        PreparedStatement pst=con.prepareStatement(query);
        pst.setInt(1, id);
        pst.executeUpdate();
        pst.close();
    }
    public static ArrayList<Patient> readPatients() throws SQLException{
        ArrayList<Patient> alpt=new ArrayList<Patient>();
        Connection con=Database.connect();
        String query=Query.select;
        PreparedStatement statement=con.prepareStatement(query);
        ResultSet rs=statement.executeQuery();
        while(rs.next()){
            Patient pt=new Patient(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getInt(4), rs.getString(5), rs.getInt(6));
            alpt.add(pt);
        }
        statement.close();
        return alpt;
    }
}
