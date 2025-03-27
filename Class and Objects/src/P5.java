import java.util.Scanner;
class  MobilePhone{
    String brand;
    String model;
    double price;

    MobilePhone(String x,String y, double z){
        this.brand=x;
        this.model=y;
        this.price=z;
    }

    void display(){
        System.out.println("brand : "+brand);
        System.out.println("model : "+model);
        System.out.println("price : "+price);
    }
}
public class P5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter brand name ");
        String x= input.nextLine();
        System.out.print("Enter model name ");
        String y= input.nextLine();
        System.out.print("Enter price ");
        double z= input.nextDouble();

        MobilePhone i = new MobilePhone(x,y,z);
        i.display();
    }
}