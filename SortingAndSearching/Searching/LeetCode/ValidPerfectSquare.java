package Searching.LeetCode;

//https://leetcode.com/problems/valid-perfect-square/
public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        long i = 1;
        long square = i * i;
        while (num >= square) {
            i++;
            square = i * i;
        }
        i -= 1;
        if (i * i == num) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }
}