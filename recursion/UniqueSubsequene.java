package recursion;
import java.util.HashSet;
public class UniqueSubsequene {
    public static void uniqueSub(String str, int i, String newString,HashSet<String> set){
        if(i==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;

            }
           
        }
        char curr=str.charAt(i);
        
        //include
        uniqueSub(str, i+1, newString+curr,set);

        //not include
        uniqueSub(str, i+1, newString,set);
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        uniqueSub(str, 0, " ",set);
    }
    
}
