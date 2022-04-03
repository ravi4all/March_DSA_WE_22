package MathProblems;

public class P4_PrimeNumber {

    // static boolean isPrime(int n) {
    //     if(n == 1) {
    //         return false;
    //     }

    //     for(int i = 2; i * i <= n; i++) {
    //         System.out.println(i);
    //         if(n % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        if(n == 2 || n == 3) {
            return true;
        }

        if(n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for(int i = 5; i * i <= n; i=i+6) {
            System.out.println(i);
            if(n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 10007;
        System.out.println(isPrime(num));
    }
}
