package DSA.Array;

import java.util.HashMap;
import java.util.Map;
//Prefix sum--->Given K,find sum-K(0 to i-1), then  sum(i to j)=k--->sum-k+k
//total sum - target = rem
public class CountSubarraySumK {
    /*Given an array of integers and an integer k, 
    return the total number of subarrays whose sum equals k. */
    /*optimal--->O(nlogn)
     * First, we will declare a map to store the prefix sums and their counts.
*Then, we will set the value of 0 as 1 on the map.
*Then we will run a loop(say i) from index 0 to n-1(n = size of the array).
*For each index i, we will do the following:
*We will add the current element i.e. arr[i] to the prefix sum.
*We will calculate the prefix sum i.e. x-k, for which we need the occurrence.
*We will add the occurrence of the prefix sum x-k i.e. mpp[x-k] to our answer.
*Then we will store the current prefix sum in the map increasing its occurrence by 1.

     */
    public static int countAll(int ar[],int k){
        int n=ar.length;
        //<sum,c>
        Map<Integer,Integer> mp=new HashMap<>();
        int presum=0,count=0;
        mp.put(0, 1);//set 0--->empty subarray
        for(int i=0;i<n;i++){
            //add current to prefix sum
            presum += ar[i]; 
            //calculate x-k
            int remove=presum-k;
            //add no of subarray to be removed
            count += mp.getOrDefault(remove, 0);
            //update count
            mp.put(presum, mp.getOrDefault(presum, 0)+1);

        }
        return count;
    }
    public static void main(String[] args) {
        int ar[]={3,1,2,4};
        int k=6;
        int c=countAll(ar, k);
        System.out.println("The number of subarrays with sum " +k+ " : "+ c);
    }

}
