package Stack;

import java.util.Stack;

public class P6_HistogramProblem {
    // find prev smaller element
    // find next smaller element
    static int getMaxArea(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxArea = 0;

        for(int i = 0; i < n; i++) {
            while(st.peek() != -1 && arr[st.peek()] >= arr[i]) {
                int rightMost = i;
                int topElement = st.pop();
                int leftMost = st.peek();
                maxArea = Math.max(maxArea, arr[topElement] * (rightMost - leftMost - 1));
            }
            st.push(i);
        }

        while(st.peek() != -1) {
            maxArea = Math.max(maxArea, arr[st.pop()] * (n - st.peek() - 1));
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        int n = arr.length;
        int maxArea = getMaxArea(arr, n);
        System.out.println(maxArea);
    }
}
