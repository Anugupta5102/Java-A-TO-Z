package DSA.Strings;

//O(N)
public class IsAnagrams {
    public static boolean check(String a, String b){
        if(a.length() != b.length()){
            return  false;
        }
        int charCount[]=new int[26]; // only lowercase; 
        for(int i=0;i<a.length();i++){
            charCount[a.charAt(i) - 'a']++;
            charCount[b.charAt(i) - 'a']--;
        }
        for(int c : charCount){
            if(c != 0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("Are anagrams: " + check(str1, str2));
    }
    
}
    /* O(nlogn)
    public static boolean check(String s1, String s2){
        if(s1.length() != s2.length()){
            return  false;
        }
        char ar1[]=s1.toCharArray();
        char ar2[]=s2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        return  Arrays.equals(ar1, ar2);
    }
    */
