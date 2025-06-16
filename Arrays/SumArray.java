import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (max 10, stop with 0 or negative):");
        while (true) {
            double val = sc.nextDouble();
            if (val <= 0 || index == 10) break;
            numbers[index++] = val;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
            System.out.println("Position " + (i + 1) + " = " + numbers[i]);
        }

        System.out.println("Total = " + total);
    }
}
