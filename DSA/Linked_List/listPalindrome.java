package DSA.Linked_List;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
//O(2n)-TC, O(1)-SC
public class listPalindrome {
    //1. find middle of LL
    //2. 2nd half reverse
    //3. check 1st half and 2nd half
    Node head;
    //find middle
    public Node findMiddle(Node head){
        Node fast=head; //rabbit
        Node slow=head; //turtle
        while(fast.next!=null && fast.next.next!=null){ // reached end
            fast=fast.next.next; //jump 2 step ahead
            slow=slow.next; // jump 1 step
        }
        return slow;//mid
    }
    public Node reverse(Node head){
        //P->C->N      P<-C N
        Node prev=null;//P                         
        Node currNode=head;//C
        while (currNode!=null) {
            Node nextNode=currNode.next;//N
            currNode.next=prev;//P<-C
            prev=currNode;
            currNode=nextNode;
        }
        return prev;//new head

    }
    //check if palindrome
    public boolean isPalindrome(Node head){
        if(head==null || head.next==null){
            return true;
        }
        Node mid= findMiddle(head);// 1st half ka end 
        Node secHalfStart = reverse(mid.next);//mid.next is 2nd half ka start
        Node fHalfStart=head;

        //compare first half and second half reversed values
        while (secHalfStart != null) {
            if (fHalfStart.data != secHalfStart.data) {
                return false;
                
            }
            fHalfStart=fHalfStart.next;
            secHalfStart=secHalfStart.next;
        }
            return true;
            
        }
        //print
        public void printList(Node head) {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " -> ");
                curr = curr.next;
             }
            System.out.println("NULL");
        }

        public static void main(String[] args) {
            listPalindrome l = new listPalindrome();
    
            // Initialize the linked list
            l.head = new Node(1);
            l.head.next = new Node(2);
            l.head.next.next = new Node(3);
            l.head.next.next.next = new Node(1);
    
            System.out.println("Original list");
            l.printList(l.head);
    
            if (l.isPalindrome(l.head)) {
                System.out.println("Is Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }
        }
    }
    /*
    // Function to reverse a linked list
    // using the recursive approach
    public Node reverseLinkedList(Node head) {
        // Check if the list is empty or has only one node
        if (head == null || head.next == null) {

            // No change is needed;
            // return the current head
            return head;
        }

        // Recursive step: Reverse the remaining
        // part of the list and get the new head
        Node newHead = reverseLinkedList(head.next);

        // Store the next node in 'front'
        // to reverse the link
        Node front = head.next;

        // Update the 'next' pointer of 'front' to
        // point to the current head, effectively
        // reversing the link direction
        front.next = head;

        // Set the 'next' pointer of the
        // current head to 'null' to
        // break the original link
        head.next = null;

        // Return the new head obtained
        // from the recursion
        return newHead;
    }
    
    public static boolean isPalindrome(Node head) {
        // Check if the linked list is
        // empty or has only one node
        if (head == null || head.next == null) {
            // It's a palindrome by definition
            return true;
        }
    
        // Initialize two pointers, slow and fast,
        // to find the middle of the linked list
        Node slow = head;
        Node fast = head;
    
        // Traverse the linked list to find the
        // middle using slow and fast pointers
        while (fast.next != null && fast.next.next != null) {
            // Move slow pointer one step at a time
            slow = slow.next;
    
            // Move fast pointer two steps at a time
            fast = fast.next.next;
        }
    
        // Reverse the second half of the 
        // linked list starting from the middle
        Node newHead = reverseLinkedList(slow.next);
    
        // Pointer to the first half
        Node first = head;
    
        // Pointer to the reversed second half
        Node second = newHead;
        while (second != null) {
            // Compare data values of
            // nodes from both halves
    
            // If values do not match, the
            // list is not a palindrome
            if (first.data != second.data) {
                
                // Reverse the second half back
                // to its original state
                reverseLinkedList(newHead);
    
                // Not a palindrome
                return false;
            }
    
            // Move the first pointer
            first = first.next;
    
            // Move the second pointer
            second = second.next;
        }
    
        // Reverse the second half back
        // to its original state
        reverseLinkedList(newHead);
    
        // The linked list is a palindrome
        return true;
    }   


    // Function to print the linked list
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list with
        // values 1, 5, 2, 5, and 1 (15251, a palindrome)
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(1);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Check if the linked list is a palindrome
        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }

}


     */
