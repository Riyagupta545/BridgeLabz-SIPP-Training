package Methods.Level3;
import java.util.Random;

public class MatrixAdvanced {

    // Method to create a random matrix
    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10) + 1; // values from 1 to 10
        return matrix;
    }

    // Display matrix (int version)
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }

    // Display matrix (double version)
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
    }

    // Transpose a matrix
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[j][i] = matrix[i][j];

        return result;
    }

    // Determinant of 2x2 matrix
    public static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    // Determinant of 3x3 matrix
    public static int determinant3x3(int[][] m) {
        int a = m[0][0], b = m[0][1], c = m[0][2];
        int d = m[1][0], e = m[1][1], f = m[1][2];
        int g = m[2][0], h = m[2][1], i = m[2][2];

        return a * (e * i - f * h)
             - b * (d * i - f * g)
             + c * (d * h - e * g);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) throw new ArithmeticException("Matrix is singular, inverse not possible.");

        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1] / (double) det;
        inv[0][1] = -m[0][1] / (double) det;
        inv[1][0] = -m[1][0] / (double) det;
        inv[1][1] =  m[0][0] / (double) det;
        return inv;
    }

    // Cofactor matrix of 3x3
    public static int[][] cofactor3x3(int[][] m) {
        int[][] cof = new int[3][3];

        cof[0][0] = m[1][1] * m[2][2] - m[1][2] * m[2][1];
        cof[0][1] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]);
        cof[0][2] = m[1][0] * m[2][1] - m[1][1] * m[2][0];

        cof[1][0] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]);
        cof[1][1] = m[0][0] * m[2][2] - m[0][2] * m[2][0];
        cof[1][2] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]);

        cof[2][0] = m[0][1] * m[1][2] - m[0][2] * m[1][1];
        cof[2][1] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]);
        cof[2][2] = m[0][0] * m[1][1] - m[0][1] * m[1][0];

        return cof;
    }

    // Inverse of 3x3 matrix
    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) throw new ArithmeticException("Matrix is singular, inverse not possible.");

        int[][] cof = cofactor3x3(m);
        int[][] adj = transpose(cof);

        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inv[i][j] = adj[i][j] / (double) det;

        return inv;
    }

    public static void main(String[] args) {
        // 2x2 Operations
        System.out.println("==== 2x2 Matrix ====");
        int[][] mat2x2 = createMatrix(2, 2);
        displayMatrix(mat2x2);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(mat2x2));

        System.out.println("\nDeterminant: " + determinant2x2(mat2x2));

        try {
            System.out.println("\nInverse:");
            displayMatrix(inverse2x2(mat2x2));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 3x3 Operations
        System.out.println("\n==== 3x3 Matrix ====");
        int[][] mat3x3 = createMatrix(3, 3);
        displayMatrix(mat3x3);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(mat3x3));

        System.out.println("\nDeterminant: " + determinant3x3(mat3x3));

        try {
            System.out.println("\nInverse:");
            displayMatrix(inverse3x3(mat3x3));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
