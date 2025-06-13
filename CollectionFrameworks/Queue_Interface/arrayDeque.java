package CollectionFrameworks.Queue_Interface;

import java.util.ArrayDeque;

public class arrayDeque {//double ended queue ie both side add,delete 
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.add(20);
        ad.add(30);
        ad.addFirst(40);
        ad.add(50);
        ad.addLast(100);
        ad.remove(30);
System.out.println(ad.peek());
        System.out.println(ad.getLast());
        System.out.println(ad.size());
    }
}

