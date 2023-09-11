import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static int getMod(int n, int base) {
        return n % base;
    }

    public static int getDiv(int n, int base) {
        return n / base;
    }

    public static int convertToBase(int n, int base) {
        int result = 0;
        int i = 1;
        while (n != 0) {
            result += (getMod(n, base) * i);
            n = getDiv(n, base);
            i *= 10;
        }
        return result;
    }

    public static int convertToDecimal(int n, int base) {
        int result = 0;
        int i = 0;
        while (n != 0) {
            result += (getMod(n, 10) * Math.pow(base, i));
            n = getDiv(n, 10);
            i++;
        }
        return result;
    }

    public static int convertToBase(int n, int baseOfN, int base) {
        int result = 0;
        int i = 0;
        if (base == 10 || baseOfN == 10) {
            while (n != 0) {
                result += (getMod(n, base) * Math.pow(baseOfN, i));
                n = getDiv(n, base);
                i++;
            }
        } else {
            n = convertToDecimal(n, baseOfN);
            result = convertToBase(n, base);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int baseOfN = s.nextInt();
        int base = s.nextInt();
        s.close();
        System.out.println(convertToBase(n, baseOfN, base));
    }
}