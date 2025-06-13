package DSA.Array;
//optimal for +ve
public class LongestSubarraySumPve {
    //sum-k--->prefix sum
    //only +ve
    //O(2N)
    public static int getLongest(int arr[],int k){
        int n=arr.length;
        int left=0,right=0;
        int sum=arr[0];
        int len=0;
        while (right < n) {
            //if sum>k reduce subarray from left until sum<=k
            while (sum > k && left<=right) {
                sum= sum-arr[left];
                left++;
            }
            if(sum == k){
                len=Math.max(len, right-left+1);
            }
            right++;
            if(right < n){
                sum += arr[right];
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,1,9};
        int k=10;
        int len=getLongest(arr, k);
        System.out.println("Length of longest subarray is: "+ len);
        
    }
}
