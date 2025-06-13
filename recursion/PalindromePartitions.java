package recursion;

import java.util.ArrayList;
import java.util.List;

// partition such a way that substring is also palindrome
public class PalindromePartitions {
    /*eg aabb
     * a,a,b,b
     * a,a,bb
     * aa,b,b
     * aa,bb
     */


    // Function to check if a string is a palindrome
    public boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Recursive function to find all palindrome partitions
    public void partitionHelper(String s, int index, List<String> currentPartition, List<List<String>> result) {
        // If reached the end of the string, add the current partition to the result
        if (index == s.length()) {
            result.add(new ArrayList<>(currentPartition));
            return;
        }

        // Try all possible partitions
        for (int i = index; i < s.length(); i++) {
            // If the current substring is a palindrome
            if (isPalindrome(s, index, i)) {
                // Add the substring to the current partition
                currentPartition.add(s.substring(index, i + 1));
                // Recur for the remaining substring
                partitionHelper(s, i + 1, currentPartition, result);
                // Backtrack and remove the substring from the current partition
                currentPartition.remove(currentPartition.size() - 1);
            }
        }
    }

    // Main function to find all palindrome partitions of a given string
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> currentPartition = new ArrayList<>();
        partitionHelper(s, 0, currentPartition, result);
        return result;
    }

    public static void main(String[] args) {
        PalindromePartitions pp = new PalindromePartitions();
        String s = "aabb";
        List<List<String>> result = pp.partition(s);

        for (List<String> partition : result) {
            System.out.println(partition);
        }
    }
}


