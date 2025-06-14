import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double weight = input.nextDouble();
        System.out.print("Enter height (m): ");
        double height = input.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your BMI is " + bmi);
    }
}
