import java.util.Scanner;
class HotelBooking{
    String guestName;
    String roomType;
    double nights;

    HotelBooking(){
        guestName="Shanks";
        roomType="suite";
        nights=1;
    }

    HotelBooking(String name,String type, double n){
        this.guestName=name;
        this.roomType=type;
        this.nights=n;
    }

    HotelBooking(HotelBooking prev){
        guestName= prev.guestName;
        roomType=prev.roomType;
        nights= prev.nights;
    }

    void display(){
        System.out.println(guestName+" ,"+roomType+" ,"+nights);
    }
}
public class P4 {
    public static void main(String[] args){
        HotelBooking str = new HotelBooking();
        str.display();
        HotelBooking str1 = new HotelBooking("kun","classic",2);
        str1.display();
        HotelBooking str2 = new HotelBooking(str1);
        str2.display();
    }
}
