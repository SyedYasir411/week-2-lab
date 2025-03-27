class Vehicle{
    double maxSpeed;
    String Fuel;
    Vehicle(double maxSpeed,String Fuel){
        this.maxSpeed=maxSpeed;
        this.Fuel=Fuel;
    }

    public void displayInfo(){
        System.out.println("MaxSpeed : "+maxSpeed);
        System.out.println("FuelType : "+Fuel);
    }
}

class Car extends Vehicle{
    int seatCapacity;
    Car(double maxSpeed,String Fuel,int seatCapacity){
        super(maxSpeed,Fuel);
        this.seatCapacity=seatCapacity;
    }

    @Override
    public void displayInfo(){
        System.out.println("MaxSpeed : "+maxSpeed);
        System.out.println("FuelType : "+Fuel);
        System.out.println("SeatCapacity : "+seatCapacity);
    }
}

class Truck extends Vehicle{
    int wheels;
    Truck(double maxSpeed,String Fuel,int wheels){
        super(maxSpeed,Fuel);
        this.wheels=wheels;
    }

    @Override
    public void displayInfo(){
        System.out.println("MaxSpeed : "+maxSpeed);
        System.out.println("FuelType : "+Fuel);
        System.out.println("wheels : "+wheels);
    }
}

class MotorCycle extends Vehicle{
    int wheels;
    MotorCycle(double maxSpeed,String Fuel,int wheels){
    super(maxSpeed,Fuel);
    this.wheels=wheels;
    }
    @Override
    public void displayInfo(){
        System.out.println("MaxSpeed : "+maxSpeed);
        System.out.println("FuelType : "+Fuel);
        System.out.println("wheels : "+wheels);
    }
}

public class P3 {
    public static void main(String[] args){
    Vehicle v1= new Car(200,"Disel",5);
    Vehicle v2= new Truck(180,"Disel",12);
    Vehicle v3 = new MotorCycle(120,"Disel",2);

    Vehicle[] arr = {v1,v2,v3};

    for(Vehicle i : arr){
        i.displayInfo();
    }
    }
}
