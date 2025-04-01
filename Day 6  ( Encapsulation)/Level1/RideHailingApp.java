abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(String id, String driver, double rate) {
        this.vehicleId = id;
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    public double getRatePerKm() { return ratePerKm; }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName);
    }

    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLoc);
}

class Car extends RideVehicle implements GPS {
    private String location = "Stand A";

    public Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLoc) {
        location = newLoc;
    }
}

class Bike extends RideVehicle implements GPS {
    private String location = "Stand B";

    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLoc) {
        location = newLoc;
    }
}

public class RideHailingApp {
    public static void main(String[] args) {
        RideVehicle[] rides = {
            new Car("CAR01", "John", 15),
            new Bike("BIKE01", "Alex", 8)
        };

        for (int i = 0; i < rides.length; i++) {
            rides[i].getVehicleDetails();
            System.out.println("Fare for 10km: ₹" + rides[i].calculateFare(10));

            if (rides[i] instanceof GPS) {
                GPS gps = (GPS) rides[i];
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("New Stand");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }

            System.out.println("---------------------------------");
        }
    }
}
