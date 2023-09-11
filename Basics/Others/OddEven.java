package Others;

//Write a program to print whether a number is even or odd
//Also take input.
public class OddEven {
    public static void main(String[] args) {
        int num = 82;
        if (num == 0) {
            System.out.println("Number is zero!");
            return;
        }
        if (num % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}