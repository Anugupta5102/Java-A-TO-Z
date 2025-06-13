package DSA.Stack;

import java.util.Stack;

//O(3N)-TC
public class InfixToPrefix {
    /* reverse the infix 
     * infix -> postfix
     * reverse answer
    */
    // Function to get the precedence of operators
    private static int precedence(char operator) {
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

    // Function to reverse a string
    private static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Function to convert infix to postfix
    private static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char ch : infix.toCharArray()) {
            // If the character is an operand, add it to the postfix expression
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }
            // If the character is '(', push it to the stack
            else if (ch == '(') {
                stack.push(ch);
            }
            // If the character is ')', pop from the stack until '(' is encountered
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Remove '(' from the stack
            }
            // If an operator is encountered
            else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Pop all the remaining operators in the stack
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    // Function to convert infix to prefix
    public static String infixToPrefix(String infix) {
        // Reverse the infix expression
        String reversedInfix = reverse(infix);

        // Replace '(' with ')' and vice versa in the reversed infix expression
        StringBuilder modifiedInfix = new StringBuilder();
        for (char ch : reversedInfix.toCharArray()) {
            if (ch == '(') {
                modifiedInfix.append(')');
            } else if (ch == ')') {
                modifiedInfix.append('(');
            } else {
                modifiedInfix.append(ch);
            }
        }

        // Convert modified infix to postfix
        String postfix = infixToPostfix(modifiedInfix.toString());

        // Reverse the postfix expression to get the prefix expression
        return reverse(postfix);
    }

    public static void main(String[] args) {
        // Test cases
        String infix1 = "A+B*C";
        String infix2 = "(A+B)*C-D/E";
        String infix3 = "A*(B+C)/D";

        System.out.println("Prefix of " + infix1 + " is " + infixToPrefix(infix1));
        System.out.println("Prefix of " + infix2 + " is " + infixToPrefix(infix2));
        System.out.println("Prefix of " + infix3 + " is " + infixToPrefix(infix3));
    }
}