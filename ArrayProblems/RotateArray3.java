package ArrayProblems;

public class RotateArray3 {

    public static void reverse(int arr[], int i, int j){
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int k = 3;
        int x = k % nums.length;
        if(x < 0) {
            x = nums.length + k;
        }
        
        reverse(nums, 0, nums.length-x-1);
        reverse(nums, nums.length-x, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }
    
}
