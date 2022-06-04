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

    void midPoint() {
        Node<T> slow, fast;
        if(start != null) {
            slow = fast = start;
            while(fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println("Mid Point is : " + slow.data);
        }
    }

    void findNthFromEnd(int n) {
        Node<T> p, q;
        p = q = start;
        for(int i = 1; i <= n; i++) {
            q = q.next;
        }
        while(q != null) {
            q = q.next;
            p = p.next;
        }
        System.out.println(n + " element from end is : " + p.data);
    }

    void detectLoop() {
        Node<T> slow = start;
        Node<T> fast = start;
        if(start != null) {
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast) {
                    System.out.println("Loop present...");
                    return;
                }
            }
            System.out.println("No Loop Detected...");
        }
    }

    void reverseIterate() {
        if(start == null) {
            System.out.println("List is empty...");
            return;
        }
        if(start.next == null) {
            System.out.println("List contains only one node...");
        }

        Node<T> currentNode = start;    // n1
        Node<T> prevNode = null;

        while(currentNode != null) {
            Node<T> nextNode = currentNode.next;    // n2
            currentNode.next = prevNode;    // start.next = null
            prevNode = currentNode;     // prevNode = start
            currentNode = nextNode;     // currentNode = n2
        }
        start = prevNode;
    }

    Node<T> reverseIterateRec(Node<T> currentNode, Node<T> prevNode) {
        if(currentNode == null) {
            return prevNode;
        }
        Node<T> nextNode = currentNode.next;
        currentNode.next = prevNode;
        return reverseIterateRec(nextNode, currentNode);
    }

    boolean palindrome() {
        Node<T> prev = null;
        Node<T> slow, fast;
        slow = fast = start;
        Node<T> midNode = null;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            prev =  slow;   // just before one node to middle node
            slow = slow.next;
        }
        if(fast != null) {
            midNode = slow;
            slow = slow.next;   // now slow is on second half
        }
        Node<T> secondHalf = slow;
        prev.next = null;
        secondHalf = reverseIterateRec(secondHalf, null);
        boolean result = compare(start, secondHalf);

        // connecting back to original linked list
        secondHalf = reverseIterateRec(secondHalf, null);
        if(midNode != null) {
            prev.next = midNode;
            midNode.next = secondHalf;
        }
        return result;
    }

    boolean compare(Node<T> a, Node<T> b) {
        while(a != null && b!= null) {
            if(a.data == b.data) {
                a = a.next;
                b = b.next;
            }
            else {
                return false;
            }
        }
        return true;
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
        // crud.insertAtBeg(new Node<Integer>(18));
        crud.insertAtBeg(new Node<Integer>(20));
        crud.insertAtEnd(new Node<Integer>(25));
        crud.insertAtEnd(new Node<Integer>(50));
        crud.insertAtMid(new Node<Integer>(100), 3);
        
        crud.print();

        crud.midPoint();
        crud.findNthFromEnd(3);

    }
}
