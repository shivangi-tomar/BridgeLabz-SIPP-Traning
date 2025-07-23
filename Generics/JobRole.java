abstract class JobRole {
    String name;
    JobRole(String name) { this.name = name; }
    public String toString() { return name; }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer() { super("Software Engineer"); }
}

class DataScientist extends JobRole {
    DataScientist() { super("Data Scientist"); }
}

class ProductManager extends JobRole {
    ProductManager() { super("Product Manager"); }
}

class Resume<T extends JobRole> {
    T jobRole;

    Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    void process() {
        System.out.println("Processing resume for " + jobRole);
    }

    static void processResumes(java.util.List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Screening resume: " + role);
        }
    }
}

public class ResumeScreeningTest {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 = new Resume<>(new SoftwareEngineer());
        Resume<DataScientist> r2 = new Resume<>(new DataScientist());

        r1.process();
        r2.process();

        java.util.List<JobRole> list = new java.util.ArrayList<>();
        list.add(new SoftwareEngineer());
        list.add(new ProductManager());

        Resume.processResumes(list);
    }
}
