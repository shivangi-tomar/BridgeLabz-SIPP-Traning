import java.util.Scanner;

public class ArrayExceptionDemo {

    public static void generateException(String[] names) {
        // Will throw ArrayIndexOutOfBoundsException
        System.out.println("Accessing index 10: " + names[10]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];

        System.out.println("Enter 5 names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }

        // Calling the methods
        // Uncomment one at a time to see each behavior
        // generateException(names); // This will crash
        handleException(names);
    }
}
