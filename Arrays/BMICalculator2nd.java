import java.util.Scanner;

public class BMICalculator2nd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; // [][0]=weight, [][1]=height, [][2]=BMI
        String[] weightStatus = new String[number];

        // Input loop
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");

            // Weight
            double weight;
            do {
                System.out.print("Enter weight in kg (positive value): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Invalid weight. Please enter again.");
                }
            } while (weight <= 0);
            personData[i][0] = weight;

            // Height
            double height;
            do {
                System.out.print("Enter height in meters (positive value): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Invalid height. Please enter again.");
                }
            } while (height <= 0);
            personData[i][1] = height;

            // BMI calculation
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine status
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s\n",
                    (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
    }
}
