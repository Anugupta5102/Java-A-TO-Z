package CollectionFrameworks.Queue_Interface;
import java.util.LinkedList;
import java.util.Queue;
public class QueueLL {
    //offer----->enqueue
    //poll----->dequeue
    //peek
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println(q.peek());//front element
        System.out.println(q);
        q.poll();
        System.out.println(q);


    }
}
