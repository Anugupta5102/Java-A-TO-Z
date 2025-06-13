package DSA.Linked_List;
public class AddDeleteReverse {
    Node head;
    private int size;

    AddDeleteReverse(){
        this.size=0;

    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add at start
    public void addFirst(String data){
        Node newNode= new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //add at end
    public void addLast(String data){
        Node newNode= new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode=currNode.next;
            
        }
         currNode.next=newNode;

    }
    //print
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }       
        System.out.println("NULL");
    }
    //delete first
    public void delFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    //delete last
    public void delLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secLast=head;
        Node last=head.next;
        while(last.next!= null){
            last=last.next;
            secLast=secLast.next;
        }
        secLast.next=null;
    }
    //size
    public int getSize(){
        return size;

    }
    //reverse the ll using iteration--->O(N)=TC, O(1)=SC
    public void reverse(){// P->C->N
        if(head==null || head.next==null){
            return;
        }
        Node prev=null;
        Node currNode=head;
        while (currNode !=null) {
            currNode.next=prev;//P<-C
            Node front=currNode.next;
            //update
            prev =currNode;
            currNode=front;
        }
        head=prev;
        head.next=null;
    }
    //recursive reverse
    public Node reverseRecursive(Node head){
        //head.next.next=head;---------2 . 3 . next=>2 
        //head.next=null
        //return newnode
        if(head==null || head.next==null){
            return head;
        }
        Node newHead= reverseRecursive(head.next);
       // head.next.next=head;
        Node front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }    
    public static void main(String[] args) {
        AddDeleteReverse ll=new AddDeleteReverse();
        ll.addFirst("is");
        ll.addFirst("this");
        ll.printList();
        ll.addLast("list!");
        ll.printList();
        ll.delFirst();
        ll.printList();
        ll.delLast();
        ll.printList();
        ll.getSize();
        ll.addFirst("it");
        ll.addLast("linked list");
        ll.printList();
        ll.reverse();
        ll.printList();
        ll.addFirst("d");
        ll.addFirst("c");
        ll.addFirst("b");
        ll.addFirst("a");
        ll.head=ll.reverseRecursive(ll.head);
        ll.printList();


    }
}
