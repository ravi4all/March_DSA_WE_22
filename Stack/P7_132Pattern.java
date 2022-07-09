package Stack;

public class P7_132Pattern {
    boolean findPatternApproach_1(int []arr) {
        for(int i = 0; i < arr.length - 2; i++) {
            for(int j = i+1; j < arr.length - 1; j++) {
                for(int k = j+1; k < arr.length; k++) {
                    if(arr[k] > arr[i] && arr[j] > arr[k]) {
                        return true;
                    }
                }
            }   
        }
        return false;
    }

    boolean findPatternApproach_2(int []arr) {
        int min = arr[0];
        for(int j = 1; j < arr.length - 1; j++) {
            min = Math.min(min, arr[j]);
            if(min == arr[j]) {
                continue;
            }
            for(int k = j+1; k < arr.length; k++) {
                if(arr[k] > arr[j] && min < arr[k]) {
                    return true;
                }
            }
        }
        return false;
    }
}
