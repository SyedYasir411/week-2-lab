import java.util.Scanner;
class Student{
    String name;
    double rollNumber;
    double marks;
    Student(String x, double n1, double n2){
        this.name = x;
        this.rollNumber=n1;
        this.marks=n2;
    }

    public String grade(){
        if(marks>=90){
            return "O";
        } else if(marks>=80){
            return "A+";
        }else if(marks>=70){
            return "A";
        }else if(marks>=60){
            return "B+";
        }else if(marks>=50){
            return "B";
        }
        return "F";
    }

    public void display(){
        System.out.println("Grade is : "+ grade());
    }

}
public class P6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        String i=input.nextLine();
        System.out.println("Enter roll number");
        double roll = input.nextDouble();
        System.out.println("Enter marks");
        double m = input.nextDouble();
        Student n = new Student(i,roll,m);
        n.display();
    }
}
