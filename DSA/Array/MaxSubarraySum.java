package DSA.Array;

public class MaxSubarraySum {
    /*Brute----> travervse through array and  subarray and find max sum------>O(N^3)
     * Better--->traverse array and add prev sum to next element and find max--->O(N^2)
     * Optimal--->Kadane's algorithm-->(sum > 0)   =>O(N)-TC and O(1)-SC
     */
    public static long MaxSum(int a[],int n){
        long max=Long.MIN_VALUE;//max sum
        long sum=0;
        int start=0;
        int ansStart=-1, ansEnd=-1;
        /* traverse if sum < 0, dont carry sum. */
        for(int i=0;i<n;i++){
            if(sum == 0) start=i;// start of new subarray
            
            sum += a[i];//prefix sum

            if(sum > max){
                max = sum;

                ansStart=start;
                ansEnd=i;
            }
            if(sum < 0){
                sum=0;
            }
        }
        //print subarray
        System.out.println("The subarray is: ");
        for(int i=ansStart;i<=ansEnd;i++){
            System.out.print(a[i] + ", ");
        }
        System.out.println();

        //To consider sum of empty subarray
        //if(max < 0) max=0;
        return max;

    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1,-5,4};
        int n=arr.length;
        long maxi = MaxSum(arr,n);
        System.out.println("The maximum subarray sum  is: " + maxi);
    }
    
}
