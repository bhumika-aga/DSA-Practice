package Others;

import java.util.Scanner;

//Print the largest of the 3 numbers
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        in.close();

        /*
         * if(num1 > num2 && num1 > num3){
         * System.out.println(num1 + " is the largest");
         * }
         * else if(num2 > num1 && num2 > num3){
         * System.out.println(num2 + " is the largest");
         * }
         * else if(num3 > num1 && num3 > num2){
         * System.out.println(num3 + " is the largest");
         * }
         */

        /*
         * int max = 0;
         * if(num1 > num2){
         * max = num1;
         * }
         * else{
         * max = num2;
         * }
         * if(num3 > max){
         * max = num3;
         * }
         * System.out.println(max + " is the largest");
         */

        int max = Math.max(num3, Math.max(num1, num2));
        System.out.println(max + " is the largest");
    }
}