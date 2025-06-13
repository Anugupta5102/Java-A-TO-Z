package CollectionFrameworks.List_Interface;
import java.util.ArrayList;
import java.util.Collections;//sort
public class arrlist {
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
        //remove
        ar.remove(2);
        System.out.println(ar);
        //size
        System.out.println(ar.size());
        //loop
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
        //sort
        Collections.sort(ar);
        System.out.println(ar);


    }
}
