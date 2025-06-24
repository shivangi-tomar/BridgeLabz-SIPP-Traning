class Student {
    String name;
    int rollNumber;
    int marks;

    void setDetails(String n, int r, int m) {
        name = n;
        rollNumber = r;
        marks = m;
    }

    char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else return 'D';
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String args[]) {
        Student s = new Student();
        s.setDetails("Ravi", 7, 82);
        s.display();
    }
}
