package CollectionFrameworks.List_Interface;
import java.util.LinkedList;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        //add=>O(1)
        ll.add(10);
        ll.add(20);
        ll.addFirst(30);
        ll.add(40);//add at last
        ll.addLast(100);
        System.out.println(ll);
        //delete
        ll.remove(0);
        System.out.println(ll);
        //size
        System.out.println(ll.size());
        //print
for(int i=0;i<ll.size();i++){
    System.out.print(ll.get(i)+ "->");
}
System.out.println("null");
    }
}
