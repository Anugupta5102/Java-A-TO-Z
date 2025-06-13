package DSA.Stack;
import java.util.ArrayList;
class stack{
    ArrayList<Integer> ar=new ArrayList<>();
    public  boolean isEmpty(){
        if (ar.size()==0) {
            return true;
        }
        return false;
    }
    public void push(int data){
            ar.add(data);//adds at end
    }
    public int pop(){
        if (isEmpty()) {
            return -1;
        }
        int top= ar.get(ar.size()-1);//to get last element is TOS
         ar.remove(ar.size()-1);//delete TOS
         return top;
    }
    public int peek(){
        if (isEmpty()) {
            return -1;
        }
        return ar.get(ar.size()-1);//TOS

    }

}
public class stackUsingArraylist {
    public static void main(String[] args) {
        stack s=new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        while (!s.isEmpty()) {
            System.out.println(s.peek());//40,30,20,10
            s.pop();
            
        }
    }
}
