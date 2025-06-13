package DSA.Linked_List;
import DSA.Linked_List.singleLL.Node;
/*O(n+m)-tc, O(1)-sc */
public class MergeTwoSortedLL {
    // Function to merge two sorted linked lists
    public static Node mergeTwoLists(Node l1, Node l2) {
        // Create a dummy node to act as the head of the merged list
        Node dummy = new Node(0);
        Node tail = dummy;

        // Traverse both lists
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                tail.next = l1;  // Append l1's node to the result
                l1 = l1.next;    // Move l1 forward
            } else {
                tail.next = l2;  // Append l2's node to the result
                l2 = l2.next;    // Move l2 forward
            }
            tail = tail.next;  // Move the tail forward
        }

        // If there are remaining nodes in l1 or l2, append them
        if (l1 != null) {
            tail.next = l1;
        } else if (l2 != null) {
            tail.next = l2;
        }

        // Return the merged list, skipping the dummy node
        return dummy.next;
    }

    // Utility method to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test the merge functionality
    public static void main(String[] args) {
        // Create first sorted linked list: 1 -> 3 -> 5 -> null
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        // Create second sorted linked list: 2 -> 4 -> 6 -> null
        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);

        System.out.println("List 1:");
        printList(l1);

        System.out.println("List 2:");
        printList(l2);

        // Merge the two sorted lists
        Node mergedList = mergeTwoLists(l1, l2);

        System.out.println("\nMerged Sorted List:");
        printList(mergedList);
    }
}
