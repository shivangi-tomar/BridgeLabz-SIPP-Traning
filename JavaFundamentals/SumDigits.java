import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 2-digit number: ");
        int num = input.nextInt();
        int sum = (num / 10) + (num % 10);
        System.out.println("The sum of digits is " + sum);
    }
}
