package DSA.Strings;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        String str= "@!j$%#@a!v*&a";
        String ans= str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(ans);
    }
    
}
