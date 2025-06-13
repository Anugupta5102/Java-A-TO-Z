package DSA.Strings;
/*Discard any leading whitespace.
Handle an optional initial + or - sign.
Convert the following digits into an integer until a non-digit character is encountered.
Handle integer overflow and underflow. */
public class AtoiStringToInteger {

        public static int myAtoi(String s) {
            // Step 1: Trim leading/trailing whitespaces
            String temp = s.trim();
            if (temp.length() == 0) return 0; // Return 0 if the string is empty after trimming
    
            // Initialize variables
            int i = 0, sign = 1;
            long result = 0; // Use long to handle overflow
    
            // Step 2: Check the sign
            if (temp.charAt(i) == '-' || temp.charAt(i) == '+') {
                sign = (temp.charAt(i) == '-') ? -1 : 1;
                i++;
            }
    
            // Step 3: Convert characters to integer until a non-digit character is found
            while (i < temp.length()) {
                char ch = temp.charAt(i);
                if (!Character.isDigit(ch)) break; // Break if not a digit
    
                result = result * 10 + (ch - '0'); // Convert char to int and add to result
    
                // Step 4: Handle overflow/underflow
                if (result * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (result * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
    
                i++;
            }
    
            // Step 5: Return the result with the appropriate sign
            return (int) (result * sign);
        }
        public static void main(String[] args) {
            System.out.println(myAtoi("   -42")); // Output: -42
            System.out.println(myAtoi("4193 with words")); // Output: 4193
            System.out.println(myAtoi("words and 987")); // Output: 0
            System.out.println(myAtoi("-91283472332")); // Output: -2147483648 (Integer.MIN_VALUE)
        }
    }

    
