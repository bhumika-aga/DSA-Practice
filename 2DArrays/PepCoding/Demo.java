package PepCoding;

public class Demo {
    public static void main(String[] args) {
        /*
         * Scanner s = new Scanner(System.in);
         * int n = s.nextInt();
         * int m = s.nextInt();
         * int[][] arr = new int[n][m];
         * for (int i = 0; i < n; i++) {
         * for (int j = 0; j < m; j++) {
         * arr[i][j] = s.nextInt();
         * }
         * }
         * s.close();
         */
        int n = 3;
        int m = 4;
        //Can be thought as array of arrays
        //Can be thought as arr = 3 arrays if 4 sizes each.
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}