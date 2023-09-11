package PepCoding;

import java.util.Scanner;

public class DifferenceOfTwoArrays {
    public static void getDiff(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] diff = new int[n1 > n2 ? n1 : n2];
        int carry = 0;

        int i = n1 - 1;
        int j = n2 - 1;
        int k = diff.length - 1;

        while (k >= 0) {
            int d = 0;

            if (j >= 0) {
                d = arr2[j];
            }

            if (i >= 0) {
                d = (arr1[i] - carry) - d;
            }

            if (d < 0) {
                carry = 1;
                diff[k] = d + 10;
            } else {
                diff[k] = d;
            }

            i--;
            j--;
            k--;
        }

        for (int val : diff) {
            System.out.print(val);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }
        int n2 = s.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = s.nextInt();
        }
        s.close();
        getDiff(arr1, arr2);
    }
}