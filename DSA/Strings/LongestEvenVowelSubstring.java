package DSA.Strings;
import java.util.HashMap;
public class LongestEvenVowelSubstring {
    
    public static int findTheLongestSubstring(String s) {
        // Map to store the first occurrence of each state (bitmask)
        HashMap<Integer, Integer> map = new HashMap<>();
        // Initial state is 0 (all vowels even) at index -1
        map.put(0, -1);
        
        int state = 0;  // Current bitmask (00000)
        int maxLength = 0;
        
        // Traverse the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // Flip the corresponding bit if the character is a vowel
            if (c == 'a') {
                state ^= (1 << 0);  // Flip bit for 'a'
            } else if (c == 'e') {
                state ^= (1 << 1);  // Flip bit for 'e'
            } else if (c == 'i') {
                state ^= (1 << 2);  // Flip bit for 'i'
            } else if (c == 'o') {
                state ^= (1 << 3);  // Flip bit for 'o'
            } else if (c == 'u') {
                state ^= (1 << 4);  // Flip bit for 'u'
            }
            
            // If the state has been seen before, calculate the length of the substring
            if (map.containsKey(state)) {
                maxLength = Math.max(maxLength, i - map.get(state));
            } else {
                // Otherwise, store the first occurrence of the state
                map.put(state, i);
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "eleetminicoworoep";
        int result = findTheLongestSubstring(s);
        System.out.println("The length of the longest substring with even vowels is: " + result);
    }
}

    
}
