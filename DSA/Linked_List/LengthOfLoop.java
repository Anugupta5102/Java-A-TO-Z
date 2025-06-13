package DSA.Linked_List;
//O(N)-tc, O(1)-sc
import DSA.Linked_List.singleLL.Node;;
public class LengthOfLoop {
    public static int loop(Node head){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                return findLength(slow,fast);
            }
        }
        return 0; //no loop
    }
    public static int findLength(Node slow,Node fast){
        int cnt=1;
        fast=fast.next;
        while(slow != fast){
            cnt++;
            fast=fast.next;
        }
        return cnt;

    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next=head.next; //5-->2 loop

        int length=loop(head);
        if (length > 0) {
            System.out.println("Length of the loop: " + length);
        } else {
            System.out.println("No loop found in the linked list.");
        }

    }
}
