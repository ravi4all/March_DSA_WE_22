package Stack;

class Stack {
    int arr[];
    int capacity;
    int top;

    public Stack(int capacity) {
        top = -1;
        this.capacity = capacity;
        arr = new int[capacity];
    }

    int getSize() {
        return top+1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int element) {
        if(getSize() == capacity-1) {
            throw new RuntimeException("Stack is full...");
        }
        top++;
        arr[top] = element;
    }

    int pop() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is Empty...");
        }
        int element = arr[top];
        arr[top--] = 0;
        return element;
    }

    int peek() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is Empty...");
        }
        return arr[top];
    }

    void print() {
        for(int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println();
    }

}

public class P2_StackOperations {
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(4);
        st.push(14);
        st.push(40);
        st.push(12);

        st.print();

        System.out.println(st.pop());
    }
}
