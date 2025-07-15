public class StringConcat {
    public static void main(String[] args) {
        // Using StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) sb.append("a");
        System.out.println("StringBuilder length: " + sb.length());

        // Using StringBuffer
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 10000; i++) sbf.append("a");
        System.out.println("StringBuffer length: " + sbf.length());

        // Using plain String (very slow)
        String s = "";
        for (int i = 0; i < 10000; i++) s += "a";
        System.out.println("String length: " + s.length());
    }
}
