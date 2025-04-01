import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() { return rentalRate; }
    public String getVehicleNumber() { return vehicleNumber; }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String number, double rate) {
        super(number, "Car", rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 1500;
    }

    public String getInsuranceDetails() {
        return "Car Insurance: ₹1500";
    }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String number, double rate) {
        super(number, "Bike", rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance: ₹500";
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String number, double rate) {
        super(number, "Truck", rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 1000; // Extra maintenance
    }

    public double calculateInsurance() {
        return 2500;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance: ₹2500";
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("MH01AB1234", 1000));
        vehicles.add(new Bike("MH02XY9876", 300));
        vehicles.add(new Truck("MH03TR4567", 2000));

        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle v = vehicles.get(i);
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Rental Cost (5 days): ₹" + v.calculateRentalCost(5));

            if (v instanceof Insurable) {
                System.out.println(((Insurable)v).getInsuranceDetails());
                System.out.println("Insurance Amount: ₹" + ((Insurable)v).calculateInsurance());
            }
            System.out.println("---------------------------------");
        }
    }
}
