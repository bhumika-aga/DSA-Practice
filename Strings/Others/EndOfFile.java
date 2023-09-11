package Others;
import java.util.*;

//https://www.hackerrank.com/challenges/java-end-of-file/problem
public class EndOfFile {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 1; s.hasNext() == true; i++) {
            System.out.println(i + " " + s.nextLine());
        }
        s.close();
    }
}