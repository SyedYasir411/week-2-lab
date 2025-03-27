import java.util.Scanner;

class Vehicle{
    String ownerName, vehicleType;
    static double regfee;

    Vehicle(String ownerName,String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }

    public void display(){
        System.out.println("OwnerName : "+ownerName);
        System.out.println("VehicleType : "+vehicleType);
    }

    public static void reg(){
        regfee=300;
        System.out.println("regfee : "+regfee);
    }
}
public class P9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String type = input.nextLine();
        Vehicle n = new Vehicle(name,type);
        n.display();
        Vehicle.reg();
    }
}
