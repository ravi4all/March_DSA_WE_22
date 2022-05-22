package Array2D;

public class P1_ToePlitzMatrix {

    static boolean isToePlitz(int [][]arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr[i].length - 1; j++) {
                if(arr[i][j] != arr[i+1][j+1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4}, {5,1,2,3}, {9,5,1,2}};
        System.out.println(isToePlitz(arr));
    }
}
