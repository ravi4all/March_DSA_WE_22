package ArrayProblems;

import java.util.Arrays;
import java.util.HashMap;

public class PairSum {

    static void approach_1(int []arr, int k) {
        int sum = 0;
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if(sum == k) {
                    System.out.println("Pair is " + arr[i] + "," + arr[j]);
                    return;
                }
            }
        }
    }

    // TC : 0(n), SC:O(n)
    static void approach_2(int []arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element : arr) {
            if(map.get(element) == null) {
                map.put(k-element, element);
            }
            else {
                System.out.println("Pair Sum : " + map.get(element) + " " + element);
            }
        }
    }
    
    static void approach_3(int arr[], int k) {
        Arrays.sort(arr);
        int first = 0;
        int last = arr.length - 1;

        while(first < last) {
            if(arr[first] + arr[last] == k) {
                System.out.println("Pair Found " + arr[first] + "," + arr[last]);
                return;
            }

            if(arr[first] + arr[last] < k) {
                first++;
            }
            else if(arr[first] + arr[last] > k) {
                last--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,9,6,3,1,10,4};
        int k = 9;
        approach_1(arr, k);
        approach_2(arr, k);
    }
}
