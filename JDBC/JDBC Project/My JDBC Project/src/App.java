import java.util.*;
public class App {

     

    public static void main(String[] args)throws Exception  {
        Scanner sc=new Scanner(System.in);
        System.out.println("======Choice=======");
        System.out.println("1.Insert");
        System.out.println("2.Update");
        System.out.println("3.Delete");
        System.out.println("4.Select");
        System.out.println("======****=======");

        int ch=sc.nextInt();
        //sc.next();

        switch(ch)
        {
            case 1:
                  System.out.println("id,name,phone_no,email,salary");
                  int id=sc.nextInt();
                  sc.nextLine();
                  String name=sc.nextLine();
                  String phone_no=sc.nextLine();
                  String email=sc.nextLine();
                  int salary=sc.nextInt();
                  
                System.out.println(id);
                System.out.println(id + " " +name + " "+ phone_no+" "+email+" "+salary);
                  
                  Employee emp=new Employee(id, name, phone_no, email, salary);
                  System.out.println(emp);
                  Dao.createEmployee(emp);
                  break;
            case 2:
                  System.out.println("id");
                  id=sc.nextInt();
                //   sc.next();
                System.out.println("a.Phone No. \nb.Email");
                char c = sc.next().charAt(0);
                // sc.next();
              
                  // sc.nextLine();
                
                switch(c)
                  {
                        case 'a':
                                System.out.println("phone_no");
                                // sc.next();
                              
                                phone_no=sc.nextLine();
                                
                                Dao.updtaeEmployeePhoneNo(id, phone_no);
                                break;
                        case 'b':
                               
                                // sc.nextLine();
                                
                                email=sc.nextLine();

                                Dao.updtaeEmployeeEmail(id, email);
                                break;
                }
                break;
            case 3:
                System.out.println("id");
                id=sc.nextInt();
                // sc.next();
                Dao.deleteEmployee(id);
                break;
            case 4:
                  ArrayList<Employee> list=Dao.readAllEmployee();
                  for(Employee employee: list)
                      System.out.println(employee);
                 break;
            default:
                   System.out.println("Invalid Choice!!");

        }
    }
}
