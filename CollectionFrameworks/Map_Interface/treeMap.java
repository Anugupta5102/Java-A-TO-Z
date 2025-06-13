package CollectionFrameworks.Map_Interface;
import java.util.Map;
import java.util.TreeMap;
public class treeMap {
    public static void main(String[] args) {
        //tree + BST-----> sorted order of keys
        Map<Integer, Integer> mp=new TreeMap<>();
        mp.put(1, 10);
        mp.put(5, 1);
        mp.put(2, 24);
        mp.put(17, 3);
        System.out.println(mp);
        System.out.println(mp.keySet());
        System.out.println(mp.replace(17, 3, 35));
        System.out.println(mp.entrySet());

    }
}
