import java.util.Scanner;
class Circle{
    double radius;

    Circle(){
        radius = 5;
    }
    Circle(double r ){
        this.radius = r;
    }

    void display(){
        System.out.println("radius is: "+radius);
    }
}
public class P2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        Circle n1 = new Circle();
        Circle n2 = new Circle(n);
        n1.display();
        n2.display();
    }
}
