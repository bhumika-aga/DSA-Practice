package PepCoding;

import java.util.Arrays;
import java.util.Scanner;

public class CeilAndFloorValue {
    public static int[] floorAndCeiling(int[] arr, int num) {
        int[] result = new int[2];
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (num == arr[mid]) {
                result[0] = mid;
                result[1] = mid;
                break;
            } else if (num < arr[mid]) {
                end = mid - 1;
                result[1] = arr[mid];
            } else if (num > arr[mid]) {
                start = mid + 1;
                result[0] = arr[mid];
            }
        }
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
        System.out.println(Arrays.toString(floorAndCeiling(arr, num)));
    }
}