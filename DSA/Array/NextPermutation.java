package DSA.Array;
/*Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.

If such an arrangement is not possible, it must rearrange to the lowest possible order (i.e., sorted in ascending order).
 */
 /*brute- generate all permutations->linear search->next index
         *optimal- 1. longest prefix match--->find Breakpoint starting from end=> a[i]<a[i+1]
         //(n-2) is last index where we can find a breakpoint
         * 2. find someone greater than a[i] but smallest one(ie close) in the right half of index and swap
         * 3. place remaining in sorted order --> reverse entire right half
         */
//find next lexicographically greater permutation
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//O(3N)-TC and O(1)-SC
public class NextPermutation {
    public static List<Integer> getNextPer(List<Integer> ar){
        int n=ar.size();
        int idx=-1;
        //1. find breakpoint
        for(int i=(n-2);i>=0;i--){//start from second last
            if(ar.get(i) < ar.get(i+1)){
                idx=i;
                break;
            }
        }
        //breakpoint not exists reverse whole array 
        if(idx == -1){
            Collections.reverse(ar);
            return ar;
        }
        //2. find ar[i] > idx and swap a[i]<=>a[idx]
        for(int i=(n-1);i>idx;i--){
            if(ar.get(i) > ar.get(idx)){
                int temp=ar.get(i);
                ar.set(i, ar.get(idx));
                ar.set(idx, temp);
                break;
            }
        }
        //3. sort/reverse the remaining elements from breakpoint to end in decreasing order
       List<Integer> sublist=ar.subList(idx+1, n);//right half
       Collections.reverse(sublist);
       return ar;

    }
    public static void main(String[] args) {
            List<Integer> ar=Arrays.asList(new Integer[]{2,1,5,4,3,0,0});
            List<Integer> ans =getNextPer(ar);
            System.out.println("The next permutation is: " );
            for(int i=0;i<ar.size();i++){
                System.out.print(ans.get(i) + " ");
            }
       
    }
}
