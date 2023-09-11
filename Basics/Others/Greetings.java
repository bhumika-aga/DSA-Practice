package Others;

//Take name as input and print a greeting message for that name.
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you name:");
        String name = in.next();
        in.close();
        System.out.println("Hello " + name + "!");
        System.out.println("Have a great day!");
    }
}