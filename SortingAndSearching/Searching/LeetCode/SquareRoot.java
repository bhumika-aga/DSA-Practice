package Searching.LeetCode;

//https://leetcode.com/problems/sqrtx/
public class SquareRoot {
    public static int mySqrt(int x) {
        long i = 1;
        long square = (i * i);
        while (x >= square) {
            i++;
            square = i * i;
        }
        return (int) (i - 1);
    }

    public static void main(String[] args) {
        int x = 4;
        System.out.println(mySqrt(x));
    }
}