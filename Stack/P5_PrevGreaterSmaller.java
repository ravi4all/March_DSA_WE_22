package Stack;

import java.util.Stack;

public class P5_PrevGreaterSmaller {
    static void prevGreater(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        System.out.print(-1 + ",");
        
        for(int i = 1; i < n; i++) {
            while(!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            int greater = (st.empty()) ? -1 : st.peek();
            System.out.println(greater + ",");
            st.push(arr[i]);
        }
    }
}
