package DSA.Strings;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str="Hello world";
        String ans=" ";
        String word[]=str.split(" "); 

        for(String w : word){
            String revWord="";

            for(int i=w.length()-1;i>=0;i--){
                revWord = revWord + w.charAt(i);
            }
            ans = ans + revWord + " ";
        }
        System.out.println(ans);
    }
    
}
