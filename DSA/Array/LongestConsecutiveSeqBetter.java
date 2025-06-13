package DSA.Array;

import java.util.Arrays;
//O(NlogN)+O(N)-TC 
public class LongestConsecutiveSeqBetter {
    /*Return length of longest consecutive sequence
     * Better-1. Sort array
     * 2. longest=1, count=0, lastSmallest=INT_MIN
     * 3. traverse , count if consecutive and unique
     * if not start again c=0, lastSmallest=a[i]
     * 4. return longest
     */
    public static int countLongest(int ar[]){
        int n=ar.length;
        int count=0;
        int longest=1;
        int lastSmallest=Integer.MIN_VALUE;
        Arrays.sort(ar);//ascending-> chote se bada
        for(int i=0;i<n;i++){
            if(ar[i]-1 == lastSmallest){
                count++;
                lastSmallest=ar[i];
            }
            //restart if different
            else if(ar[i] != lastSmallest){
                count=1;
                lastSmallest=ar[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;

    }
    public static void main(String[] args) {
        int ar[]={100,102,100,101,101,4,3,2,3,2,1,1,1,2};//{1,2,3,4}
        int c=countLongest(ar);
        System.out.println("Length of Longest consecutive sequence is: "+c);
    }
}
