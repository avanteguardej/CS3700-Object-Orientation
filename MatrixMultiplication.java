
/*
 * Joyce Keizer
 * CS 3700 - Object Orientation
 * Module 5 Assignment
 * Arrays and Enhanced For Loops
 */

public class MatrixMultiplication {

    public static void main(String[] args) {

        // Define the two input matrices.
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Verify that the matrices can be multiplied.
        if (matrixA[0].length != matrixB.length) {
            System.out.println("Matrices cannot be multiplied.");
            return;
        }

        // Initialize an empty result matrix.
        int[][] result = new int[matrixA.length][matrixB[0].length];

        // Multiply the matrices using enhanced for loops.
        int rowIndex = 0;

        for (int[] rowA : matrixA) {

            int columnIndex = 0;

            for (int[] columnB : transpose(matrixB)) {

                int sum = 0;
                int elementIndex = 0;

                for (int valueA : rowA) {
                    sum += valueA * columnB[elementIndex];
                    elementIndex++;
                }

                result[rowIndex][columnIndex] = sum;
                columnIndex++;
            }

            rowIndex++;
        }

        // Display the completed result matrix.
        System.out.println("Matrix Multiplication Result:");
        System.out.println("-----------------------------");

        for (int[] row : result) {
            for (int value : row) {
                System.out.printf("%6d", value);
            }
            System.out.println();
        }
    }

    // Transpose matrix B to process columns with enhanced loops.
    public static int[][] transpose(int[][] matrix) {

        int[][] transposed =
            new int[matrix[0].length][matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0;
                 column < matrix[0].length; column++) {

                transposed[column][row] = matrix[row][column];
            }
        }

        return transposed;
    }
}
