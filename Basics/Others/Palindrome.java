package Others;

import java.util.Scanner;

//Write a function to find if a number if palindrome or not
//Take number as parameter.
public class Palindrome {
    public static boolean palindrome(int num) {
        int r;
        int temp;
        int sum = 0;

        temp = num;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }

        return temp == sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = in.nextInt();
        in.close();

        if (palindrome(n)) {
            System.out.println(n + " is a Palindrome");
        } else {
            System.out.println(n + " is not a Palindrome");
        }
    }
}