package DSA.Stack;
import java.util.*;
//O(N) & O(N)- TC, SC
public class ValidParenthesis {
    //valid---> {} () []
    /* closing bracket--> add
     * opening --> pop TOS
     * at end stack should be empty
     */
    public static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
          //push open brackets
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if((c == '}' && top != '{') || 
                   (c == ']' && top != '[') || 
                   (c == ')' && top != '(')){
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
    public static void main(String[] args) {
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "([)]";
        String test5 = "{[]}";

        System.out.println(isValid(test1)); // true
        System.out.println(isValid(test2)); // true
        System.out.println(isValid(test3)); // false
        System.out.println(isValid(test4)); // false
        System.out.println(isValid(test5)); // true
    }
}
