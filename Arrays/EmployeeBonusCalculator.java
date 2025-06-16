import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int numEmployees = 10;
        double[] salaries = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonuses = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input data
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            // Get salary
            while (true) {
                System.out.print("Salary: ");
                double salary = sc.nextDouble();
                if (salary >= 0) {
                    salaries[i] = salary;
                    break;
                } else {
                    System.out.println("Invalid salary! Please enter a non-negative value.");
                }
            }

            // Get years of service
            while (true) {
                System.out.print("Years of Service: ");
                double years = sc.nextDouble();
                if (years >= 0) {
                    yearsOfService[i] = years;
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a non-negative value.");
                }
            }
        }

        // Calculate bonus, new salary and totals
        for (int i = 0; i < numEmployees; i++) {
            double bonusRate = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display results
        System.out.println("\n--- Employee Bonus Summary ---");
        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f\n",
                    (i + 1), salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.println("\n--- Total Summary ---");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
    }
}
