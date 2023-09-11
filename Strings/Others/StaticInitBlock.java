package Others;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-static-initializer-block/problem
public class StaticInitBlock {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int breadth = s.nextInt();
        int height = s.nextInt();
        if (breadth > 0 && height > 0) {
            int area = breadth * height;
            System.out.println(area);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        s.close();
    }
}