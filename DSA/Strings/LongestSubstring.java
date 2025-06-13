package DSA.Strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
/* not contain  repeat char*/
public static int lengthOfLongestSubstring(String s) {
    /*
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        int right = 0; 
        while (right < s.length()) {
            char ch = s.charAt(right);
            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch, right);
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
} */
    Map<Character,Integer> mp=new HashMap<>();
    int max=0;
    int start=0;

    for(int end=0;end<s.length();end++){
        char curr=s.charAt(end);
// If the character is already in the map, move the start pointer to the right of the last occurrence
        if(mp.containsKey(curr)){
            start=Math.max(start, mp.get(curr)+1);
        }
        mp.put(curr, end);
        max=Math.max(max,end-start+1);
    }
    return max;
    
}
public static void main(String[] args) {
    String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println("The length of the longest substring without repeating characters is: " + result); // Output: 3

        String s2 = "bbbbb";
        int result2 = lengthOfLongestSubstring(s2);
        System.out.println("The length of the longest substring without repeating characters is: " + result2); 
}
}
