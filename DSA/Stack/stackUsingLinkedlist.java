class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class stackUsingLinkedlist {
    Node head;
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
    //push ie add-----O(1)
    public void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head= newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //pop------O(1)
    public int pop(){
        if (isEmpty()) {
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }
    //peek ie TOS--------O(1)
    public int peek(){
        if (isEmpty()) {
            return -1;
            
        }
        return head.data;
    }
    public static void main(String[] args) {
        stackUsingLinkedlist s=new stackUsingLinkedlist();
        //40<30<20<10
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        while (!s.isEmpty()) {
            System.out.println(s.peek());//40,30,20,10
            s.pop();
            
        }
    }
}

