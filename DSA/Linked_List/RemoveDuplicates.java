package DSA.Linked_List;

public class RemoveDuplicates {
/*remove duplicated from a sorted DLL */  
static class Node{
    int data;
    Node prev,next;

    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
    }
    public static Node removeDup(Node head){
        if(head == null) return null;
        Node temp=head;
        
    while(temp != null && temp.next != null)
    {
        Node nextNode=temp.next;
        while(nextNode != null && temp.data == nextNode.data)
        {        
            nextNode=nextNode.next;
        }
       temp.next=nextNode;
       if(nextNode != null){
       nextNode.prev=temp;
       }
       temp=temp.next;
    }
    return head; 
    }  
    public static void main(String[] args) {
        // Creating a sorted doubly linked list: 1 <-> 1 <-> 2 <-> 3 <-> 3 <-> 4
        Node head = new Node(1);
        Node second = new Node(1);
        Node third = new Node(2);
        Node fourth = new Node(3);
        Node fifth = new Node(3);
        Node sixth = new Node(4);

        // Connecting nodes
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        fourth.next = fifth;
        fifth.prev = fourth;
        fifth.next = sixth;
        sixth.prev = fifth;

        head=removeDup(head);
        System.out.println("List after removing duplicates:");

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
}
}
