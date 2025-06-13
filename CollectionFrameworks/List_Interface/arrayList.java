package CollectionFrameworks.List_Interface;
import java.util.ArrayList;

public class arrayList {
    // data in form of list
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();//add,remove,set
        ArrayList<Integer> l2=new ArrayList<>(5);//add,delete,sort
        l1.add(6); 
        l2.add(20);
        //l1.clear();
        l1.add(2); 
        l1.add(9); 
        l1.add(0,8); 
        l1.add(10);
        l2.add(10);
        l2.add(20);
        l1.addAll(l2);
        System.out.println(l1);
        System.out.println(l2);
        l1.remove(0);
        l1.set(3, 80);
        System.out.println(l1.contains(350));
        System.out.println(l1.indexOf(20));
        System.out.println(l1.lastIndexOf(20));
        


        for (int index = 0; index < l1.size(); index++) {
            System.out.print(l1.get(index));
            System.out.print(", ");//to get the element
            
        } 

    }
}
