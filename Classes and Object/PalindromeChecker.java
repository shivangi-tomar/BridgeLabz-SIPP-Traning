class PalindromeChecker {
    String text;

    void setText(String t) {
        text = t;
    }

    boolean isPalindrome() {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }
        return text.equalsIgnoreCase(rev);
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }

    public static void main(String args[]) {
        PalindromeChecker pc = new PalindromeChecker();
        pc.setText("Madam");
        pc.displayResult();
    }
}
