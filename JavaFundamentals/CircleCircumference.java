import java.util.Scanner;
public class CircleCircumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = input.nextDouble();
        double circumference = 2 * Math.PI * r;
        System.out.println("The circumference of the circle is " + circumference);
    }
}
