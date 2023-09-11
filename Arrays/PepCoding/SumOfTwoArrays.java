package PepCoding;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void getSum(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] sum = new int[n1 > n2 ? n1 : n2];
        int carry = 0;

        int i = n1 - 1;
        int j = n2 - 1;
        int k = sum.length - 1;

        while (k >= 0) {
            int d = carry;

            if (i >= 0) {
                d += arr1[i];
            }

            if (j >= 0) {
                d += arr2[j];
            }

            carry = d / 10;
            d %= 10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }

        if (carry != 0) {
            System.out.print(carry);
        }

        for (int val : sum) {
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
        getSum(arr1, arr2);
    }
}