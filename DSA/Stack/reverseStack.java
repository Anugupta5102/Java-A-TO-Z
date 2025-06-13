import java.util.Stack;
public class reverseStack {
    public static void pushAtBottomStack(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottomStack(data, s);
        s.push(top);
    }
    
    public static void reverse(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
        }
        //pop
    //reverse
    //push at bottom
        int top=s.pop();
        reverse(s);
        pushAtBottomStack(top, s);
    }
    
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        //3,2,1
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s); //1,2,3
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }



    }
}
