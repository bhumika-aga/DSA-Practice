package PepCoding;

import java.util.Scanner;

/* 
 * Given a 2D Array print the array in a spiral form. 
 * Example: A[2][3] ==>
 * [1  3  5]
 * [2  4  6]
 * Output ==> 1, 2, 4, 6, 5, 3
 * The approach dictates to print the outer most elements of the matrix first followed by the inside ones.
*/
public class SpiralTraversal {
    /*
     * Instead of thinking of it as a spiral, we can think of it as boxes in boxes.
     * We print the outer-most box first, then the one inside it and so on...
     */
    public static void spiralTraversal(int rows, int columns, int[][] arr) {
        /*
         * Now, to identify a box, we only need the top left and bottom right dimension
         * of it.
         * We need four loops to print one box - 1. For left wall, 2. For bottom wall,
         * 3. For Right wall, and 4. For top wall.
         * For the left wall and right walls, the column will remain same and the rows
         * will change from min to max, and vice versa.
         * For the bottom and top walls, the column stays the same and the rows change
         * from min to max, and vice versa.
         * TO save from repeating corners we increase minCol and minRow, and decrease
         * maxRow and maxCol. as soon as they are printed.
         */
        // Defines the top left dimension of the box.
        int minRow = 0;
        int minCol = 0;
        // Defines the bottom right dimension of the box.
        int maxRow = arr.length - 1;
        int maxCol = arr[0].length - 1;

        // To check that we have printed all the elements, no more or less.
        int totalElements = rows * columns;
        int counter = 0;

        // While any box is left
        while (counter < totalElements) {
            // Left wall
            for (int i = minRow, j = minCol; i <= maxRow && counter < totalElements; i++) {
                System.out.print(arr[i][j] + " ");
                counter++;
            }
            minCol++;
            // Bottom wall
            for (int i = maxRow, j = minCol; j <= maxCol && counter < totalElements; j++) {
                System.out.print(arr[i][j] + " ");
                counter++;
            }
            maxRow--;
            // Right wall
            for (int i = maxRow, j = maxCol; i >= minRow && counter < totalElements; i--) {
                System.out.print(arr[i][j] + " ");
                counter++;
            }
            maxCol--;
            // Top wall
            for (int i = minRow, j = maxCol; j >= minCol && counter < totalElements; j--) {
                System.out.print(arr[i][j] + " ");
                counter++;
            }
            minRow++;
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
        spiralTraversal(rows, columns, arr);
    }
}