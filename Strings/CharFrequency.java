import java.util.Scanner;

public class CharFrequency {

    public static void countFrequency(String text) {
        int[] freq = new int[256]; // For all ASCII characters

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        System.out.println("Character Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " : " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        countFrequency(input);
    }
}
