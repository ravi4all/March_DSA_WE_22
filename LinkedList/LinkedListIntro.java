package LinkedList;

class NodeLL {
    int data;
    NodeLL next;
    public NodeLL(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListIntro {
    public static void main(String[] args) {
        NodeLL n1 = new NodeLL(100);
        NodeLL n2 = new NodeLL(200);
        NodeLL n3 = new NodeLL(300);

        n1.next = n2;
        n2.next = n3;

        NodeLL current = n1;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
