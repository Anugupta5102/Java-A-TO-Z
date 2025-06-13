package DSA.Linked_List;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class DetectRemoveCycle {
    Node head;
    //check for loop
    public boolean hasCycle(){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!= null) {
            slow=slow.next;//move one step
            fast=fast.next.next;//move double steps
            if(slow==fast){
                return true;// exits
            }
        }
            
        return false;
    }

    //remove loop
    public void removeCycle(){
        //detect
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while (fast!=null && fast.next!= null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;//exists
                break;
            }
        }
        if (cycle==false) {
            return;//no cycle
        }
        //find starting point of cycle 
        slow=head;
        Node prev=null;//last node
        while (slow != fast) {
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove
        prev.next=null; 
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
        DetectRemoveCycle l=new DetectRemoveCycle();
        //1->2->3->4
        //   |_____|
        l.head=new Node(1);
        l.head.next=new Node(2);
        l.head.next.next = new Node(3);
        l.head.next.next.next = new Node(4);
        l.head.next.next.next.next = l.head.next; // Create a cycle (4 -> 2)

        // Test hasCycle method
        if (l.hasCycle()) {
            System.out.println("It has cycle");
        } else {
            System.out.println("Does not have a cycle");
        }

        // Remove the cycle
        l.removeCycle();

        // Test hasCycle method again
        if (l.hasCycle()) {
            System.out.println("It still has a cycle");
        } else {
            System.out.println("Cycle removed");
        }

        // Print the list
        System.out.println("List after removing cycle:");
        l.printList(l.head);
    }
}


