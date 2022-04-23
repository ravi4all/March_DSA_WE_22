package ArrayProblems;

public class LeaderElement {
    public static void main(String[] args) {
        int arr[] = {10,12,34,23,6,4,31,6};
        int max = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] > max) {
                System.out.println("Leader : " + arr[i]);
                max = arr[i];
            }
        }
    }
}
