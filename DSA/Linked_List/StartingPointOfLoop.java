package DSA.Linked_List;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
//o(n)-tc
public class StartingPointOfLoop {
    
    public static Node findStartingPoint(Node head){
        Node slow=head;
        Node fast=head;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){ 
                slow= head;
                while(slow != fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;//fast
            }

        }
        return null;//no cycle
    }
    public static void main(String[] args) {
        //1->2->3->4
        //   |_____|
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next; // Create a cycle (4 -> 2)

        Node start=findStartingPoint(head);
        if(start != null){
            System.out.println("Loop exits, starting point is: "+ start.data);
        }
        else{
            System.out.println("No loop");
        }
    }
}
