class ReverseString {
    public static void main(String[] args) {
        String original = "hello";
        
        // Create StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Append original string
        sb.append(original);

        // Reverse using reverse() method
        sb.reverse();

        // Convert to string and print
        String reversed = sb.toString();
        System.out.println("Reversed string: " + reversed);
    }
}
