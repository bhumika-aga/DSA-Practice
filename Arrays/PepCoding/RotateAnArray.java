package PepCoding;

import java.util.Arrays;
import java.util.Scanner;

public class RotateAnArray {
    public static int[] reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static int[] rotate(int[] arr, int k) {
        // My Approach (Complexity = O(N^2))
        /*
         * k = arr.length - (k % arr.length);
         * int index = arr.length - 1;
         * int i = 0;
         * for (int j = 0; j < k; j++) {
         * while (i < arr.length) {
         * int temp = arr[i];
         * arr[i] = arr[index];
         * arr[index] = temp;
         * i++;
         * }
         * i = 0;
         * }
         * return arr;
         */

        // PepCoding Approach (Complexity = O(N))
        k = k % arr.length;
        if (k < 0) {
            k += arr.length;
        }
        // Reverse of arr from index 0 to (arr.length - 1 - k)
        reverse(arr, 0, arr.length - 1 - k);
        // Reverse of array from (arr.length - k) to (arr.length - 1)
        reverse(arr, arr.length - k, arr.length - 1);
        // Reverse of the whole array
        reverse(arr, 0, arr.length - 1);
        return arr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        s.close();
        System.out.println(Arrays.toString(rotate(arr, k)));
    }
}