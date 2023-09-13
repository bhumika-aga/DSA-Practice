package PepCoding;

import java.util.Scanner;

/* 
 * Given a 2D Array Maze of 0's and 1's print the exit point of the maze.
 * The constraints are such that seeing zero's, the pointer will go straight, and when encountered with 1,  *the pointer takes a 90 degree turn. 
 * Example: A[4][4] ==>
 * [0  0  1  0]
 * [1  0  0  0]
 * [0  0  0  0]
 * [1  0  1  0]
 * The pointer's path ==> A[0][0] -> A[0][1] -> A[0][2] -> A[1][2] -> A[2][2] -> A[3][2] -> A[3][1] -> A[3][0] -> A[2][0] -> A[1][0] -> A[1][1] -> A[1][2] -> A[1][3]
 * Output -> A[1][3] (Exit Point of the Maze)
*/
public class ExitPointOfAMaze {
    public static int[] exitPoint(int rows, int columns, int[][] arr) {
        int currRow = 0;
        int currCol = 0;
        int[] exitPointMatrix = { 0, 0 };
        if (arr[currRow][currCol] == 1) {
            currRow++;
        } else {
            currCol++;
        }
        return exitPointMatrix;
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
        exitPoint(rows, columns, arr);
    }
}