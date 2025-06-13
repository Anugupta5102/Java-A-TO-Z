package DSA.Linked_List;
import DSA.Linked_List.singleLL.Node;
public class AddOneinLL {
    /*brute- reverse, +1, reverse--> O(3n)-tc, O(1)-sc 
     * optimal- recursion, backtrack--->O(n)-tc,sc
    */
    public static int helper(Node temp){
        if(temp == null){ // find end node and add 1 to LSB
            return 1;
        }
        int carry=helper(temp.next);//recursive call
        temp.data += carry;
        if(temp.data < 10){
            return 0;
        }
        temp.data=0; //set 0 if sum=10
        return 1;//frwd carry=1
        
    }
    public static Node addOne(Node head){
        int carry=helper(head);
        if(carry == 1){
            Node newNode=new Node(1);
            newNode.next=head;
            head=newNode;
        }
        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Example: Linked List 1 -> 2 -> 9 represents the number 129
        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next = new Node(9);

        System.out.print("Original List: ");
        printList(head);

        head = addOne(head);

        System.out.print("After Adding One: ");
        printList(head);  // Output: 1 -> 3 -> 0 (which represents 130)
    }
    
}
