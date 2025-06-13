package DSA.Linked_List;
import DSA.Linked_List.singleLL.Node;
/* Given k, rotate single LL k times
 * if len % k == 0, LL rotate back to original
 * last k nodes come at first and rest shift right by one
 * O(n)-tc, O(1)-sc
 */
public class RotateLL {
    public static Node rotateRight(Node head,int k){
        if(head == null || k == 0) return head;
        Node tail=head;
        int len=1;
        while(tail.next != null){
            tail = tail.next;
            len++;
        }
        k=k % len;
        if(k == 0) return head;

        tail.next=head;
        
        Node newTail = head;
        for (int i = 1; i < len - k; i++) {
            newTail = newTail.next;
        }

        // Break the circular linked list
        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test the rotation
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        printList(head);

        // Rotate the list k times
        int k = 2;
        head = rotateRight(head, k);

        System.out.println("\nLinked List after rotating by " + k + " positions:");
        printList(head);
    }
}
    

