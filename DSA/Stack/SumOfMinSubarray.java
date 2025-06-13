package DSA.Stack;

import java.util.Stack;
    //O(N)- tc, sc
    public class SumOfMinSubarray {
        /* This method calculates the sum of minimums of all subarrays by finding
         * the previous smaller element (PSE) and next smaller element (NSE) for each element in the array.
         */
        public static int minSum(int ar[]) {
            int n = ar.length;
            long mod = 1_000_000_007; // to handle large numbers -> 10^9+7
            
            // Arrays to store the counts of subarrays where ar[i] is the minimum
            int[] pse = new int[n]; // left min count
            int[] nse = new int[n]; // right min count
            Stack<Integer> st = new Stack<>();
    
            // Calculate PSE (Previous Smaller Element count)
            for (int i = 0; i < n; i++) {
                while (!st.isEmpty() && ar[st.peek()] >= ar[i]) {
                    st.pop();
                }
                pse[i] = st.isEmpty() ? (i + 1) : (i - st.peek());
                st.push(i); // Push index onto the stack
            }
    
            st.clear(); // Clear stack for reuse
    
            // Calculate NSE (Next Smaller Element count)
            for (int i = n - 1; i >= 0; i--) {
                while (!st.isEmpty() && ar[st.peek()] > ar[i]) {
                    st.pop();
                }
                nse[i] = st.isEmpty() ? (n - i) : (st.peek() - i);
                st.push(i); // Push index onto the stack
            }
    
            // Calculate the sum of minimums of all subarrays
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum = (sum + (long) ar[i] * pse[i] * nse[i]) % mod;
            }
    
            return (int) sum;
        }
    
        public static void main(String[] args) {
            int[] arr = {3, 1, 2, 4};
            int result = minSum(arr);
            System.out.println("Sum of subarray minimums: " + result);
        }
}
    