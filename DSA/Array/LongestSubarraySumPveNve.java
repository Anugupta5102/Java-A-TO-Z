package DSA.Array;
//optimal for +ve, -ve
public class LongestSubarraySumPveNve {
    //longest subarray with sum-K--->prefix sum
    // subarray is contiguous part
    //+ve and -ve
    public static int getLongest(int arr[], int k){//better approach
        int n=arr.length;
        int len=0;
        //O(N^2)
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++){//[i....j]
                s+=arr[j];
                if(s == k){
                    len=Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int arr[]={-1,1,1};
        int k=1;
        int len=getLongest(arr, k);
        System.out.println("The length of longest subarray is: " + len);
    }
    
}
