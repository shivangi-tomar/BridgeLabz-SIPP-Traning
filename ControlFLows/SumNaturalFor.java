import java.util.Scanner;
public class SumNaturalFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n > 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            int formula = n * (n + 1) / 2;
            System.out.println("Sum by loop: " + sum);
            System.out.println("Sum by formula: " + formula);
            System.out.println("Both sums are equal? " + (sum == formula));
        } else {
            System.out.println("Not a natural number");
        }
    }
}
