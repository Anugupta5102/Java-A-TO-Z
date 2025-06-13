package CollectionFrameworks.Set_Interface;
import java.util.Set;
import java.util.TreeSet;
public class Treeset {
    public static void main(String[] args) {
        Set<Integer> s=new TreeSet<>();
        //sorted order collection of set--->binary tree
        s.add(10);
        s.add(5);
        s.add(40);
        s.add(1);
        s.add(10);
        System.out.println(s);
        System.out.println(s.size());
        s.remove(1);
        System.out.println(s);

    }
}
