package DSA.Strings;
import java.util.HashSet;
public class LongestUniqueSubstring {

    public static int lengthOfLongestSubstring(String s) {
        // Use a set to store characters of the current window
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0; // Two pointers to maintain the sliding window
        int maxLength = 0;

        while (right < s.length()) {
            // If the character is not in the set, add it and expand the window
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                // Update the max length of the substring found
                maxLength = Math.max(maxLength, right - left);
            } else {
                // If a repeating character is found, shrink the window from the left
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("The length of the longest substring without repeating characters is: " + result);
    }
}

    
}
