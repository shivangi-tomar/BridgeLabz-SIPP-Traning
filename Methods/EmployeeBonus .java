public class EmployeeBonus {

    public static double[][] generateSalaryAndService() {
        double[][] data = new double[10][2]; // [salary][years]
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + Math.random() * 90000; // Salary 10000 - 99999
            data[i][1] = (int)(Math.random() * 10); // Years 0 - 9
        }
        return data;
    }

    public static double[][] calculateNewSalary(double[][] data) {
        double[][] result = new double[10][2]; // [newSalary][bonus]
        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus = (years > 5) ? 0.05 * salary : 0.02 * salary;
            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void displayResults(double[][] oldData, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("Emp\tOldSalary\tYears\tNewSalary\tBonus");
        for (int i = 0; i < 10; i++) {
            double oldSal = oldData[i][0];
            double years = oldData[i][1];
            double newSal = newData[i][0];
            double bonus = newData[i][1];
            totalOld += oldSal;
            totalNew += newSal;
            totalBonus += bonus;
            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t%.2f\n", i+1, oldSal, years, newSal, bonus);
        }
        System.out.printf("Total\t%.2f\t\t%.2f\t%.2f\n", totalOld, totalNew, totalBonus);
    }

    public static void main(String[] args) {
        double[][] oldData = generateSalaryAndService();
        double[][] newData = calculateNewSalary(oldData);
        displayResults(oldData, newData);
    }
}
