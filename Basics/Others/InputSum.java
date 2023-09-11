package Others;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers
//HINT: while loop
public class InputSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter numbers:");
        int num = in.nextInt();
        int sum = 0;

        while (num != 0) {
            sum = sum + num;
            num = in.nextInt();
        }
        in.close();
        System.out.println("The sum of the numbers is = " + sum);
    }
}