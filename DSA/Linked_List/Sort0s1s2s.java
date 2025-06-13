package DSA.Linked_List;

public class Sort0s1s2s {
    public static Node sortLL(Node head){
        if(head == null || head.next == null){
            return head;
        }
        //dummy pointers
        Node zeroHead=new Node(-1);
        Node oneHead=new Node(-1);
        Node twoHead=new Node(-1);

        //pointers for traversing
        Node zero=zeroHead;
        Node one=oneHead;
        Node two=twoHead;

        //seggregate nodes
        Node temp=head;
        while (temp != null) {
            if(temp.data == 0){
                zero.next=temp;
                zero=temp;
            }
            else if(temp.data == 1){
                one.next=temp;
                one=temp;
            }
            //(temp.data == 2)
            else{
                two.next=temp;
                two=temp;
            }
            temp=temp.next;
        }

        //connect all three lists
        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next; // 0->1
        one.next = twoHead.next;// 1->2
        two.next = null;//2->null

        return zeroHead.next; //starting head 

    } 
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(0);

        head = sortLL(head);
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
    
