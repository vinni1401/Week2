class CarRental {
    String customerName, carModel;
    int rentalDays;
    double pricePerDay = 500.0;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * pricePerDay;
    }

    public void displayDetails() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Alice", "Toyota", 5);
        rental.displayDetails();
    }
}
