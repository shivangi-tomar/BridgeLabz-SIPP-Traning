abstract class CourseType {
    String name;
    CourseType(String name) { this.name = name; }
    public String toString() { return name; }
}

class ExamCourse extends CourseType {
    ExamCourse(String name) { super(name); }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String name) { super(name); }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String name) { super(name); }
}

class Course<T extends CourseType> {
    T courseType;

    Course(T courseType) {
        this.courseType = courseType;
    }

    public String toString() {
        return "Course: " + courseType;
    }

    static void printCourses(java.util.List<? extends CourseType> courses) {
        for (CourseType ct : courses) {
            System.out.println(ct);
        }
    }
}

public class UniversityTest {
    public static void main(String[] args) {
        java.util.List<ExamCourse> examCourses = new java.util.ArrayList<>();
        examCourses.add(new ExamCourse("Math 101"));

        java.util.List<ResearchCourse> researchCourses = new java.util.ArrayList<>();
        researchCourses.add(new ResearchCourse("AI Research"));

        Course.printCourses(examCourses);
        Course.printCourses(researchCourses);
    }
}
