// Interface for managing medical records
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Abstract class Patient
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}

// InPatient class - implements MedicalRecord
class InPatient extends Patient implements MedicalRecord {
    private double roomChargePerDay;
    private int numberOfDays;
    private String medicalHistory = "";

    public InPatient(int patientId, String name, int age, double roomChargePerDay, int numberOfDays) {
        super(patientId, name, age);
        this.roomChargePerDay = roomChargePerDay;
        this.numberOfDays = numberOfDays;
    }

    @Override
    public double calculateBill() {
        return roomChargePerDay * numberOfDays;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory += record + "; ";
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History: " + medicalHistory);
    }
}

// OutPatient class - implements MedicalRecord
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String medicalHistory = "";

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory += record + "; ";
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History: " + medicalHistory);
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient p1 = new InPatient(1, "Alice", 30, 2000, 5);
        Patient p2 = new OutPatient(2, "Bob", 45, 500);

        Patient[] patients = {p1, p2};

        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Total Bill: " + patient.calculateBill());
            
            MedicalRecord record = (MedicalRecord) patient;
            record.addRecord("Routine checkup done");
            record.viewRecords();
            System.out.println();
        }
    }
}
