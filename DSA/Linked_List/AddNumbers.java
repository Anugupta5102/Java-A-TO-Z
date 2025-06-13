package DSA.Linked_List;
import DSA.Linked_List.singleLL.Node;
public class AddNumbers {
    /* 2 list of numbers given in reverse order 
     * add 2 list ; sum list in rev order
     * return head
     * O(max(m,n))---TC,SC
    */
    public static Node addTwoNumbers(Node l1,Node l2){
        Node dummy=new Node(-1); //create dummy pointer before head
        Node curr=dummy;
        int carry=0;

        while(l1 != null || l2 != null || carry == 1){
            int sum=0;
            if(l1 != null){
                sum=sum+l1.data;
                l1=l1.next;
            }
            if(l2 != null){
                sum=sum+l2.data;
                l2=l2.next;
            }
            sum += carry;
            carry = sum/10; // eg 7+5=12; store 2 in node and move carry frwd, store at last
           
            Node newnode=new Node(sum % 10); //this gives 1st digit
            curr.next = newnode;
            curr=curr.next;
        }
        return dummy.next; //returns head
    }
    public static void main(String[] args) {
        Node l1=new Node(9);
        l1.next=new Node(4);
        l1.next.next=new Node(3);

        Node l2= new Node(5);
        l2.next=new Node(6);
        l2.next.next=new Node(9);

        Node sum = addTwoNumbers(l1, l2);
        while(sum != null){
            System.out.print(sum.data + " ");
            sum = sum.next;
        }
    }

    
}
