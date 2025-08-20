public interface SensitiveData { }

public class PatientRecord implements SensitiveData {
    private String name;
    private String disease;

    public PatientRecord(String name, String disease) {
        this.name = name;
        this.disease = disease;
    }

    public String getName() { return name; }
    public String getDisease() { return disease; }

    public static void main(String[] args) {
        PatientRecord record = new PatientRecord("Rahul", "Flu");

        if (record instanceof SensitiveData) {
            System.out.println("Encrypting data before saving: " + record.getName());
        } else {
            System.out.println("Saving normally...");
        }
    }
}
