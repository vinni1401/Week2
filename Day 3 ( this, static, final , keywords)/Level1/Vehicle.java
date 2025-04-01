class Vehicle {
    private static double registrationFee = 5000;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;


    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration Number: " + registrationNumber + ", Owner: " + ownerName +
                    ", Vehicle Type: " + vehicleType + ", Fee: $" + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("XYZ123", "Alice", "Car");
        Vehicle v2 = new Vehicle("ABC789", "Bob", "Bike");

        v1.displayDetails();
        v2.displayDetails();
        updateRegistrationFee(5500);
        v1.displayDetails();
    }
}
