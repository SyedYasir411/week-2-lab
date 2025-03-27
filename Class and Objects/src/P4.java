import java.util.Scanner;
class Item {
    double itemCode;
    String itemName;
    double price;

    Item(double item,String name,double price){
        this.itemCode=item;
        this.itemName=name;
        this.price=price;
    }

    void displey(){
        System.out.println("itemcode : "+itemCode);
        System.out.println("itemname : "+itemName);
        System.out.println("price : "+price);
    }

    public double quant(double q){
        return price*q;
    }
}

public class P4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter code ");
        double x = input.nextDouble();
        System.out.print("Enter Name ");
        String y = input.next();
        System.out.print("Enter price ");
        double z = input.nextDouble();

        System.out.print("Enter quantity ");
        double q = input.nextDouble();

        Item j = new Item(x,y,z);

        System.out.println("Total cost : "+ j.quant(q));
    }
}