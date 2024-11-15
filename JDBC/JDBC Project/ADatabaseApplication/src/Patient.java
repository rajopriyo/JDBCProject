public class Patient {
    private int p_id;
    private String p_name;
    private String d_name;
    private  int ph_no;
    private String  disease;
    private int bill;
    public Patient(int p_id,String p_name,String d_name,int ph_no,String disease,int bill){
        this.p_id=p_id;
        this.p_name=p_name;
        this.d_name=d_name;
        this.ph_no=ph_no;
        this.disease=disease;
        this.bill=bill;
    }
    public int getid(){return p_id;};
    public String get_patient_name(){return p_name;};
    public String get_doctor_name(){return d_name;};
    public int get_phone_no(){return ph_no;};
    public String get_disease_name(){return disease;};
    public int get_bill(){return bill;}
    @Override
    public String toString() {
        return "Patient ID: " + p_id +
               ", Patient Name: " + p_name +
               ", Doctor Name: " + d_name +
               ", Phone No: " + ph_no +
               ", Disease: " + disease +
               ", Bill: " + bill;
    }

}
