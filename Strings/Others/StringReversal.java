package Others;

/* A series of num_operations are performed on a string initial_string of length n that contains lowercase English letters only. In the ith operation, the prefix of the string of length i is reversed. The final string thus formed is represented by final_string. 
Given the string final_string and an integer num_operations, find the initial_string on which the operations were performed.

Example:
Suppose final_string = "chakerrank" and num_operations = 3.
Then the initial string will be "hackerrank".
On the first operation, reverse "h" -> "hackerrank"
Reverse "ha" -> "ahckerrank".
Reverse "ahc" -> "chakerrank" which is equal to the final_string.

Hence the answer is "hackerrank". */

public class StringReversal {
    public static String getInitialString(String finalString, int numOperations) {
        String str = "";
        // Write your code here
        for (int j = numOperations; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                char ch = finalString.charAt(i);
                str = ch + str;
            }
            finalString = finalString.replace(finalString.substring(0, j), str);
            str = "";
        }
        return finalString;
    }

    public static void main(String[] args) {
        String finalString = "bbaaaba";
        int numOperations = 5;
        System.out.println(getInitialString(finalString, numOperations));
    }
}