package ArrayProblems;
public class RotateArray {
    public static void main(String[] args) {
        int arr [] = {5,0,1,4,2};
		int k = 3; // k unit of rotation
		// logic for k unit of loop
		for(int j = 1; j<=k ; j++) {
		// Logic for 1 Unit of Rotation
			int lastElement = arr[arr.length-1]; // bring the last element of the array
		    for(int i = arr.length-2; i>=0; i--) {
			    // Shifting the ith element to the i+1 location
			    arr[i+1] = arr[i];
		    }
		    arr[0] = lastElement; // Placing the last element on the first place
		}
		System.out.println("After Rotation ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
    }
}