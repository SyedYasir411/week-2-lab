import java.util.Scanner;
class CarRental{
    String name;
    String model;
    double rentaldays;
    static double price;

    CarRental(String name,String model,double days){
        this.name = name;
        this.model = model;
        this.rentaldays=days;
        price=days*(2000);
    }

    void display(){
        System.out.println("total price : "+price);
    }

}
public class P6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String na=input.nextLine();
        System.out.print("Enter model: ");
        String mo=input.nextLine();
        System.out.print("Enter days: ");
        double pr=input.nextDouble();

        CarRental n = new CarRental(na,mo,pr);
        n.display();
    }
}
