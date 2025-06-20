import java.util.Scanner;

public class TriangularRun {
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (int)(5000 / perimeter); // 5 km = 5000 m
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides of the triangle (in meters): ");
        double p1 = sc.nextDouble();
        double p2 = sc.nextDouble();
        double p3 = sc.nextDouble();

        int rounds = calculateRounds(p1, p2, p3);
        System.out.println("Number of rounds to complete 5km: " + rounds);
    }
}
