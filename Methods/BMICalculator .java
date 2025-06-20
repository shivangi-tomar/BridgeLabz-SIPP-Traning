import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and fill into array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;

            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }

    // Method to get BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] people = new double[10][3]; // [weight, height(cm), BMI]
        String[] statuses = new String[10];

        // Taking input
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight in kg: ");
            people[i][0] = sc.nextDouble();

            System.out.print("Height in cm: ");
            people[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(people);

        // Assign status
        for (int i = 0; i < 10; i++) {
            statuses[i] = getBMIStatus(people[i][2]);
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", (i + 1), people[i][0], people[i][1], people[i][2], statuses[i]);
        }

        sc.close();
    }
}
