package DSA.Strings;

import java.util.HashSet;

public class MaxUniqueSubstring {
  public static int maxUniqueSplit(String s) {
        return backtrack(s, new HashSet<>());
    }

    private static int backtrack(String s, HashSet<String> seen) {
        int maxCount = 0;

        // Try splitting the string at each position
        for (int i = 1; i <= s.length(); i++) {
            String substring = s.substring(0, i);

            // If this substring hasn't been used yet
            if (!seen.contains(substring)) {
                seen.add(substring); // Mark the substring as used
                maxCount = Math.max(maxCount, 1 + backtrack(s.substring(i), seen));
                seen.remove(substring); // Backtrack to try other possibilities
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        String s = "ababccc"; //5 (a,b,ab,c,cc)
        System.out.println("Maximum number of unique substrings: " + maxUniqueSplit(s));
    }
}

