interface Refuel {
    void refuel();
}

class Vehicle_ {
    String model;
    int maxSpeed;

    Vehicle_(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}

class ElectricVehicle extends Vehicle_ {
    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println(model + " is charging at the station!");
    }
}

class PetrolVehicle extends Vehicle_ implements Refuel {
    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void refuel() {
        System.out.println(model + " is refueling at the petrol pump!");
    }
}

public class P11 {
    public static void main(String[] args) {
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model S", 250);
        PetrolVehicle bmw = new PetrolVehicle("BMW 5 Series", 240);

        tesla.charge();
        bmw.refuel();
    }
}
