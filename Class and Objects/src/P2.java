import java.util.Scanner;
class circle {
    double r;
    circle(double r){
        this.r=r;
    }
    void display(){
        System.out.println((Math.PI)*(r*r));
    }
}
public class P2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double i = input.nextDouble();
        circle x = new circle(i);
        x.display();
    }
}
