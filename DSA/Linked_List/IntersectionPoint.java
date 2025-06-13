package DSA.Linked_List;
import DSA.Linked_List.singleLL.Node;
public class IntersectionPoint {
    /* t1=head1; t2=head2
     * if t1 reaches end move it to head2
     * if t2 reaches end move it to head1
     * both t1,t2 reaches end at same time, then no intersection point
     */
    //O(n1+n2)-tc, O(1)-sc
    public static Node collide(Node head1, Node head2){
        if(head1 == null || head2 == null ){
            return null;
        }
        Node t1=head1;
        Node t2=head2;
        while(t1 != t2){
            t1=t1.next;
            t2=t2.next;

            if(t1 == t2){
                return t1; //or t2
            }
            //align starting points  vertically
            if(t1 == null){
                t1=head2;
            }
            if(t2 == null){
                t2=head1;
            }
        }
        return t1;
    }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        Node head2 = new Node(9);
        head2.next = new Node(8);
        head2.next.next = head1.next.next; // Intersection at node with value 3

        Node intersection = collide(head1, head2);
        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.data);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
