public class Geometry {

    // Euclidean distance method
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Line equation slope and y-intercept
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);      // slope
        double b = y1 - m * x1;                // y-intercept
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        double x1 = 2, y1 = 3;
        double x2 = 5, y2 = 11;

        double dist = euclideanDistance(x1, y1, x2, y2);
        double[] equation = lineEquation(x1, y1, x2, y2);

        System.out.printf("Euclidean Distance: %.2f\n", dist);
        System.out.printf("Line Equation: y = %.2fx + %.2f\n", equation[0], equation[1]);
    }
}
