package DSA.Linked_List;

import java.util.Scanner;

public class CircularLL {
     static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;
    public void create(){
        int data,n;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("Enter data");
        data=sc.nextInt();
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }
        else{
            newNode.next=head;
            head=newNode;
            tail.next=head;
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
    do{
        System.out.print(temp.data + " -> ");
        temp=temp.next;
    }
    while(temp !=head);
    System.out.print("null" );
}
}
    public static void main(String[] args) {
        CircularLL obj=new CircularLL();
        obj.create();
        obj.traverse();
        
    }
}

