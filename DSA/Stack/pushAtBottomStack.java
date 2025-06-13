
import java.util.Stack;
public class pushAtBottomStack {
    public static void PushBottom(int data, Stack<Integer> s){
        //stack khali kro
        //naya data push kro
        //pop elements firse push krdo
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top=s.pop();
        PushBottom(data, s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        //3,2,1
        s.push(1);
        s.push(2);
        s.push(3);
        PushBottom(4, s);//3,2,1,4
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }
    }
}