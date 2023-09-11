package Others;

//Take 2 numbers as input and print the largest number.
public class Largest {
    public static void main(String[] args) {
        int num1 = 47;
        int num2 = 36;

        if (num1 > num2) {
            System.out.println(num1 + " is the largest!");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the largest!");
        } else {
            System.out.println("Both are equal!");
        }
    }
}