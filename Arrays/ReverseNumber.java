import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        // Count digits
        int count = 0;
        long temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];

        // Extract digits
        temp = num;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        // Display reversed number
        System.out.print("\nReversed Number: ");
        for (int digit : digits) {
            System.out.print(digit);
        }
        System.out.println();
    }
}
