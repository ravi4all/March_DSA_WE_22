package LinkedList;

public class MergeSortedLinkedList {
    ListNode tail;
    void mergeList(ListNode start1, ListNode start2) {
        ListNode third, temp;
        if(start1 == null) {
            print(start2);
            return;
        }
        if(start2 == null) {
            print(start1);
            return;
        }

        if(start1.data <= start2.data) {
            third = start1;
            start1 = start1.next;
        }
        else {
            third = start2;
            start2 = start2.next;
        }
        temp = third;
        while(start1 != null && start2 != null) {
            if(start1.data <= start2.data) {
                temp.next = start1;
                temp = temp.next;
                start1 = start1.next;
            }
            else {
                temp.next = start2;
                temp = temp.next;
                start2 = start2.next;
            }
        }
        temp.next = start1 != null ? start1 : start2;
        System.out.println("After Merge..");
        print(third);
    }

    void print(ListNode node) {

    }
}
