package CollectionFrameworks.Set_Interface;
import java.util.HashSet;
import java.util.Iterator;
public class hashSet {
    public static void main(String[] args) {
        //hashset contains unique element , unordered set
        //time saving in search
        //HashSet,HashMap,HashTable,Linked HashMap
        //Hash collision techniques=> open addressing, closed addressing, chaining method
        HashSet<Integer> hs= new HashSet<>(6, 0.5f);
        //unordered set
        hs.add(2);
        hs.add(10);
        hs.add(8);
        hs.add(90);
        hs.add(2);
        hs.remove(2);
        System.out.println(hs.size());
        System.out.println(hs);
        System.out.println(hs.contains(100));
        //iterater------>
        Iterator it=hs.iterator();
        //hasNext, next-->functions
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
