public class Query {

    
    static String insert="INSERT INTO employee(id,name,phone_no,email,salary) VALUES (?,?,?,?,?)";
    static String updatePhoneNo="UPDATE employee SET phone_no=? WHERE id=?";
    static String updateEmail="UPDATE employee SET email= ? WHERE id= ?";
    static String delete="DELETE *from employee WHERE id=?";
    static String select="SELECT *from employee";
    
}
