import java.util.Scanner;

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel: " + fuelType);
    }
}

public class VehicleInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String brand = sc.next();
        int speed = sc.nextInt();
        String fuel = sc.next();

        Car car = new Car(brand, speed, fuel);
        car.display();
    }
}