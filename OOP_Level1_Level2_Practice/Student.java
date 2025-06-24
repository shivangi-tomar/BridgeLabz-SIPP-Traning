class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int roll, String n, double cg) {
        rollNumber = roll;
        name = n;
        CGPA = cg;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double cg) {
        CGPA = cg;
    }

    void display() {
        System.out.println("Roll: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    String thesisTopic;

    PostgraduateStudent(int roll, String name, double cg, String topic) {
        super(roll, name, cg);
        thesisTopic = topic;
    }

    void showPGDetails() {
        System.out.println("PG Student Name: " + name); // protected access
        System.out.println("Thesis: " + thesisTopic);
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Radha", 9.2, "AI in Sanskrit");
        pg.display();
        pg.showPGDetails();
    }
}
