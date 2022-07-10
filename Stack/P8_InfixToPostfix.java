package Stack;

import java.util.Stack;

public class P8_InfixToPostfix {
    /*
     * 1. scan the expression from left to right
     * 2. if scanned character is operand then print it
     * 3. but if scanned character is operator
     * 4. then follow BODMAS
     *      - if char is '(' then push it in stack
     *      - is char is ')' then pop the stack and print it until '(' encountered
     *      - In between keep on checking operators precedence
     *      - '^' operator is right associative
     *      - '+', '-', '/', '*' are left associative
     */
    static int precedence(char ch) {
        switch(ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String conversion(String exp) {
        String result = new String("");
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)) {
                result += c;
            }
            else if(c == '(') {
                stack.push(c);
            }
            else if(c == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                if(!stack.isEmpty() && stack.peek() != '(') {
                    return "Invalid Expression...";
                }
                else {
                    stack.pop();
                }
            }
            // If character is operator
            else {
                while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    if(stack.peek() == '(') {
                        return "Invalid Expression...";
                    }
                    result += stack.pop();
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()) {
            if(stack.peek() == '(') {
                return "Invalid Expression...";
            }
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String expression = "a+b-c*d*(a*d^b)-g+h";
        System.out.println(conversion(expression));
    }
}
