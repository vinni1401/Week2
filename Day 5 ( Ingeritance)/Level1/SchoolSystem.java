class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Teacher extends Person {
    String subject;
    
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    void displayRole() {
        System.out.println(name + " is a teacher of " + subject);
    }
}

class Student extends Person {
    int grade;
    
    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    void displayRole() {
        System.out.println(name + " is a student in grade " + grade);
    }
}

class Staff extends Person {
    String department;
    
    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    void displayRole() {
        System.out.println(name + " is a staff member in " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        Student student = new Student("Bob", 15, 10);
        Staff staff = new Staff("Charlie", 40, "Administration");
        
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}