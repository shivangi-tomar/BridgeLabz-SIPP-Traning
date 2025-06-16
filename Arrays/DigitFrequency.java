import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        int[] freq = new int[10];  // For digits 0-9

        long temp = num;
        while (temp > 0) {
            int digit = (int)(temp % 10);
            freq[digit]++;
            temp /= 10;
        }

        System.out.println("\n--- Digit Frequency ---");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + ": " + freq[i] + " time(s)");
            }
        }
    }
}
