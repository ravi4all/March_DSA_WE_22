package Array2D;

public class P4_SpiralMatrix {
    static void spiral(int m, int n, int a[][]) {
        int k = 0, l = 0;
        // k - starting row index
        // m - ending row index
        // l - starting col index
        // n - ending col index

        while(k < m && l < n) {
            // first row
            for(int i = l; i < n; i++) {
                System.out.println(a[k][i]);
            }
            k++;
            
            // last col
            for(int i = k; i < m; i++) {
                System.out.println(a[i][n-1]);
            }
            n--;

            // last row
            if(k < m) {
                for(int i = n - 1; i >= l; i--) {
                    System.out.println(a[m-1][i]);
                }
                m--;
            }

            // first col
            if(l < n) {
                for(int i = m - 1; i >= k; i--) {
                    System.out.println(a[i][l]);
                }
                l++;
            }

        }

    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4,5},
                        {7,8,9,2,3},
                        {2,2,4,6,7},
                        {8,5,7,8,9}};
        int m = 4;
        int n = 5;
        spiral(m, n, arr);
    }
}
