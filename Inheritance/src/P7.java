class Course{
    String courseName;
    String duration;
    Course(String courseName,String duration){
        this.courseName=courseName;
        this.duration=duration;
    }
}

class OnlineCourse extends Course{
    String Platform;
    boolean isRecorded;
    OnlineCourse(String CourseName,String duration,String platform,boolean recorded){
        super(CourseName,duration);
        this.Platform = platform;
        this.isRecorded=recorded;
    }
}

class PaidOnline extends OnlineCourse{
    double fee;
    double discount;
    PaidOnline(String CourseName,String duration,String platform,boolean isRecorded,double fee,double discount){
        super(CourseName,duration,platform,isRecorded);
        this.fee = fee;
        this.discount=discount;

    }
    void display(){
        System.out.println("price : "+(fee-(fee*discount)));
    }
}
public class P7 {
    public static void main(String[] args){
        Course n = new Course("Java","2 months");
        OnlineCourse n1= new OnlineCourse("SpringBoot","1 month","Udemy",true);
        PaidOnline n2 = new PaidOnline("Python","2 months","unacademy",false,20000,0.1);
        n2.display();

    }
}
