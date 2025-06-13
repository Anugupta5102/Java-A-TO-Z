package DSA.Stack;

import java.util.Stack;

public class PrefixToPostFix {
    /* start from last
     * if letter,push
     * if operator, pop last 2, add  top1+ top2 + operator
     */
    public static String preToPost(String prefix){
        Stack<String> s=new Stack<>();

        for(int i=prefix.length()-1;i>=0;i--){
            char ch=prefix.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                s.push(String.valueOf(ch));
            }
            else{
                String op1=s.pop();
                String op2=s.pop();

                String exp=op1 + op2 + ch;

                s.push(exp);
            }
        }
        return s.pop();
    }
    public static void main(String[] args) {
        // Test cases
        String prefix1 = "+A*BC";
        String prefix2 = "*+AB-CD";
        String prefix3 = "-+A*BCD";

        System.out.println("Postfix of " + prefix1 + " is " + preToPost(prefix1));
        System.out.println("Postfix of " + prefix2 + " is " + preToPost(prefix2));
        System.out.println("Postfix of " + prefix3 + " is " + preToPost(prefix3));
    }
    
}
