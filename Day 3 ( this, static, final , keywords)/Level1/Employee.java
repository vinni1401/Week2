class Employee {
    private static String companyName = "Tech Corp";
    private static int totalEmployees = 0;
    private final int id;
    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName + ", ID: " + id + ", Name: " + name + ", Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Alice", "Developer");
        Employee emp2 = new Employee(2, "Bob", "Manager");

        emp1.displayDetails();
        emp2.displayDetails();
        displayTotalEmployees();
    }
}
