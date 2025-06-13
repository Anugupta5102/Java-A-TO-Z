package DSA.Queue;
 class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class QueueUsingLL {
    Node f=null;
    Node r=null;
    public void enqueue(int data){//O(1)
       // System.out.println("Enter data");
        Node newNode=new Node(data);
        if(f==null){
            f=newNode;
            r=newNode;
        }
        else{
            r.next=newNode;
            r=newNode;
        }
    }
    public void dequeue(){//O(1)
        if(f==null){
            System.out.println("Empty");
        }
        else{
            f=f.next;
        }

    }
    public void display(){
        Node temp=f;
        while(temp != null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.print("NULL");
        System.out.println();
        
    }

    public static void main(String[] args) {
       QueueUsingLL obj=new QueueUsingLL();
       obj.enqueue(10);
       obj.enqueue(20);
       obj.enqueue(30);
       obj.enqueue(40);
       obj.display();
       obj.dequeue();
       obj.display();
        
    }
}
