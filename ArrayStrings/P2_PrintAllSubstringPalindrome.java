package ArrayStrings;

public class P2_PrintAllSubstringPalindrome {
    static boolean isPalindrome(String str) {
        int begin = 0;
        int end = str.length() - 1;
        while(begin < end) {
            if(str.charAt(begin) != str.charAt(end)) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }

    static void solution(String str) {
        for(int i = 0; i < str.length(); i++) {
            for(int j = i+1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                if(isPalindrome(str)) {
                    System.out.println(sub);
                }
            }
        }
    }
}
