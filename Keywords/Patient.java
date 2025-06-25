class Patient {
    static String hospitalName = "Apollo Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void display() {
        if (this instanceof Patient) {
            System.out.println("Patient: " + name + ", ID: " + patientID + ", Age: " + age + ", Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient(1, "Ritika", 27, "Fever");
        p1.display();
        getTotalPatients();
    }
}
