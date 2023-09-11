import java.util.Scanner;

public class AnyBaseAddition {
    /*
     * public static int getMod(int n, int base) {
     * return n % base;
     * }
     * 
     * public static int getDiv(int n, int base) {
     * return n / base;
     * }
     * 
     * 
     * public static int convertToDecimal(int n, int base) {
     * int result = 0;
     * int i = 0;
     * while (n != 0) {
     * result += (getMod(n, 10) * Math.pow(base, i));
     * n = getDiv(n, 10);
     * i++;
     * }
     * return result;
     * }
     * 
     * public static int convertToBase(int n, int base) {
     * int result = 0;
     * int i = 1;
     * while (n != 0) {
     * result += (getMod(n, base) * i);
     * n = getDiv(n, base);
     * i *= 10;
     * }
     * return result;
     * }
     * 
     * public static int anyBaseAddition(int base, int num1, int num2) {
     * int result = convertToDecimal(num1, base) + convertToDecimal(num2, base);
     * result = convertToBase(result, base);
     * return result;
     * }
     */

    public static int anyBaseAddition(int base, int num1, int num2) {
        int result = 0;
        int carry = 0;
        int i = 1;
        while ((num1 > 0 || num2 > 0) || carry > 0) {
            int a = num1 % 10;
            num1 = num1 / 10;
            int b = num2 % 10;
            num2 = num2 / 10;
            int tempSum = a + b + carry;
            carry = 0;
            if (tempSum >= base) {
                carry = tempSum / base;
            }
            result += (tempSum % base) * i;
            i *= 10;
        }

        return (result + (carry * i));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        s.close();
        System.out.println(anyBaseAddition(base, num1, num2));
    }
}