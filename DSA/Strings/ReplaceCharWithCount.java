package DSA.Strings;

public class ReplaceCharWithCount {
    public static void main(String[] args) {
        String str="remote";
        char ch='e';

        if(str.indexOf(ch) == -1){
            System.out.println("Given char not present");
            System.exit(0);
        }
        int c=1;
        for(int i=0;i<str.length();i++){
            char s=str.charAt(i);
            if(s == ch){
                str=str.replaceFirst(String.valueOf(s),String.valueOf(c));
                c++;
            }
        }
        System.out.println(str);
    }
    
}
