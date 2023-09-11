package Others;

import java.util.ArrayList;
import java.util.List;

/* The annual wizard championship witnesses a large number of participants every year. The rules of the championship this year are as follows:
1. There are 26 different types of gems, each with a distinct intrinsic power. (Each type is denoted by a lowercase letter of the English alphabet). 
2. Each participant is assigned a random sequence of gems. (The assigned sequence can have multiple instances of the same gem as well). Note that it is not necessary that everyone gets equal number of gems.
3. The competition will be conducted in rounds.
4. Each participant is required to use one gem per round in the same order they are placed in the assigned sequence. (That is, 1st gem of their sequence should be used in the 1st round, 2nd gem in the 2nd round, and ith gem in the ith round).
5. In each round, a participant will be eliminated if either:
    1. they don't have any gems left to use in that round or
    2. the gem they are using is less powerful than at least one of the other participant’s gem in that round.
    (There may be 0 or more eliminations in each round)

The task is to determine which participant will remain till the last and become the ultimate wizard.
Complete the winning_sequence function in the editor below. It has 2 parameters:
1. A string array of size n, arr, denoting the n sequences
2. A string of size 26, s, representing all the types of gems in increasing order of their power. 

The function must return a string denoting the sequence of gems assigned to the wizard who ultimately won. */

public class TheUltimateWizard {
    public static String winning_sequence(List<String> arr, String s) {
        return null;
    }

    public static void main(String[] args) {
        List<String> arr = new ArrayList<String>();
        arr.add("abc");
        arr.add("abd");
        arr.add("abz");
        String s = "abczdefghijklmnopqrstuvwxy";
        System.out.println(winning_sequence(arr, s));
    }
}