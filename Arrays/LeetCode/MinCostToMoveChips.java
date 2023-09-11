package LeetCode;

//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
public class MinCostToMoveChips {
    public static int minCostToMoveChips(int[] position) {
        int evenCost = 0;
        int oddCost = 0;
        for (int i : position) {
            if (i % 2 == 0) {
                evenCost++;
            } else {
                oddCost++;
            }
        }

        return Math.min(evenCost, oddCost);
    }

    public static void main(String[] args) {
        int[] position = { 2, 2, 2, 3, 3 };
        System.out.println(minCostToMoveChips(position));
    }
}