package ArrayProblems;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    static int approach_1(int arr[], int n) {
        int majoritySize = n / 2;
        for(int num : arr) {
            int count = 0;
            for(int elem : arr) {
                if(num == elem) {
                    count++;
                }
            }
            if(count > majoritySize) {
                return num;
            }
        }
        return -1;
    }
    
    static Map<Integer, Integer> countElement(int arr[], int n) {
        Map<Integer, Integer> counts = new HashMap<>();
        for(int num : arr) {
            if(!counts.containsKey(num)) {
                counts.put(num, 1);
            }
            else {
                counts.put(num, counts.get(num) + 1);
            }
        }
        return counts;
    }

    static int approach_2(int []arr, int n) {
        Map<Integer, Integer> counts =  countElement(arr, n);
        Map.Entry<Integer, Integer> majority = null;
        for(Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if(majority == null || entry.getValue() > majority.getValue()) {
                majority = entry;
            }
        }
        return majority.getKey();
    }

    static void approach_3(int arr[], int n) {
        int majorityElement = 0;
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(count == 0) {
                majorityElement = arr[i];
            }

            if(majorityElement == arr[i]) {
                count++;
            }
            else {
                count--;
            }
        }
        count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == majorityElement) {
                count++;
            }
        }

        String msg = count > n/2 ? "Majorithy Element :: " + majorityElement : "No Majority Element";
        System.out.println(msg);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,2,3,4,2,6,3,2,2,2,2,2};
        int n = arr.length;
        // System.out.println(approach_1(arr, n));
        // System.out.println(approach_2(arr, n));
        approach_3(arr, n);
    }

}
