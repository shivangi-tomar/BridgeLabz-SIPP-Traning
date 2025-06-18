import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 10;

        for (int i = 1; i <= total; i++) {
            System.out.print("Enter age of student " + i + ": ");
            int age = sc.nextInt();

            if (age >= 18) {
                System.out.println("Student " + i + " is eligible to vote.");
            } else {
                System.out.println("Student " + i + " is NOT eligible to vote.");
            }
        }
    }
}
