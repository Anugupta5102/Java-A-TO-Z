package recursion;

public class PermutationsStr {
    //O(n!)
    public static void printPermu(String str, String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newString=str.substring(0, i)+ str.substring(i+1);
            printPermu(newString, perm+curr);

        }


    }
    public static void main(String[] args) {
        String s="abc";
        printPermu(s, "");
    }
}
