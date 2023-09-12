package PepCoding;

import java.util.Scanner;

public class ExitPointOfAMaze {
    public static int[] exitPoint(int rows, int columns, int[][] arr) {
        return null;
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