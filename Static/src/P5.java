class Student{
    static String universityName="SRM";
    static int totalstudents;
    String name;
    final int rollnum;
    double grade;

    Student(String name,int rollnum,double grade){
        this.name=name;
        this.rollnum=rollnum;
        this.grade=grade;
        totalstudents++;
    }

    static void displaytotalstudents(){
        System.out.println("totalstudents : "+totalstudents);
    }

    void display(){
        System.out.println("name : "+name);
        System.out.println("rollnum : "+rollnum);
        System.out.println("grade : "+grade);
        System.out.println("university : "+universityName);
        System.out.println();
    }
}
public class P5 {
    public static void main(String[] args){
        Student n= new Student("dwaw",32,5.7);
        Student n1= new Student("ewww",76,3.2);
        n.display();
        n1.display();
        Student.displaytotalstudents();
    }
}
