class ConcatenateStrings {
    public static void main(String[] args) {
        // Step 1: Define the array of strings
        String[] words = {"Hello", " ", "Shivangi", ", ", "how", " ", "are", " ", "you?"};

        // Step 2: Create a StringBuffer
        StringBuffer sb = new StringBuffer();

        // Step 3: Append each word to the buffer
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
        }

        // Step 4: Print the final concatenated string
        System.out.println("Concatenated String: " + sb.toString());
    }
}
