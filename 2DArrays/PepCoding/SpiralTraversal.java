package PepCoding;

import java.util.Scanner;

/* 
 * Given a 2D Array print the array in a wave form. 
 * Example: A[2][3] ==>
 * [1  3  5]
 * [2  4  6]
 * Output ==> 1, 2, 4, 6, 5, 3
*/
public class SpiralTraversal {
    /*
     * Instead of thinking of it as a spiral, we can think of it as boxes in boxes.
     * We print the outer-most box first, then the one inside it and so on...
     */
    public static void spiralTraversal(int rows, int columns, int[][] arr) {
        /* 
         * 
         */
        return;
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
        spiralTraversal(rows, columns, arr);
    }
}