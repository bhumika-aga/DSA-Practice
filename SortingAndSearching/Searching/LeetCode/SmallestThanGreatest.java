package Searching.LeetCode;

import java.util.Arrays;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestThanGreatest {
    public static char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);
        char result = letters[0];
        for (int l = 0; l < letters.length; l++) {
            if (letters[l] > target) {
                result = letters[l];
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] letters = { 'x', 'x', 'y', 'y' };
        char target = 'z';
        System.out.println(nextGreatestLetter(letters, target));
    }
}