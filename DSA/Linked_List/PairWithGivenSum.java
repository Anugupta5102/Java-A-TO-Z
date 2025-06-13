package DSA.Linked_List;
//O(n)-tc
import java.util.ArrayList;
//same as array
/* value < sum--->l++
 * value > sum--->r--
 * value == sum--->return l,r
 */
public class PairWithGivenSum {
    /*find pair with given sum in doubly ll */
    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    public static ArrayList<String> pairSum(Node head,int sum){
        ArrayList<String> ans=new ArrayList<>();
        Node left=head; //start node
        Node right=head;

        //find tail of dll
        while(right.next != null){
            right=right.next;
        }

        while(left != right && left.data < right.data){

          if((left.data + right.data) < sum){
            left=left.next; //l++
          }
          else if((left.data + right.data) > sum){
            right=right.prev; //r--
          }
          else{ // l+r == sum
            ans.add("("+left.data+","+right.data+")");
            left=left.next; //l++
            right=right.prev; //r--
          }
    }
    return ans;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        Node second=new Node(2);
        Node third = new Node(4);
        Node fourth = new Node(5);
        Node fifth = new Node(6);
        Node sixth = new Node(8);
        Node seventh = new Node(9);

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
        sixth.next = seventh;
        seventh.prev = sixth;

        // Find pairs with the given sum
        int sum = 10;
        ArrayList<String> result = pairSum(head, sum);
        System.out.println("Pairs with sum " + sum + ": " + result);
    }
}
