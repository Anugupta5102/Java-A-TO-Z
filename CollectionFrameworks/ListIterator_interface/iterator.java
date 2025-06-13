package CollectionFrameworks.ListIterator_interface;
import java.util.ArrayList;
import java.util.ListIterator;
public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<>();
        //add=>O(n)
        ar.add(5);
        ar.add(55);
        ar.add(25);
        ar.add(50);
        ar.add(20);
        ar.add(60);

        System.out.println(ar);
        //get
        System.out.println(ar.get(2));
        //set
        ar.set(3, 10);
        System.out.println(ar);
       
        //forward traverse arraylist
        System.out.println("---------------------------");
        ListIterator<Integer> it=ar.listIterator(); 
        while (it.hasNext()) {
            System.out.print(it.next() +" ");
        }
        System.out.println();
        //backward
        System.out.println("-----------------------------");
        while (it.hasPrevious()) {
            System.out.print(it.previous() +" ");
            
        }
    }
}
