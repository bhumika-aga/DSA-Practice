import java.util.Scanner;

public class AnyBaseSubtraction {
    /*
     * public static int anyBaseSubtraction(int base, int num1, int num2) {
     * int result = 0;
     * int i = 1;
     * while (num1 > 0 || num2 > 0) {
     * int a = num1 % 10;
     * num1 = num1 / 10;
     * int b = num2 % 10;
     * num2 = num2 / 10;
     * if (b - a < 0) {
     * num2--;
     * // num2 = (num2 - 1) > base ? (num2 - 1) % base : num2--;
     * b += base;
     * }
     * result += (b - a) * i;
     * i *= 10;
     * }
     * 
     * return result;
     * }
     */

    public static int anyBaseSubtraction(int base, int num1, int num2) {
        int result = 0;
        int borrow = 0;
        int i = 1;
        while ((num1 > 0 || num2 > 0) || borrow > 0) {
            int a = num1 % 10;
            num1 = num1 / 10;
            int b = num2 % 10;
            num2 = num2 / 10;
            int tempSub = (b - borrow) - a;
            borrow = 0;
            if (tempSub < 0) {
                borrow = 1;
                result += (tempSub + base) * i;
            } else {
                result += tempSub * i;
            }
            i *= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        s.close();
        System.out.println(anyBaseSubtraction(base, num1, num2));
    }
}