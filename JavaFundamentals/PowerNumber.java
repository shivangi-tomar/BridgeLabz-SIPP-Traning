import java.util.Scanner;
public class PowerNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = input.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = input.nextDouble();
        System.out.println("Result is " + Math.pow(base, exponent));
    }
}
