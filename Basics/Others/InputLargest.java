package Others;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.
public class InputLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter numbers:");
        int num = in.nextInt();
        int largest = 0;

        while (num != 0) {
            if (num > largest) {
                largest = num;
            }
            num = in.nextInt();
        }
        in.close();
        System.out.println("The largest number is = " + largest);
    }
}