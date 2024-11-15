public class Query {
    
    static String insert="INSERT into Patient (p_id,p_name,d_name,ph_no,disease,bill) VALUES (?,?,?,?,?,?)";
    static String update="UPDATE Patient SET p_name=? WHERE p_id=? ";
    static String delete="DELETE from Patient WHERE p_id=?";
    static String select="select * from Patient";

}
