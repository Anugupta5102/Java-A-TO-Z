package DSA.Linked_List;

import java.util.Scanner;


public class DoublyLL {
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.prev=null;
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;
    public  void create(){
        Scanner sc=new Scanner(System.in);
        int n;
        do{
        System.out.println("Enter data");
        int data=sc.nextInt();
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            tail=newNode;
        }
        else{
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
        }
        System.out.println("To continue press 1:");
        n=sc.nextInt();
    }
    while(n==1);
    }
    public void traverse(){
        Node temp=head;
        if(head==null){
            System.out.println("empty");
        }
        else{
            while (temp != null) {
                System.out.print(temp.data + " ->");
                temp=temp.next;
            }
            System.out.print("null");
        }
    }
    public static void main(String[] args) {
        DoublyLL obj=new DoublyLL();
        obj.create();
        obj.traverse();
        
    }
}
