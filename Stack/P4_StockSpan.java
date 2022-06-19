package Stack;

import java.util.Stack;

public class P4_StockSpan {

    void printSpan(int arr[], int n) {
        int res[] = new int[n];
        for(int i = 0; i < n; i++) {
            // int span = 1;
            res[i] = 1;
            for(int j = i-1; j >= 0 && arr[j] <= arr[i]; j-- ) {
                // span++;
                res[i]++;
            }
            // System.out.print(span + ",");
        }
    }

    static int[] stockSpan(int price[], int n) {
        int s[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        s[0] = 1;
        for(int i = 1; i < n; i++) {
            while(!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }
            s[i] = (st.empty()) ? (i+1) : (i - st.peek());
            st.push(i);
        }

        return s;
    }

    public static void main(String[] args) {
        int price[] = {10,4,5,90,120,80};
        int n = price.length;
        int[] res = stockSpan(price, n);
        for(int i : res) {
            System.out.print(i + ",");
        }
    }    
}
