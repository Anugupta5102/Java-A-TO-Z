package DSA.Stack;

import java.util.Stack;

// O(N)+O(N)
public class InfixToPostfix { 
    /* priority of operators :
       ^ = 3, * / = 2, - + = 1, else = -1
       Add letter, no to string ans
       Add operator to stack priority based-> higher is pushed
    */ 
    private static int precedence(char operator){
        switch (operator) {
            case '+':
            case '-': 
                    return 1;
            case '*':
            case '/':
                    return 2;
            case '^':
                    return 3;
            default:
                return -1;
        }
    }
    public static String infixToPost(String infix){
        StringBuilder ans=new StringBuilder();
        Stack<Character> s=new Stack<>();

        for(char ch: infix.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                ans.append(ch);
            }
            else if(ch == '('){
                s.push(ch);
            }
            else if(ch == ')'){
                while(!s.isEmpty() && s.peek() != '('){
                    ans.append(s.pop());
                }
                s.pop();
            }
            else{
                while(!s.isEmpty() && precedence(s.peek()) >= precedence(ch)){
                    ans.append(s.pop());
                }
                s.push(ch);
            }
        }
        while (!s.isEmpty()) {
            ans.append(s.pop());
            
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        // Test cases
        String infix1 = "A+B*C";
        String infix2 = "(A+B)*C-D/E";
        String infix3 = "A*(B+C)/D";

        System.out.println("Postfix of " + infix1 + " is " + infixToPost(infix1));
        System.out.println("Postfix of " + infix2 + " is " + infixToPost(infix2));
        System.out.println("Postfix of " + infix3 + " is " + infixToPost(infix3));
    }
    
}
