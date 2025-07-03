// Interface for Insurable vehicles
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }
}

// Car class - implements Insurable
class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 1000; // Flat insurance cost
    }

    @Override
    public String getInsuranceDetails() {
        return "Standard car insurance applied.";
    }
}

// Bike class - implements Insurable
class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 300;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike insurance applied.";
    }
}

// Truck class - implements Insurable
class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 500; // Additional fixed charge
    }

    @Override
    public double calculateInsurance() {
        return 2000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck insurance applied.";
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("MH12AB1234", "Car", 1500),
            new Bike("MH12XY9876", "Bike", 500),
            new Truck("MH12TR4567", "Truck", 3000)
        };

        int days = 3;

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle: " + vehicle.getType() + " | Number: " + vehicle.getVehicleNumber());
            double rentalCost = vehicle.calculateRentalCost(days);
            Insurable ins = (Insurable) vehicle;
            double insuranceCost = ins.calculateInsurance();
            System.out.println(ins.getInsuranceDetails());
            System.out.println("Rental Cost for " + days + " days: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println();
        }
    }
}
