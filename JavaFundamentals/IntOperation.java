import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        System.out.print("Enter c: ");
        int c = input.nextInt();
        System.out.println("The results of Int Operations are " + (a + b * c) + ", " + (a * b + c) + ", " +
                           (c + a / b) + ", " + (a % b + c));
    }
}
