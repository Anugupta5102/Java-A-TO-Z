package DSA.Stack;

import java.util.Stack;

public class PostfixToPrefix {
    /* if letter, push
     * if operator, pop last 2, add operator + top1 + top2
     */
    public static String postToPre(String postfix){
        Stack<String> s=new Stack<>();

        for(int i=0;i<postfix.length();i++){
            char ch=postfix.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                s.push(String.valueOf(ch));
            }
            else{
                String op1= s.pop();
                String op2=s.pop();
                String exp= ch + op1 + op2;

                s.push(exp);
            }
        }
        return s.pop();
    }
    public static void main(String[] args) {
        // Test cases
        String postfix1 = "ABC*+";
        String postfix2 = "AB+C*DE/-";
        String postfix3 = "AB+C*D+E/";

        System.out.println("Prefix of " + postfix1 + " is " + postToPre(postfix1));
        System.out.println("Prefix of " + postfix2 + " is " + postToPre(postfix2));
        System.out.println("Prefix of " + postfix3 + " is " + postToPre(postfix3));
    }
    
}
