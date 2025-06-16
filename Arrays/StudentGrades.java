import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        int[][] marks = new int[numStudents][3]; // 0: Physics, 1: Chemistry, 2: Maths
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                while (true) {
                    System.out.print(subject + ": ");
                    int mark = sc.nextInt();
                    if (mark >= 0) {
                        marks[i][j] = mark;
                        break;
                    } else {
                        System.out.println("Invalid marks! Please enter positive values.");
                    }
                }
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Display results
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Student %d -> Physics: %d, Chemistry: %d, Maths: %d, Percentage: %.2f%%, Grade: %c\n",
                (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}
