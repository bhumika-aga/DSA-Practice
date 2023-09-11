package PepCoding;

import java.util.Scanner;

public class FrequencyofDigits {
    public static int getFrequency(int n, int target) {
        int count = 0;
        while (n >= 10) {
            int rem = n % 10;
            n = n / 10;
            if (rem == target) {
                count++;
            }
        }
        if (n == target) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int target = s.nextInt();
        s.close();
        System.out.println(getFrequency(n, target));
    }
}