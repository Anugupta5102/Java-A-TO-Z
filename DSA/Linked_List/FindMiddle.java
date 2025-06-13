package DSA.Linked_List;
import DSA.Linked_List.singleLL.Node;
public class FindMiddle {
    /* slow-1 step
     * fast-2 step
     * in case of odd len---> fast reaches end
     * in case of even len---> fast reaches null
     */
    public static Node middle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);


        Node mid=middle(head1);
        System.out.println("Middle element: "+mid.data);
    }
}
