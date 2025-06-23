public class ToggleCase {
    public static void main(String[] args) {
        String str = "Java";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z')
                result += (char)(ch - 32);
            else if (ch >= 'A' && ch <= 'Z')
                result += (char)(ch + 32);
            else
                result += ch;
        }

        System.out.println("Toggled Case: " + result);
    }
}
