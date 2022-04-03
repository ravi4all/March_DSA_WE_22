package WarmUpProblems;

public class BuySellStock {

    // TC:O(n^2)
    // static void approach_1() {
    //     int arr[] = {5,4,11,5,6,8,1,9};
    //     int first = 0;
    //     int last = 0;
    //     int max = Integer.MIN_VALUE;
    //     for(int i = 0; i < arr.length; i++) {
    //         for(int j=i+1; j<arr.length; j++) {
    //             if(max < (arr[j] - arr[i])) {
    //                 max = arr[j] - arr[i];
    //                 first = arr[i];
    //                 last = arr[j];
    //             }
    //         }
    //     }
    //     System.out.println(first + ", " + last);
    // }

    // TC:O(n) SC:O(n)
    static void approach_2() {
        int arr[] = {5,4,11,5,6,8,1,9};
        int profit = 0;
        int finalProfit = 0;
        // Extra Space
        int prefixMin[] = new int[arr.length];
        prefixMin[0] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            prefixMin[i] = Math.min(prefixMin[i-1], arr[i]);
        }

        for(int i = 1; i < arr.length; i++) {
            finalProfit = arr[i] - prefixMin[i];
            profit = Math.max(finalProfit, profit);
        }
        
    }

    // TC:O(n) SC:O(1)
    static void approach_3() {
        int arr[] = {5,4,11,5,6,8,1,9};
        int min = arr[0];
        int finalProfit = 0;
        int profit = 0;
        for(int i = 1; i < arr.length; i++) {
            finalProfit = arr[i] - min;
            profit = Math.max(finalProfit, profit);
            min = Math.min(min, arr[i]);
        }
        System.out.println("Profit is :"+profit);
    }

    public static void main(String[] args) {
        approach_3();
    }
}
