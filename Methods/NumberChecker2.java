import java.util.*;

public class NumberChecker {

    // Count of digits
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    // Store digits into array
    public static int[] getDigits(int n) {
        String numStr = String.valueOf(n);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    // Sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    // Check if number is Harshad
    public static boolean isHarshad(int n, int[] digits) {
        return n % sumOfDigits(digits) == 0;
    }

    // Digit frequency
    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) freq[d]++;

        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) result.add(new int[]{i, freq[i]});
        }

        int[][] frequencyArray = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            frequencyArray[i] = result.get(i);
        }

        return frequencyArray;
    }

    public static void main(String[] args) {
        int num = 1729;
        int[] digits = getDigits(num);

        System.out.println("Number: " + num);
        System.out.println("Digit Count: " + countDigits(num));
        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares: " + sumOfSquares(digits));
        System.out.println("Is Harshad? " + isHarshad(num, digits));

        System.out.println("Digit Frequency:");
        int[][] freq = digitFrequency(digits);
        for (int[] pair : freq) {
            System.out.println("Digit: " + pair[0] + " -> Count: " + pair[1]);
        }
    }
}
