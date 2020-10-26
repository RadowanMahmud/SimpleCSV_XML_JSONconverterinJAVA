package sample;

public class student {

    private String student_name;
    private String student_roll;
    private String student_mail;

    public student(){

    }
    public student(String student_name,String student_roll,String student_mail){
        this.student_name=student_name;
        this.student_roll=student_roll;
        this.student_mail=student_mail;
    }

    public String getStudent_name(){
        return this.student_name;
    }
    public String getStudent_roll(){
        return this.student_roll;
    }
    public String getStudent_mail(){
        return this.student_mail;
    }
}
