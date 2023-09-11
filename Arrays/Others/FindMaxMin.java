package Others;
import java.util.Scanner;

//Find the maximum and minimum elements in the array
public class FindMaxMin {
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int n = in.nextInt();

        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

        int max = findMax(arr);
        int min = findMin(arr);
        System.out.println("The maximum number in the array is = " + max);
        System.out.println("The minimum number in the array is = " + min);
    }
}