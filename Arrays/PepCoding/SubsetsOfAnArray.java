package PepCoding;

import java.util.Scanner;

public class SubsetsOfAnArray {
    public static void subset(int[] arr) {
        int limit = (int) Math.pow(2, arr.length);
        for (int i = 0; i < limit; i++) {
            int temp = i;
            String set = "";
            for (int j = arr.length - 1; j >= 0; j--) {
                int rem = temp % 2;
                temp = i / 2;
                if (rem == 0) {
                    set = "-\t" + set;
                } else {
                    set = arr[j] + "\t" + set;
                }
                System.out.println(set);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        subset(arr);
    }
}