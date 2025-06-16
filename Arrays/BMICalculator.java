import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            while (true) {
                System.out.print("Enter weight in kg: ");
                double weight = sc.nextDouble();
                if (weight > 0) {
                    weights[i] = weight;
                    break;
                } else {
                    System.out.println("Invalid weight! Please enter a positive value.");
                }
            }

            while (true) {
                System.out.print("Enter height in meters: ");
                double height = sc.nextDouble();
                if (height > 0) {
                    heights[i] = height;
                    break;
                } else {
                    System.out.println("Invalid height! Please enter a positive value.");
                }
            }
        }

        // Calculate BMI and determine status
        for (int i = 0; i < n; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d -> Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s\n",
                (i + 1), heights[i], weights[i], bmis[i], statuses[i]);
        }
    }
}
