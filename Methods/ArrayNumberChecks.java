import java.util.Scanner;

public class ArrayNumberChecks {

    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int n : arr) {
            if (isPositive(n)) {
                System.out.print(n + " is positive and ");
                if (isEven(n)) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
            } else {
                System.out.println(n + " is negative");
            }
        }

        int result = compare(arr[0], arr[4]);
        if (result == 1) System.out.println("First element is greater than last.");
        else if (result == -1) System.out.println("First element is less than last.");
        else System.out.println("First and last elements are equal.");
        
        sc.close();
    }
}
