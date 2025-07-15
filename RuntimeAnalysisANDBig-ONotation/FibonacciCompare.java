public class FibonacciCompare {
    public static void main(String[] args) {
        int n = 30;

        long start = System.currentTimeMillis();
        int r = fibonacciRecursive(n);
        long end = System.currentTimeMillis();
        System.out.println("Recursive: " + r + " Time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        int i = fibonacciIterative(n);
        end = System.currentTimeMillis();
        System.out.println("Iterative: " + i + " Time: " + (end - start) + " ms");
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        int a = 0, b = 1, sum;
        if (n == 0) return 0;
        for (int j = 2; j <= n; j++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
