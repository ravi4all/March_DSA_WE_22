package LinkedList;

public class CloneLinkedList {
    static void print(DoublyNode start) {
        DoublyNode temp = start;
        while(temp != null) {
            System.out.print(temp.data + " :: " + temp.random.data + ",");
            temp = temp.next;
        }
    }    

    public static void main(String[] args) {
        DoublyNode start = new DoublyNode(10);
        start.next = new DoublyNode(20);
        start.next.next = new DoublyNode(30);
        start.next.next.next = new DoublyNode(40);
        start.next.next.next.next = new DoublyNode(50);

        start.random = start.next.next;
        start.next.random = start.next;
        start.next.next.random = start.next.next.next;
        start.next.next.next.random = start.next.next.next.next;
        start.next.next.next.next.random = start;

        print(start);

    }
}
