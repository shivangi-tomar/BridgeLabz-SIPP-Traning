import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        double l = input.nextDouble();
        System.out.print("Enter breadth: ");
        double b = input.nextDouble();
        double area = l * b;
        System.out.println("The area of rectangle is " + area);
    }
}
