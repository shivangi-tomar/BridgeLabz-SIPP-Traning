class Student {
    static String universityName = "Delhi University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void show() {
        if (this instanceof Student) {
            System.out.println(name + " (Roll No: " + rollNumber + "), Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Aman", 23, 'A');
        s1.show();
        displayTotalStudents();
    }
}
