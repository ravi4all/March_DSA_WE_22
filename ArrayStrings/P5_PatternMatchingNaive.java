package ArrayStrings;

public class P5_PatternMatchingNaive {
    static void patternMatch(String str, String pattern) {
        for(int i = 0; i < str.length(); i++) {
            int j;
            for(j = 0; j < pattern.length(); j++){
                if(pattern.charAt(j) != str.charAt(i + j)) {
                    break;
                }
            }
            if(j == pattern.length()) {
                System.out.println("Pattern Found at : " + i);
            }
        }
        // System.out.println("No Pattern Found...");
    }
    public static void main(String[] args) {
        String str = "ABCDABCD";
        String pat = "ABC";
        patternMatch(str, pat);
    }
}
