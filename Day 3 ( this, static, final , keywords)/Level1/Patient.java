class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    private final int patientID;
    private String name;
    private int age;
    private String ailment;


    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName + ", Patient ID: " + patientID + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient(101, "Alice", 30, "Flu");
        Patient p2 = new Patient(102, "Bob", 40, "Diabetes");

        p1.displayDetails();
        p2.displayDetails();
        getTotalPatients();
    }
}
