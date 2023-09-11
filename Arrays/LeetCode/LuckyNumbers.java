package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/lucky-numbers-in-a-matrix/
public class LuckyNumbers {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        int[] min = new int[matrix.length];
        int[] max = new int[matrix[0].length];
        List<Integer> result = new ArrayList<Integer>();
        Arrays.fill(min, Integer.MAX_VALUE);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                min[i] = Math.min(matrix[i][j], min[i]);
                max[j] = Math.max(matrix[i][j], max[j]);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (min[i] == max[j]) {
                    result.add(min[i]);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
        System.out.println(luckyNumbers(matrix));
    }
}