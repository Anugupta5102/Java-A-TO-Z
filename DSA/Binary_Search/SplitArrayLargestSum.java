package DSA.Binary_Search;
/*find min(max) */

/*similar to painter partition ,book allocation
split array into k subarrays such that- 
each has atleast 1 element & max subarray sum is min*/
public class SplitArrayLargestSum {
    public static int countPartitions(int a[],int maxSum){
        int n=a.length;
        int partition=1;
        long subarraySum=0;
        for(int i=0;i<n;i++){
            if(subarraySum+a[i] <= maxSum){
                subarraySum += a[i];
            }
            else{
                partition++;
                subarraySum = a[i];
            }
        }
        return partition;
    }

    public static int MaxSubarraySumMin(int a[],int k){
        int low=a[0];
        int high=0;
        //find max and sum
        for(int i=0;i<a.length;i++){
            low=Math.max(low,a[i]);
            high += a[i];
        }
        while (low<=high) {
            int mid=(low+high)/2;
            int part=countPartitions(a, mid);
            if(part > k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        return low;
    }
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int k = 2;
        int ans = MaxSubarraySumMin(a, k);
        System.out.println("The answer is: " + ans);
    }
}
