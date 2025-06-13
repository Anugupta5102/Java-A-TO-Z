package DSA.Linked_List;

//O(n/2)~O(n)-tc, O(1)-sc
public class DeleteMiddle {
    public static Node deleteMid(Node head){
        if(head == null || head.next == null){
            return  head;
        }
        Node slow=head;
        Node fast=head;
        //skip 1 step of slow, so that it reach node before mid
        fast=fast.next.next;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next; //removing mid
        return  head;
    }

    public static void main(){
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);


        Node head=deleteMid(head1);
        System.out.println("Head after removing mid: "+head.data);
    }
    
}
