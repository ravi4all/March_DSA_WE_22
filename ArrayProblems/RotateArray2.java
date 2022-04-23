package ArrayProblems;

public class RotateArray2 {
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 4, 3};
		int k = 3;
		int temp [] = new int[arr.length];
		for(int i = 0; i<arr.length; i++) {
			temp[((i+k)%arr.length)] = arr[i];
		}
		System.out.println("After Rotation ");
		for(int i : temp) {
			System.out.print(i +" ");
		}
    }
}
