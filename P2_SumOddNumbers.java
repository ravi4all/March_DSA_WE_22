public class P2_SumOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int n = 5;
        if(n % 2 == 0) {
            return;
        }

        for(int i = 1; i <= 5; i++) {
            sum += i;
        }
    }
}