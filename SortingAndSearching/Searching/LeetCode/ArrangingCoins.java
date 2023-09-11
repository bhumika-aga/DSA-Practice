package Searching.LeetCode;

//https://leetcode.com/problems/arranging-coins/
public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        int rows;
        for (rows = 1; rows <= n; rows++) {
            n = n - rows;
        }
        return rows - 1;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(arrangeCoins(n));
    }
}