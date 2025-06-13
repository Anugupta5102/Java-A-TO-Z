package DSA.Strings;

public class AddStrings {
    
        public static String addStr(String num1, String num2) {
            StringBuilder result = new StringBuilder();
    
            int i = num1.length() - 1;  // Pointer for num1
            int j = num2.length() - 1;  // Pointer for num2
            int carry = 0;              // Initialize carry to 0
    
            // Traverse both strings from right to left
            while (i >= 0 || j >= 0 || carry != 0) {
                int n1 = (i >= 0) ? num1.charAt(i) - '0' : 0;  // Get digit from num1 or 0 if out of bounds
                int n2 = (j >= 0) ? num2.charAt(j) - '0' : 0;  // Get digit from num2 or 0 if out of bounds
    
                int sum = n1 + n2 + carry;  // Sum current digits plus carry
                carry = sum / 10;           // Update carry for next addition
                result.append(sum % 10);    // Append current digit to result
    
                i--;  // Move to next digit in num1
                j--;  // Move to next digit in num2
            }
    
            return result.reverse().toString();  // Reverse and convert result to string
        }
    public static void main(String[] args) {
        
        System.out.println(addStr("11", "123"));
        System.out.println(addStr("999", "001"));
    }
        
}
