package DSA.Stack;
//TC- O(1), SC- O(n)
import java.util.Stack;

class MinStack {
    private Stack<Long> stack;
    private long min;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(0L);
            min = x;  // Initialize min to the first element
        } else {
            stack.push((long) x - min);
            if (x < min) {
                min = x;  // Update min if x is the new minimum
            }
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        long pop = stack.pop();
        if (pop < 0) {  // If popped value is negative, it indicates the minimum element
            min = min - pop;  // Update min to the previous minimum
        }
    }

    public int top() {
        long top = stack.peek();
        if (top > 0) {
            return (int) (top + min);
        } else {
            return (int) min;
        }
    }

    public int getMin() {
        return (int) min;
    }
}

public class MininimumStack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);

        System.out.println("Current Min: " + minStack.getMin()); // Should print 2
        minStack.pop();
        System.out.println("Current Min: " + minStack.getMin()); // Should print 3
        minStack.pop();
        System.out.println("Current Min: " + minStack.getMin()); // Should print 3
        minStack.pop();
        System.out.println("Current Min: " + minStack.getMin()); // Should print 5
    }
}
