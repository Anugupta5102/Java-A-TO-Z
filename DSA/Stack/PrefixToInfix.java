package DSA.Stack;

import java.util.Stack;

public class PrefixToInfix {
    /*start from end
     * if letter, push
     * if operator, 
     */
    public static String preToInfix(String prefix){
        Stack<String> s=new Stack<>();
        for(int i=prefix.length()-1;i>=0;i--){
            char ch=prefix.charAt(i);
        
        if(Character.isLetterOrDigit(ch)){
            s.push(String.valueOf(ch));
        }
        else{
            String operand1=s.pop();
            String operand2=s.pop();
            String exp= "(" + operand1 + ch + operand2 + ")";

            s.push(exp);
        }
        }
        return s.pop();
    }
    public static void main(String[] args) {
        // Test cases
        String prefix1 = "+A*BC";
        String prefix2 = "*+AB-CD";
        String prefix3 = "/+AB+CD";

        System.out.println("Infix of " + prefix1 + " is " + preToInfix(prefix1));
        System.out.println("Infix of " + prefix2 + " is " + preToInfix(prefix2));
        System.out.println("Infix of " + prefix3 + " is " + preToInfix(prefix3));
    }
    
    
}
