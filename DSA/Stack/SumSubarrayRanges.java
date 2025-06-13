package DSA.Stack;
//O(N)- TC, SC
import java.util.*;
public class SumSubarrayRanges {
    /*sum += largest-smallest */
    public static long subArrayRanges(int[] nums) {
        int n = nums.length;
        long totalSum = 0;

        // Calculate the contribution of each element as the maximum
        Stack<Integer> stack = new Stack<>();
        long[] maxContribution = new long[n];
        
        for (int i = 0; i < n; i++) {
            // Ensure stack maintains decreasing order
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                int j = stack.pop();
                int k = stack.isEmpty() ? -1 : stack.peek();
                maxContribution[j] = (long) nums[j] * (i - j) * (j - k);
            }
            stack.push(i);
        }
        
        // Process remaining elements in the stack for max contribution
        while (!stack.isEmpty()) {
            int j = stack.pop();
            int k = stack.isEmpty() ? -1 : stack.peek();
            maxContribution[j] = (long) nums[j] * (n - j) * (j - k);
        }

        // Calculate the contribution of each element as the minimum
        stack.clear(); // Reuse the stack
        long[] minContribution = new long[n];
        
        for (int i = 0; i < n; i++) {
            // Ensure stack maintains increasing order
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                int j = stack.pop();
                int k = stack.isEmpty() ? -1 : stack.peek();
                minContribution[j] = (long) nums[j] * (i - j) * (j - k);
            }
            stack.push(i);
        }
        
        // Process remaining elements in the stack for min contribution
        while (!stack.isEmpty()) {
            int j = stack.pop();
            int k = stack.isEmpty() ? -1 : stack.peek();
            minContribution[j] = (long) nums[j] * (n - j) * (j - k);
        }

        // Calculate the total sum of subarray ranges
        for (int i = 0; i < n; i++) {
            totalSum += maxContribution[i] - minContribution[i];
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        long result = subArrayRanges(arr);
        System.out.println("Sum of subarray ranges: " + result);
    }
}