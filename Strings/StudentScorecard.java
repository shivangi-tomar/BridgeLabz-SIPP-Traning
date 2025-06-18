import java.util.Random;

public class StudentScorecard {

    // Method 1: Generate random 2-digit scores (10–99)
    public static int[][] generateScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3]; // [Physics, Chemistry, Maths]
        Random rand = new Random();

        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(90) + 10;
            }
        }
        return scores;
    }

    // Method 2: Calculate total, average, percentage (2 decimal)
    public static double[][] calculateStats(int[][] scores) {
        int n = scores.length;
        double[][] stats = new double[n][3]; // [Total, Average, Percentage]

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return stats;
    }

    // Method 3: Grade calculation based on percentage
    public static char[] calculateGrades(double[][] stats) {
        int n = stats.length;
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            double percentage = stats[i][2];

            if (percentage >= 80) {
                grades[i] = 'A';
            } else if (percentage >= 70) {
                grades[i] = 'B';
            } else if (percentage >= 60) {
                grades[i] = 'C';
            } else if (percentage >= 50) {
                grades[i] = 'D';
            } else if (percentage >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }
        return grades;
    }

    // Method 4: Display the scorecard
    public static void displayScorecard(int[][] scores, double[][] stats, char[] grades) {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Roll | Physics | Chemistry | Maths | Total | Average | Percentage | Grade");
        System.out.println("-----------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf(" %2d  |   %3d   |    %3d    |  %3d  |  %3.0f  |  %6.2f  |   %6.2f%%   |   %c\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }

        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int numStudents = 5; // You can change number of students

        int[][] scores = generateScores(numStudents);
        double[][] stats = calculateStats(scores);
        char[] grades = calculateGrades(stats);
        displayScorecard(scores, stats, grades);
    }
}
