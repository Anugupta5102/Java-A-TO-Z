package recursion;

import java.util.ArrayList;
import java.util.List;

public class KthPermutation {
    /* given n and k, return kth permutation
    for n--->n! are the no of unique permutations
     * list permutations of n in ascending order
     * eg n=3, k=3 then o/p=213
     * Brute force-->permutations using recursion then sort, kth lie at k-1 index---->O(N!*N)
     * Optimal---> n=4, k=17 then 4!=24---->we need to find 16th permutation(0-23)
     * create a DS of n-->{1,2,3,4}--->(0-3 index)
     * n=4 is divided into 4(0-3 index) parts of 6 each-->0-5, 6-11, 12-17 , 18-23
     * 1st index(16/6=3) is the one where the 16th lies out of the 4 parts ie 12-17--> i=2, then search in DS what is i=2 ie 3 
     * find  16 % 6=4 sequence among the set of 6 sequences on index 3 ie {1,2,4}
     * again repeat same process.
     * TC-O(N^2) and SC-O(N)
     */
    public static String getpermutation(int n,int k){
        int fact=1;
        List<Integer> num=new ArrayList<>();
        for(int i=1;i<n;i++){
            fact=fact * i;
            num.add(i);//1 to n-1
        }
        num.add(n);// last n
        String ans=" ";
        k=k-1;//17th permutation---->0-16 ie 16th one
        while(true){
            ans=ans + num.get(k / fact);//----> 16/6(find block in which the k lies)
            num.remove(k / fact);//remove the no ie found
            if(num.size() == 0){
                break;
            }
            k = k % fact;//16%4----->next value of k
            fact= fact/num.size();
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=4;
        int k=17;
        String ans=getpermutation(n,k);
        System.out.println(k+ "th permutation of " + n + " is:"+ans);
        
    }


}
