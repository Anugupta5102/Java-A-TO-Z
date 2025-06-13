package CollectionFrameworks.Queue_Interface;
import java.util.Comparator;
import java.util.PriorityQueue;//-------> implements min heap
import java.util.Queue;
public class Priority_Queue {
    //offer and poll
    public static void main(String[] args) {
        //Queue<Integer> q=new PriorityQueue<>();---------->min heap
        Queue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());//------->max heap

        q.offer(100);
        q.offer(20);
        q.offer(35);
        q.offer(10);
        System.out.println(q);// min heap
        q.poll();
        System.out.println(q);


    }
}
