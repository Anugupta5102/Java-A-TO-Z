package DSA.Strings;

public class revStr {
    public static void rev(String str, int i){
        if(i==0){
            System.out.println(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        rev(str, i-1);
    }
    public static void main(String[] args) {
        String a="anushree";
        rev(a, a.length()-1);
    }
}
