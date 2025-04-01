// 2. Employee Management System
// Superclass: Employee
class Employee {
    String name;
    int id;
    double salary;
    
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

// Subclasses
class Manager extends Employee {
    int teamSize;
    
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;
    
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String duration;
    
    Intern(String name, int id, double salary, String duration) {
        super(name, id, salary);
        this.duration = duration;
    }
    
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration);
    }
}


public class EmployeeManagement {
    public static void main(String[] args) {
        Employee emp1 = new Manager("Alice", 101, 90000, 5);
        Employee emp2 = new Developer("Bob", 102, 70000, "Java");
        Employee emp3 = new Intern("Charlie", 103, 20000, "6 months");
        
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}
