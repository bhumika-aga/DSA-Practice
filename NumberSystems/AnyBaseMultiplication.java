import java.util.Scanner;

public class AnyBaseMultiplication {
    public static int anybaseAddition(int base, int num1, int num2) {
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

    public static int getProductWithDigit(int b, int n1, int d2) {
        int rv = 0;
        int c = 0;
        int p = 1;
        while (n1 > 0 || c > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;

            int d = d1 * d2 + c;
            c = d / b;
            d = d % b;

            rv += d * p;
            p = p * 10;
        }

        return rv;
    }

    public static int anybaseaseMultiplication(int base, int num1, int num2) {
        int result = 0;
        int p = 1;
        while (num2 > 0) {
            int d2 = num2 % 10;
            num2 = num2 / 10;

            int pwd = getProductWithDigit(base, num1, d2);
            result = anybaseAddition(base, result, p * pwd);
            p = p * 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int basease = s.nextInt();
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        s.close();
        System.out.println(anybaseaseMultiplication(basease, num1, num2));
    }
}