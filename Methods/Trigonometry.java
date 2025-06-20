import java.util.Scanner;

public class Trigonometry {
    public static void calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        System.out.println("Sine: " + Math.sin(radians));
        System.out.println("Cosine: " + Math.cos(radians));
        System.out.println("Tangent: " + Math.tan(radians));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        calculateTrigonometricFunctions(angle);
    }
}
