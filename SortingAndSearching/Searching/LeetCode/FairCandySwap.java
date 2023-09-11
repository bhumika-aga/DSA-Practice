package Searching.LeetCode;

import java.util.Arrays;

//https://leetcode.com/problems/fair-candy-swap/
public class FairCandySwap {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] result = new int[2];
        int sumAlice = 0;
        int sumBob = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            sumAlice = sumAlice + aliceSizes[i];
        }
        for (int i = 0; i < bobSizes.length; i++) {
            sumBob = sumBob + bobSizes[i];
        }
        int diff = (sumAlice - sumBob) / 2;
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                if (aliceSizes[i] - bobSizes[j] == diff) {
                    result[0] = aliceSizes[i];
                    result[1] = bobSizes[j];
                    return result;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] aliceSizes = { 1, 2 };
        int[] bobSizes = { 2, 3 };

        /*
         * int[] aliceSizes = { 1, 1 };
         * int[] bobSizes = { 2, 2 };
         * int[] aliceSizes = { 2 };
         * int[] bobSizes = { 1, 3 };
         */

        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }
}