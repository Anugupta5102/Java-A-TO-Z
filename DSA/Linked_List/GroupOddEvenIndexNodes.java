package DSA.Linked_List;
import DSA.Linked_List.singleLL.Node;
public class GroupOddEvenIndexNodes {
    /* grp odd index nodes and even separately
     * return head
     * O(N)-tc, O(1)-sc
     */
    public static Node oddeven(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node odd=head;//1st node is node
        Node even=head.next;//2nd is even
        Node evenHead=head.next;

        while(even != null && even.next != null){
            odd.next = odd.next.next; // move to next odd index
            even.next=even.next.next; // move to next even

            //update
            odd=odd.next;
            even=even.next;
        }
        //add odd to the even at last
        odd.next=evenHead;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = oddeven(head);

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
}
