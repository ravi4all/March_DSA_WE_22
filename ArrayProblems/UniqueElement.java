package ArrayProblems;

import java.util.Arrays;

public class UniqueElement {

    static void approach_1(int arr[]) {
        Arrays.sort(arr);
        int hash[] = new int[100];
        for(int i = 0; i < arr.length; i++) {
            hash[arr[i]] = ++hash[arr[i]];
        }
        for(int i = 0; i < hash.length; i++) {
            if(hash[i] == 1) {
                System.out.println("Unique Element is : " + i);
                break;
            }
        }
    }

    static void approach_2(int []arr) {
        int ans = 0;
        for(int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int arr[] = {2,3,1,4,5,4,3,1,2};
        // approach_1(arr);
        approach_2(arr);
    }
}
