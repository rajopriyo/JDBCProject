import java.util.ArrayList;
import java.util.Scanner;
class WrongNumberException extends Exception{
    WrongNumberException(String str){
    super(str);
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        while(true){
            System.out.println("Hospiital Database");
          
            System.out.println("Press 1 For Creation || Press 2 for Read || Press 3 for updation || Press 4 for Deletion ");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            if(choice>4 || choice<1) break;
            switch(choice){
                case 1:
                    System.out.println("Enter Patient Id ||Patient Name || Doctor Name || Phone No || Diesease || Bill");
                    int p_id = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    String p_name = sc.nextLine();
                    String d_name = sc.nextLine();
                    int ph_no = Integer.parseInt(sc.nextLine());
                    String strNumber = Integer.toString(ph_no);
                    if(strNumber.length()<10 || strNumber.length()>10){
                        try{
                       throw new WrongNumberException("You number should be 10 digits");
                        }
                        catch(WrongNumberException wr){
                            wr.printStackTrace();
                            break;
                        }
                    }
                    String disease = sc.nextLine();
                    int bill = Integer.parseInt(sc.nextLine());

                    Patient pt=new Patient(p_id,p_name,d_name,ph_no,disease,bill);
                    PatientDao.createPatient(pt);
                    break;
            
                case 2:
                ArrayList<Patient> List= PatientDao.readPatients();
                   for(Patient pts:List){
                    System.out.println(pts);
                   }
                   break;
                case 3:
                    System.out.println("Enter new Patient Id ||Patient Name ");
                    p_id=sc.nextInt();
                    sc.nextLine();
                    p_name=sc.nextLine();
                    PatientDao.updatePatient(p_id,p_name);
                    break;
                case 4:
                    System.out.println("Enter the patient id you want to delete : ");
                    p_id=sc.nextInt();
                    PatientDao.delete(p_id);
                    break;

        }
    }
}
}
 