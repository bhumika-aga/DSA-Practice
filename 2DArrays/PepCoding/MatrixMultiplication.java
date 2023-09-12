package PepCoding;

import java.util.Arrays;
import java.util.Scanner;

//     a     *     b     =                  result
// [a00 a01] * [b00 b01] = [(a00*b00 + a01*b10) (a00*b01 + a01*b11)]
// [a10 a11] * [b10 b11] = [(a10*b00 + a11*b10) (a10*b01 + a11*b11)]
// The approach dictates that we need to multiply the two matrices.
public class MatrixMultiplication {
    public static void matrixMultiplication(int n1, int m1, int[][] a, int n2, int m2, int[][] b) {
        /*
         * The first thing that needs to be done is that we need to check if the
         * matrices can be multiplied.
         * This is done if the no. of cloumns of a and the no. of rows of b are same in
         * number.
         */
        if (m1 != n2) {
            System.out.println("Invalid Input! Matrices cannot be multiplied!");
        } else {
            /*
             * Now for the multiplication of matrices, we need to make a new resultant
             * matrix which has the no. of rows equal to a and no. of columns equal to b.
             */
            int[][] result = new int[n1][m2];
            /*
             * For this approach to work, we need 3 loops.
             * 
             * Whenever we multiply a row of a to a column of b and add the result we get
             * one element of the matrix.
             * Example - result[0][1] = (a00*b01 + a01*b11)
             * 
             * Here we see that the in both the expressions that are being added together,
             * the row of the resultant array matches the current row of a and the column of
             * the resultant array matches the column of b.
             * 
             * Now the question arises of how to access the column of a and row of b.
             * This has been established before that the two are equal, hence the
             * multiplication is done.
             * 
             * So, we just need to put in another loop to access the row of a and column of
             * b.
             */
            // So, the first loop traverses through the row of result
            for (int i = 0; i < n1; i++) {
                // THe second loop traverses through the columns of result
                for (int j = 0; j < m2; j++) {
                    result[i][j] = 0;
                    // And the third loop is used to traverse through the matrices for
                    // multiplication
                    for (int k = 0; k < m1; k++) {
                        result[i][j] += a[i][k] * b[k][j];
                    }
                }

            }
            // Prints out the resultant array.
            for (int i = 0; i < result.length; i++) {
                System.out.println(Arrays.toString(result[i]));
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int m1 = s.nextInt();
        int[][] a = new int[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                a[i][j] = s.nextInt();
            }
        }
        int n2 = s.nextInt();
        int m2 = s.nextInt();
        int[][] b = new int[n2][m2];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                b[i][j] = s.nextInt();
            }
        }
        s.close();
        matrixMultiplication(n1, m1, a, n2, m2, b);
    }
}