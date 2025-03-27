class Vehicle{
    static double registrationfee = 100;
    String ownername;
    String vehicletype;
    final double registration_number;

    Vehicle(String name,String type,double reg_no){
        this.ownername=name;
        this.vehicletype=type;
        this.registration_number=reg_no;
    }

    static void updateregistrationfee(double fee){
        registrationfee=fee;
    }

    void display(){
        System.out.println("name : "+ownername);
        System.out.println("Type : "+vehicletype);
        System.out.println("registration_number : "+registration_number);
        System.out.println("reg_fee : "+registrationfee);
    }
}
public class P6 {
    public static void main(String[] args){
        Vehicle n = new Vehicle("dsv","heavy",4324432);
        Vehicle.updateregistrationfee(200);
        n.display();
    }
}
