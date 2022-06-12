package Stack;

import java.util.Stack;

public class P1_StackWithJava {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // 3 operations of stack
        // push - append element to the end of stack
        // pop - remove element from end of stack
        // peek - return top element of stack
        stack.push("Hi");
        stack.push("Hello");
        stack.push("How are you ?");
        stack.push("Take care..");

        System.out.println(stack.peek());
        System.out.println(stack.pop());

    }   
}
