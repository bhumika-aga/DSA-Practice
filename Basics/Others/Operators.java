package Others;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value.
//Use if conditions
public class Operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = in.nextInt();
        System.out.println("Enter another number:");
        int num2 = in.nextInt();
        System.out.println("Enter an operator:");
        char op = in.next().charAt(0);
        in.close();

        if (op == '+') {
            System.out.println("The sum of the two numbers is = " + (num1 + num2));
            return;
        } else if (op == '-') {
            System.out.println("The difference of the two numbers is = " + (num1 - num2));
            return;
        } else if (op == '*') {
            System.out.println("The product of the two numbers is = " + (num1 * num2));
            return;
        } else if (op == '/') {
            System.out.println("The division of the two numbers is = " + (num1 / num2));
            return;
        } else {
            System.out.println("Operand not recognised!");
            return;
        }
    }
}