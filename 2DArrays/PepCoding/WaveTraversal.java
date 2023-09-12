package PepCoding;

import java.util.Scanner;

/* 
 * Given a 2D Array print the array in a wave form. 
 * Example: A[2][3] ==>
 * [1  3  5]
 * [2  4  6]
 * Output ==> 1, 2, 4, 3, 5, 6
*/
public class WaveTraversal {
    public static void waveTraversal(int rows, int columns, int[][] arr) {
        /*
         * Here we observe that while traversing even columns, the row is increasing,
         * and for the odd columns the row is decreasing.
         */
        for (int i = 0; i < arr[0].length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            } else {
                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.print(arr[j][i] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int columns = s.nextInt();
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        s.close();
        waveTraversal(rows, columns, arr);
    }
}