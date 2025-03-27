import java.util.Scanner;
class Course{
    String courseName;
    double duration;
    double price;
    static String institute;

    Course(String courseName,double duration,double price){
        this.courseName=courseName;
        this.duration=duration;
        this.price=price;
    }

    public void display(){
        System.out.println("CourseName : "+courseName);
        System.out.println("duration : "+duration);
        System.out.println("price : "+price);
    }

    public void InsName(){
        institute = "VIT";
        System.out.println("institute : "+institute);
    }
}
public class P8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double time = input.nextDouble();
        double price = input.nextDouble();
        Course n = new Course(name,time,price);
        n.display();
        n.InsName();
    }
}
