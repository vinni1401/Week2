class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + salary);
    }
}


class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManager() {
        System.out.println("Manager ID: " + employeeID + ", Department: " + department);
    }

    public static void main(String[] args) {
        Manager manager = new Manager(201, "IT", 80000.0);
        manager.displayManager();
        manager.setSalary(90000.0);
        manager.displayEmployee();
    }
}
