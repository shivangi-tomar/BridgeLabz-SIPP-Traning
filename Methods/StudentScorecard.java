import java.util.*;

public class StudentScorecard {

    // Method to generate random PCM scores for n students
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        Random rand = new Random();
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(51) + 50; // Physics: 50 to 100
            scores[i][1] = rand.nextInt(51) + 50; // Chemistry
            scores[i][2] = rand.nextInt(51) + 50; // Math
        }
        return scores;
    }

    // Method to calculate Total, Average, Percentage
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; // total, average, percentage
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to determine Grade based on percentage
    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    // Display method
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tTotal\tAverage\t\t%age\tGrade");
        System.out.println("----------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("S" + (i + 1) + "\t");
            System.out.print(scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t");
            System.out.print((int)results[i][0] + "\t");
            System.out.print(results[i][1] + "\t\t" + results[i][2] + "\t");
            System.out.println(getGrade(results[i][2]));
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}
