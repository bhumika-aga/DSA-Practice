package Others;

import java.util.Scanner;

//Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
public class MaxMin {
    public static int findMax(int num1, int num2, int num3) {
        return Math.max(num3, Math.max(num1, num2));
    }

    public static int findMin(int num1, int num2, int num3) {
        return Math.min(num3, Math.min(num1, num2));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = in.nextInt();
        System.out.println("Enter another number:");
        int num2 = in.nextInt();
        System.out.println("Enter a third number:");
        int num3 = in.nextInt();

        int max = findMax(num1, num2, num3);
        int min = findMin(num1, num2, num3);
        in.close();

        System.out.println("The maximum number among the three is = " + max);
        System.out.println("The minimum number among the three is = " + min);
    }
}