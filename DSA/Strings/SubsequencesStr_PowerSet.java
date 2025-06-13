package DSA.Strings;

/**
 * Subsequences_PowerSet
 */
public class SubsequencesStr_PowerSet {
    // O(2^n)
    public static void printSubsequene(String str, int i,String newString){
        if(i==str.length()){
            System.out.println(newString);
            return;
        }
        char curr=str.charAt(i);
        //include
        printSubsequene(str, i+1, newString+curr);

        //not include
        printSubsequene(str, i+1, newString);
    }


    public static void main(String[] args) {
        String str="abc";
        printSubsequene(str, 0, " ");
        
    }
}