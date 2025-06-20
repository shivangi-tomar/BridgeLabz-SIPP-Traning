public class FactorAnalysis {

    // 1. Method to find all factors
    public static int[] getFactors(int n) {
        int count = 0;

        // First loop to count number of factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // 2. Find greatest factor (excluding the number itself if needed)
    public static int findGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int i = 1; i < factors.length; i++) {
            if (factors[i] > max) {
                max = factors[i];
            }
        }
        return max;
    }

    // 3. Find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // 4. Find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // 5. Find product of cubes of factors
    public static long productOfCubes(int[] factors) {
        long result = 1;
        for (int f : factors) {
            result *= (long)Math.pow(f, 3);
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 12;
        System.out.println("Analyzing number: " + num);

        int[] factors = getFactors(num);

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        int greatest = findGreatestFactor(factors);
        int sum = sumOfFactors(factors);
        long product = productOfFactors(factors);
        long cubeProduct = productOfCubes(factors);

        System.out.println("Greatest Factor: " + greatest);
        System.out.println("Sum of Factors: " + sum);
        System.out.println("Product of Factors: " + product);
        System.out.println("Product of Cubes of Factors: " + cubeProduct);
    }
}
