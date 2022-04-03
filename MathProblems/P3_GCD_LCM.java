package MathProblems;

public class P3_GCD_LCM {
    public static void main(String[] args) {
        int n1 = 42;
        int n2 = 56;
        int copy_n1 = n1;
        int copy_n2 = n2;
        while(n1 % n2 != 0) {
            int r = n1 % n2;
            n1 = n2;
            n2 = r;
        }

        int gcd = n2;
        int lcm = (copy_n1 * copy_n2) / gcd;

        System.out.println("GCD : " + gcd);
        System.out.println("LCM : " + lcm);

    }
}
