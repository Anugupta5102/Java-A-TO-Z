package DSA.Binary_Search;
/*Find kth missing number 
 * given array of increasing +ve integers
 * count of missing numbers up to index i = ar[high] - (high+1).
 * more_missing_numbers = k - (ar[high] - (high+1)).
 * kth missing number = ar[high] + k - (ar[high] - (high+1))
        =  ar[high] + k - ar[high] + high + 1
        = k + high + 1. or low + k
*/
public class KthMissingPve {
    public static int missingK(int ar[],int n,int k){
        int low=0;
        int high=n-1;
        while (low<=high) {
            int mid=(low+high)/2;
            int missNum=ar[mid]-(mid+1);
            if(missNum < k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        return low+k;//high+k+1
    }

    //O(logN)
    public static void main(String[] args) {
        int[] vec = {4, 7, 9, 10};
        int n = 4, k = 4;
        int ans = missingK(vec, n, k);
        System.out.println("The missing number is: " + ans);
    }
}
