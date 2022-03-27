package MathProblems;

/*
Count number of digits in a number
I/P = 1234
O/P = 4
*/

public class P1_DigitCount {

    // Approach 1
    static int approach_1(int num) {
        int count = 0;
        while(num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    // Approach 2
    static int approach_2(int num) {
        if(num == 0) {
            return 0;
        }
        return 1 + approach_2(num / 10);
    }

    // Approach 3
    static int approach_3(int n) {
        return (int) Math.floor(Math.log10(n) + 1);
    }
    public static void main(String[] args) {
        int num = 1234;
        int count = approach_1(num);
        System.out.println("Count is : " + count);
    }
}
