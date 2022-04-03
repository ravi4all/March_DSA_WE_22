package MathProblems;

public class P2_GCD {

    // static int gcd(int a, int b) {
    //     int res = Math.min(a, b);
    //     while(res > 0) {
    //         if(a % res == 0 && b % res == 0) {
    //             break;
    //         }
    //         res--;
    //     }
    //     return res;
    // }

    static int gcd_2(int a, int b) {
        if(b == 0) {
            return a;
        }
        else {
            return gcd_2(b, a % b);
        }
    }

    public static void main(String[] args) {
        int n1 = 42;
        int n2 = 56;
        // System.out.println(gcd(n1, n2));   
        System.out.println(gcd_2(n1, n2));
    }
}
