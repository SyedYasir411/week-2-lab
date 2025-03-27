class Device{
    int deviceId;
    String status;
    Device(int id,String status){
        this.deviceId=id;
        this.status=status;
    }
}

class Thermostat extends Device{
    int temp;
    Thermostat(int deviceId,String status,int temp){
        super(deviceId,status);
        this.temp=temp;
    }

    void display(){
        System.out.println("Id : "+deviceId);
        System.out.println("status : "+status);
        System.out.println("Temp : "+temp);
    }
}
public class P5 {
    public static void main(String[] args){
        Thermostat T=new Thermostat(3,"Running",37);
        T.display();
    }
}
