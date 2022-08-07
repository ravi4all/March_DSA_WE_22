package ArrayStrings;

public class P7_KMP {
    static int lps(String str, int n) {
        for(int len = n-1; len > 0; len--) {
            boolean isMatch = true;
            for(int i = 0; i < len; i++) {
                if(str.charAt(i) != str.charAt(n - len + i)) {
                    isMatch = false;
                }
            }
            if(isMatch) {
                return len;
            }
        }
        return 0;
    }   
    public static void main(String[] args) {
        String str = "ababc";
        int lps[] = new int[str.length()];
        for(int i = 0; i < str.length(); i++) {
            lps[i] = lps(str, i+1);
            System.out.print(lps[i] + ",");
        }
    } 
}
