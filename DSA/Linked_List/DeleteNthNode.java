package DSA.Linked_List;

//creating a node
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

    public class DeleteNthNode {
    Node head;
    //remove nth node from end
 /* 
    public Node removeNthFromEnd(Node head, int n){ //O(2N) ~ O(N)= tc, O(1)=sc
        if(head.next == null){
            return null;
        }
        //size
        int size=0;
        Node curr=head;
        while(curr!=null){
            curr=curr.next;
            size++;
        }

        if(n == size){
            return head.next;
        }

        int index=size-n;//nth node se ek pehla wala node----eg 1,2,3,4,5 ; if n=2(data=4) then index=5-2=3(data=3)
        Node prev=head;
        int i=1;
        while (i<index) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
*/

//2 pointer
    public  Node removeNthFromEnd(Node head, int n){ //O(N)-tc, O(1)=sc
        Node fast=head;
        Node slow=head; //points to prev node of nth node

        for(int i=0;i<n;i++){
            fast=fast.next; //fast move 'n' steps ahead
            if( fast == null){ 
                return head.next; //if n = length of list
            }
        }
        //then move both together
        while (fast.next != null) {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next; //remove link
        return head;
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
        DeleteNthNode list = new DeleteNthNode();

        // Creating the linked list: 1 -> 2 -> 3 -> 4 -> 5
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);


        System.out.println("Original List:");
        list.printList(list.head);

        int n = 2;
        list.head = list.removeNthFromEnd(list.head, n);

        System.out.println("List after removing " + n + "th node from end:");
        list.printList(list.head);
    }
}
