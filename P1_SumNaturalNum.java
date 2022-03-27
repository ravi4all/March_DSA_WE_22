public class P1_SumNaturalNum {

    // Approach 1
    static int func_1(int n) {
        return n * (n + 1) / 2;
    }

    // Approach 2
    static int func_2(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += 1;
        }
        return sum;
    }

    // Approach 3
    static int func_3(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        
    }
}