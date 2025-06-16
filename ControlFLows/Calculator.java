import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first number
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        // Input second number
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        // Input operator
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        double result = 0;
        boolean valid = true;

        // Perform calculation using switch
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid Operator");
                valid = false;
        }

        // Print result if valid
        if (valid) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
