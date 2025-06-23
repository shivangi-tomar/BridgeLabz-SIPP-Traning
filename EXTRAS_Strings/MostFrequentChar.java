public class MostFrequentChar {
    public static void main(String[] args) {
        String str = "success";
        int maxCount = 0;
        char frequent = ' ';

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                frequent = str.charAt(i);
            }
        }

        System.out.println("Most Frequent Character: '" + frequent + "'");
    }
}
