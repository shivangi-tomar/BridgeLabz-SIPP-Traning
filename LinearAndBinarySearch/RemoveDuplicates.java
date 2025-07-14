import java.util.HashSet;

class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";

        // Step 1: Create empty StringBuilder and HashSet
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        // Step 2: Iterate over each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (!seen.contains(ch)) {
                sb.append(ch);      // Add character if not seen
                seen.add(ch);       // Mark character as seen
            }
        }

        // Step 3: Output the result
        System.out.println("String after removing duplicates: " + sb.toString());
    }
}
