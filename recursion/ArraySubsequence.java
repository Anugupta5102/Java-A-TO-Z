package recursion;

import java.util.ArrayList;
/* subset */
public class ArraySubsequence {
    public static void subseq(int ar[],int i,ArrayList<Integer> curr){
        int n=ar.length;
        if(i == n){
           System.out.println(curr);
            return;
        }
        //not include
        subseq(ar, i+1, curr);
        //include
        curr.add(ar[i]);
        subseq(ar, i+1, curr);

        //backtrack
        curr.remove(curr.size()-1);
    }
    public static void main(String[] args) {
        int ar[]={1,2,3};
        System.out.println("Subsequences are: ");
        subseq(ar, 0, new ArrayList<>());
    }
    
}
