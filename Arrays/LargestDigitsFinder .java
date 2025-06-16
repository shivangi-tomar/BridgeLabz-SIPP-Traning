import java.util.Scanner;

public class LargestDigitsFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int maxDigit = 10; // Maximum digits we will consider
        int[] digits = new int[maxDigit];

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        int index = 0;

        // Extract digits
        while (number != 0) {
            int digit = (int)(number % 10);
            digits[index] = digit;
            index++;
            number = number / 10;

            if (index == maxDigit) {
                System.out.println("Reached max digit capacity of 10. Ignoring remaining digits.");
                break;
            }
        }

        // Initialize largest and second largest
        int largest = -1;
        int secondLargest = -1;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {
            int current = digits[i];
            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current != largest) {
                secondLargest = current;
            }
        }

        // Display result
        System.out.println("\nDigits extracted: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit: Not available (all digits same or single digit)");
        }
    }
}
