package DSA.Strings;

public class RemoveWhitespaces {
    public static void main(String[] args) {
        String str= "  j  a   v  a    ";
        String ans=str.replaceAll("\\s", "");
        System.out.println(ans);
    }
    
}
