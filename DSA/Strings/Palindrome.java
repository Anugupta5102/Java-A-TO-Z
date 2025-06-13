package DSA.Strings;

public class Palindrome {
    public static boolean check(String str){
        int l=0;
        int r=str.length()-1;

        while(l<r){
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println("Is palindrome: " + check(str));
    }
}
    
