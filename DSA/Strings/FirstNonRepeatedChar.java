package DSA.Strings;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str="AABCDBE";

        for(int i=0;i<str.length();i++){
            boolean unique=true;

            for(int j=0;j<str.length();j++){
                if(i!=j && str.charAt(i) == str.charAt(j)){
                    unique=false; //repeated
                }
            }
            if(unique){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
    
}
/*
    HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }
        
        return '\0'
 */
