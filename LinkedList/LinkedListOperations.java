package LinkedList;

class Node<T> {
    T data;
    Node<T> next;
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListOperations<T> {
    private Node<T> start;
    void insertAtEnd(Node<T> node) {
        // If linked list is empty
        if(start == null) {
            start = node;
            return;
        }

        Node<T> current = start;
        while(current.next != null) {
            current = current.next;
        }
        current.next = node;

    }

    void insertAtBeg(Node<T> node) {
        // If linked list is empty
        if(start == null) {
            start = node;
            return;
        }
        node.next = start;
        start = node;

    }

    void insertAtMid(Node<T> node, int pos) {
        // If linked list is empty
        if(start == null) {
            start = node;
            return;
        }

        if(pos == 0) {
            node.next = start;
            start = node;
            return;
        }

        if(pos > 0) {
            int i = 1;
            Node<T> temp = start;
            while(i < pos) {
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
        }

    }

    void deleteInMid(int pos) {
        Node<T> temp = null;
        if(start == null) {
            System.out.println("Linked list is empty...");
            return;
        }

        if(pos == 0) {
            temp = start.next;
            start = temp;
            return;
        }

        temp = start;
        int i = 1;
        while(i < pos) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;

    }

    void reverseIterate() {

    }

    void midPoint() {

    }

    void detectLoop() {
        
    }

    void print() {
        Node<T> current = start;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        // Node<String> node = new Node("Hello");
        LinkedListOperations<Integer> crud = new LinkedListOperations<>();
        crud.insertAtBeg(new Node<Integer>(10));
        crud.insertAtBeg(new Node<Integer>(14));
        crud.insertAtBeg(new Node<Integer>(18));
        crud.insertAtBeg(new Node<Integer>(20));
        crud.insertAtEnd(new Node<Integer>(25));
        crud.insertAtEnd(new Node<Integer>(50));
        crud.insertAtMid(new Node<Integer>(100), 3);

        crud.print();

    }
}
