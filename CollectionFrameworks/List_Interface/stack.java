package CollectionFrameworks.List_Interface;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.search(2));
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }
    }
}
