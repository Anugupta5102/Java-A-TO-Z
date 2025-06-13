package DSA.Stack;

import java.util.Stack;

//O(n)+O(n)
public class PostfixToInfix {
    /*if letter push
     * if operator, pick last 2 elements of stack, put operator in b/w and wrap it with ()
     * return top
     */
    public static String postToInfix(String postfix){
        Stack<String> s=new Stack<>();
        for(char ch : postfix.toCharArray()){
            //if letter
            if(Character.isLetterOrDigit(ch)){
                s.push(String.valueOf(ch));
            }
            //if symbol-> +,-,*,/
            else{
                String operand1=s.pop();
                String operand2=s.pop();

                String exp="(" + operand1 + ch + operand2 + ")";

                s.push(exp);
            }
        }
        return s.pop();//TOS is infix
    }
    public static void main(String[] args) {
        // Test cases
        String postfix1 = "ABC*+";
        String postfix2 = "AB+C*DE/-";
        String postfix3 = "AB+C*D+E/";
        System.out.println("Infix of " + postfix1 + " is " + postToInfix(postfix1));
        System.out.println("Infix of " + postfix2 + " is " + postToInfix(postfix2));
        System.out.println("Infix of " + postfix3 + " is " + postToInfix(postfix3));
    }
    
}
