package DSA.Linked_List;

public class DeleteAllOccOfKey {
/* given doubly ll, delete all occurences of key */   
class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data=data; 
        this.prev=null;
        this.next=null;
    }
} 
public static Node deleteKey(Node head,int key){
    Node temp = head; 

    // Traverse the list and delete all occurrences of the key
    while (temp != null) {   
        if (temp.data == key) {
            // If the node to be deleted is the head
            if (temp == head) {
                head = temp.next;
                if (head != null) {
                    head.prev = null; // Update the new head's prev to null
                }
            } else {
                // Update the previous node's next pointer
                temp.prev.next = temp.next;
                // Update the next node's prev pointer, if it exists
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
            }
            
            // Move to the next node after deletion
            temp = temp.next;
        } else {
            temp = temp.next; // Move to the next node if the key doesn't match
        }
    }
    return head;
}
public static void main(String[] args) {
    DeleteAllOccOfKey list = new DeleteAllOccOfKey();
        Node head = list.new Node(10);
        head.next = list.new Node(4);
        head.next.prev = head;
        head.next.next = list.new Node(10);
        head.next.next.prev = head.next;
        head.next.next.next = list.new Node(10);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = list.new Node(6);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = list.new Node(10);
        head.next.next.next.next.next.prev = head.next.next.next.next;

        head=deleteKey(head, 10);
        System.out.println("After deleting key");
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
