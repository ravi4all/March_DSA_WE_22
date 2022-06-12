package Stack;

import java.util.HashMap;
import java.util.Stack;

public class P3_ValidParantheses {

    boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        for(int i = 0; i < s.length(); i++) {
            if((s.charAt(i) == ']' || s.charAt(i) == '}' || s.charAt(i) == ')') && st.isEmpty()) {
                return false;
            }
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            }
            else {
                Character currentBracket = st.pop();
                currentBracket = map.get(currentBracket);
                if(currentBracket != s.charAt(i)) {
                    System.out.println("Invalid Bracket...");
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
    }    
}
