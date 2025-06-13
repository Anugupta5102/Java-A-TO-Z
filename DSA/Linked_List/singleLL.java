package DSA.Linked_List;
import java.util.Scanner;

public class singleLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void create(){
        int data,n;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("Enter data");
        data=sc.nextInt();
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        System.out.println("Do you want to continue. If yes press:1 ");
        n=sc.nextInt();
    }
    while(n==1);
}
public void traverse(){
    Node temp=head;
    if(head==null){
        System.out.println("Empty");
    }
    else{
    while(temp !=null){
        System.out.print(temp.data + " -> ");
        temp=temp.next;
    }
    System.out.print("null");
}
}
    public static void main(String[] args) {
        singleLL obj=new singleLL();
        obj.create();
        obj.traverse();
        
    }
}
