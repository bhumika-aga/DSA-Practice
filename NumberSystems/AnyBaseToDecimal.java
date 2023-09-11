import java.util.Scanner;

public class AnyBaseToDecimal {
    public static int getMod(int n, int base) {
        return n % base;
    }

    public static int getDiv(int n, int base) {
        return n / base;
    }

    public static int convertToBase(int n, int base) {
        int result = 0;
        int i = 0;
        while (n != 0) {
            result += (getMod(n, 10) * Math.pow(base, i));
            n = getDiv(n, 10);
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int base = s.nextInt();
        s.close();
        System.out.println(convertToBase(n, base));
    }
}