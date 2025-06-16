public class VotingCheck {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
