package Others;

//Input a number and print all the factors of that number
//Use loops
public class Factors {
    public static void main(String[] args) {
        int num = 100;

        System.out.println("The factors of the number are:");
        if (num == 0) {
            System.out.println("0");
            return;
        }
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}