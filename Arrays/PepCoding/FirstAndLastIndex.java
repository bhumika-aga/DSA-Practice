package PepCoding;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastIndex {
    public static int getFirstIndex(int[] arr, int num) {
        int result = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (num < arr[mid]) {
                end = mid - 1;
            } else if (num > arr[mid]) {
                start = mid + 1;
            } else {
                result = mid;
                end = mid - 1;
            }
        }
        return result;
    }

    public static int getLastIndex(int[] arr, int num) {
        int result = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (num < arr[mid]) {
                end = mid - 1;
            } else if (num > arr[mid]) {
                start = mid + 1;
            } else {
                result = mid;
                end = mid + 1;
            }
        }
        return result;
    }

    public static int[] firstAndLastIndex(int[] arr, int num) {
        int[] result = new int[2];
        Arrays.sort(arr);
        result[0] = getFirstIndex(arr, num);
        result[1] = getLastIndex(arr, num);
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int num = s.nextInt();
        s.close();
        System.out.println(Arrays.toString(firstAndLastIndex(arr, num)));
    }
}