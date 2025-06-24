class Course {
    String courseName;
    int duration; // in weeks
    double fee;
    static String instituteName = "SkillUp Academy";

    Course(String name, int d, double f) {
        courseName = name;
        duration = d;
        fee = f;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: Rs." + fee);
        System.out.println("Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 8, 3000);
        Course c2 = new Course("Web Dev", 6, 4000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("Bright Future Institute");
        System.out.println("\nAfter Update:");
        c1.displayCourseDetails();
    }
}
