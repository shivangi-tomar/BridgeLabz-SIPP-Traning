import java.util.*;

public class MatrixOperations {

    // Method to generate a random matrix
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10); // Random values 0-9
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrix(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrix(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int rowsA = A.length, colsA = A[0].length, colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++)
            for (int j = 0; j < colsB; j++)
                for (int k = 0; k < colsA; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    // Method to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row)
                System.out.print(value + "\t");
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns for Matrix A: ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        System.out.print("Enter rows and columns for Matrix B: ");
        int r2 = sc.nextInt(), c2 = sc.nextInt();

        int[][] A = generateMatrix(r1, c1);
        int[][] B = generateMatrix(r2, c2);

        System.out.println("\nMatrix A:");
        printMatrix(A);
        System.out.println("\nMatrix B:");
        printMatrix(B);

        // Addition and subtraction only if dimensions match
        if (r1 == r2 && c1 == c2) {
            System.out.println("\nAddition (A + B):");
            printMatrix(addMatrix(A, B));

            System.out.println("\nSubtraction (A - B):");
            printMatrix(subtractMatrix(A, B));
        } else {
            System.out.println("\nAddition and Subtraction not possible due to mismatched dimensions.");
        }

        // Multiplication only if cols of A == rows of B
        if (c1 == r2) {
            System.out.println("\nMultiplication (A x B):");
            printMatrix(multiplyMatrix(A, B));
        } else {
            System.out.println("\nMultiplication not possible (columns of A != rows of B).");
        }
    }
}
