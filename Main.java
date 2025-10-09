class Vehicle {
    String brand;
    String model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Vehicle: " + brand + " " + model);
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, String model, int doors) {
        super(brand, model); // Call Vehicle constructor
        this.doors = doors;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // Call Vehicle's displayInfo
        System.out.println("Type: Car, Doors: " + doors);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, String model, int doors, int batteryCapacity) {
        super(brand, model, doors); // Call Car constructor
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // Call Car's displayInfo
        System.out.println("Electric Car, Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("GenericBrand", "ModelX");
        v.displayInfo();
        System.out.println();

        Car c = new Car("Toyota", "Corolla", 4);
        c.displayInfo();
        System.out.println();

        ElectricCar e = new ElectricCar("Tesla", "Model S", 4, 100);
        e.displayInfo();
    }
}
