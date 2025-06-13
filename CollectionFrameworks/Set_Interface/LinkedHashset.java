package CollectionFrameworks.Set_Interface;
import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashset {
    public static void main(String[] args) {
        Set<Integer> s=new LinkedHashSet<>();
        //ordered set
        s.add(10);
        s.add(90);
        s.add(25);
        s.add(100);
        System.out.println(s);
        s.add(100);
        s.remove(90);
        System.out.println(s.size());
        System.out.println(s.contains(100));
        System.out.println(s);
        
    }
}
