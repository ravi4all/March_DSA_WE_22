package ArrayProblems;

public class MissingNumber {
    public static void main(String[] args) {
        int []arr = {1,2,3,5,6,7};
        
        // Approach_1
        // int sum = 0;
        // for(int i = 0; i < arr.length; i++) {
        //     sum += arr[i];
        // }
        // int n = arr.length;
        // int total = (n+1) * (n+2) / 2;
        // int missing = total - sum;

        // Approach_2
        int x = 0;
        int y = 0;
        int min = 1;
        int max = 7;
        for(int i = 0; i < arr.length; i++) {
            x = x ^ arr[i];
        }
        for(int i = min; i <= max; i++) {
            y = y ^ i;
        }
        int missing = x ^ y;
        System.out.println("Missing Number is : " + missing);
    }
}
