package Others;

import java.util.Scanner;

//Write a program to input principle, time and rate (P, T, R) from user
//Find Simple Interest.
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Principal:");
        double p = in.nextDouble();
        System.out.println("Enter Time:");
        int t = in.nextInt();
        System.out.println("Enter rate of Interest:");
        double r = in.nextDouble();
        in.close();

        double si = (p * r * t) / 100;
        System.out.println("The Simple Interest is = " + si);
    }
}