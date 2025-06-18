package Methods.Level3;
public class MatrixAdvancedOperations {

    // Generate a random matrix
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10);  // 0-9
        return matrix;
    }

    // Transpose of a matrix
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
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
        return m[0][0] * (m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1] * (m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2] * (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1];
        inv[0][1] = -m[0][1];
        inv[1][0] = -m[1][0];
        inv[1][1] = m[0][0];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                inv[i][j] = inv[i][j] / det;

        return inv;
    }

    // Display any matrix (int version)
    public static void printMatrix(String label, int[][] matrix) {
        System.out.println(label + ":");
        for (int[] row : matrix) {
            for (int val : row)
                System.out.printf("%5d", val);
            System.out.println();
        }
        System.out.println();
    }

    // Display any matrix (double version)
    public static void printMatrix(String label, double[][] matrix) {
        System.out.println(label + ":");
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%8.2f", val);
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 2x2 Matrix
        int[][] matrix2x2 = generateMatrix(2, 2);
        printMatrix("2x2 Matrix", matrix2x2);

        printMatrix("Transpose of 2x2", transpose(matrix2x2));
        int det2x2 = determinant2x2(matrix2x2);
        System.out.println("Determinant of 2x2: " + det2x2);

        double[][] inv2x2 = inverse2x2(matrix2x2);
        if (inv2x2 != null)
            printMatrix("Inverse of 2x2", inv2x2);
        else
            System.out.println("Inverse not possible (Det = 0)");

        // 3x3 Matrix
        int[][] matrix3x3 = generateMatrix(3, 3);
        printMatrix("3x3 Matrix", matrix3x3);

        printMatrix("Transpose of 3x3", transpose(matrix3x3));
        int det3x3 = determinant3x3(matrix3x3);
        System.out.println("Determinant of 3x3: " + det3x3);
    }
}
