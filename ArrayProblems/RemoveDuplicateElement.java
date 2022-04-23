package ArrayProblems;

public class RemoveDuplicateElement {

    // TC : 0(n), SC : O(1)
    static int removeDuplicate(int arr[]) {
        int j = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4};
        int c = removeDuplicate(arr);
        for(int i =0; i < c; i++) {
            System.out.println(arr[i]);
        }
    }
}
