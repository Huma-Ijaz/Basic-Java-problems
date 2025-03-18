import java.util.Scanner;

class abcd{
    public static void main(String[] args) {

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        // Check if multiplication is possible
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        // Resultant matrix
        int[][] product = new int[matrix1.length][matrix2[0].length];

        // Perform matrix multiplication
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Print the product matrix
        System.out.println("Product of the matrices:");
        for (int[] row : product) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}



