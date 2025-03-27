import java.util.Scanner;

class Student{
    public double rollnumber;
    protected String name;
    private double CGPA;

    Student(double num,String name,double cgpa){
        this.rollnumber=num;
        this.name=name;
        this.CGPA=cgpa;
    }

    public double getCgpa(){
        return CGPA;
    }

    public void setCgpa(double cgpa){
        this.CGPA=cgpa;

    }

//    public void grade(){
//        System.out.println(Math.round(CGPA));
//    }
}

class PGStudent extends Student{
    PGStudent(String name){
        super(1,name,9.2);
    }

    public void display(){
        System.out.println("Name : "+name);
        System.out.println("roll_number : "+rollnumber);
        System.out.println("CGPA : "+getCgpa());
    }
}
public class P10 {
    public static void main(String[] args){
        Student n1 = new Student(3,"adaj",6.4);
        PGStudent n2 = new PGStudent("akash");
        n2.setCgpa(8.6);
        n2.display();
    }
}
