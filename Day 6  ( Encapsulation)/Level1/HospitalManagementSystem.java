abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharge = 3000;
    private int days = 5;
    private String record;

    public InPatient(int id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return roomCharge * days;
    }

    public void addRecord(String record) {
        this.record = record;
    }

    public void viewRecords() {
        System.out.println("Record: " + record);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee = 500;
    private String record;

    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        this.record = record;
    }

    public void viewRecords() {
        System.out.println("Record: " + record);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient(1, "Amit", 45),
            new OutPatient(2, "Rita", 29)
        };

        for (int i = 0; i < patients.length; i++) {
            patients[i].getPatientDetails();
            System.out.println("Bill: ₹" + patients[i].calculateBill());

            if (patients[i] instanceof MedicalRecord) {
                MedicalRecord mr = (MedicalRecord) patients[i];
                mr.addRecord("General Check-up");
                mr.viewRecords();
            }

            System.out.println("---------------------------------");
        }
    }
}
