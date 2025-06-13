package DSA.Strings;
/*==>the characters in s can be replaced to get t. 
 * ==> one-one mapping
 * O(n)-tc, O(1)-sc
*/
public class Isomorphic {
   
        public static boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length()) return false;
    
            int[] mapS = new int[256];  // Array to store the last seen position of characters in s
            int[] mapT = new int[256];  // Array to store the last seen position of characters in t
    
            for (int i = 0; i < s.length(); i++) {
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);
    
                if (mapS[sChar] != mapT[tChar]) {
                    return false;  // If the mappings do not match, return false
                }
    
                mapS[sChar] = i + 1;  // Update the mapping to the current index (i + 1)
                mapT[tChar] = i + 1;  // Update the mapping to the current index (i + 1)
            }
    
            return true;  // If all mappings are consistent, return true
        }
    public static void main(String[] args) {
        System.out.println("Isomorphic: "+isIsomorphic("egg", "add"));
        System.out.println("Isomorphic: "+isIsomorphic("foo", "bar"));

    }
        
}
