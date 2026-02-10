package DSA;

public class MatrixPathProblem {
    public static void main(String[] args) {
        System.out.println(matrixPath(3,100));
    }

    public static int matrixPath(int rows, int cols) {
        if (rows == 1 || cols == 1) {
            return 1;
        }
        return matrixPath(rows - 1, cols) + matrixPath(rows, cols - 1);
    }
}
