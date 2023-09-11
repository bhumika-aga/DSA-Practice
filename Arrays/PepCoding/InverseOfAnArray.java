package PepCoding;

import java.util.Arrays;
import java.util.Scanner;

public class InverseOfAnArray {
    public static int[] inverse(int[] arr) {
        int[] result = new int[arr.length];
        int i = 0;
        while (i < arr.length) {
            result[arr[i]] = i;
            i++;
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
        s.close();
        System.out.println(Arrays.toString(inverse(arr)));
    }
}