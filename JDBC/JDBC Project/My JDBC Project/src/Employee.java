public class Employee {
    
    private int id;
    private String name;
    private String phone_no;
    private String email;
    private int salary;

    public Employee(int id,String name,String phone_no,String email,int salary)
    {
        this.id=id;
        this.name=name;
        this.phone_no=phone_no;
        this.email=email;
        this.salary=salary;
    }

    public int getId(){return id;}
    public String getName(){ return name;}
    public String getPhoneNo(){return phone_no;}
    public String getEmail(){return email;}
    public int getSalary(){return salary;}

    public String toString()
    {
        return "Employee[id="+id+"name="+name+"Phone No.="+phone_no+"Email="+email+"Salary="+salary+"]"; 
    }

}
