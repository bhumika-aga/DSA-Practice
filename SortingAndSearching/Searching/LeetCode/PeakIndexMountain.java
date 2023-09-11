package Searching.LeetCode;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndexMountain {
    public static int peakIndexInMountainArray(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[result]) {
                result = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 10, 5, 2 };
        /*
         * int[] arr = { 0, 1, 0 };
         * int[] arr = { 0, 2, 1, 0 };
         */
        System.out.println(peakIndexInMountainArray(arr));
    }
}