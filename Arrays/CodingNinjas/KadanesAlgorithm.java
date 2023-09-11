package CodingNinjas;
//https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms/content/118820/offering/1381870
public class KadanesAlgorithm {
    public static int kadanesMaxSum(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum = ((currSum + arr[i]) > 0) ? (currSum + arr[i]) : 0;
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 2, -2, 5, 7, -3, 1 };
        System.out.println(kadanesMaxSum(arr));
    }
}