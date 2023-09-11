package Others;

//Given an integer, return the number of steps to reduce it to zero.
//Note: In one step, if the current number is even, it has to be divided by zero. Otherwise, subtract 1 and then divide it.
public class NoofSteps {
    static int count(int n, int steps) {
        if (n == 0) {
            if (steps != 0) {
                steps--;
            }
            return steps;
        }

        if (n % 2 != 0) {
            n -= 1;
            steps++;
        }
        return count(n / 2, steps + 1);
    }

    public static void main(String[] args) {
        System.out.println(count(123, 0));
    }
}