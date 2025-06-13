package DSA.Strings;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfEachChar {
    public static void main(String[] args) {
        String str = "hellojava";
        Map<Character, Integer> mp = new HashMap<>();

        for (char ch : str.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        System.out.println(mp);
    }
}
          /*  if(!mp.containsKey(ch)){
                mp.put(ch, 1);
            }
            else{
                int c=mp.get(ch);
                mp.put(ch, c+1);
            }
        }
            */
      