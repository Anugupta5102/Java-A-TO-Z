package DSA.Binary_Search;
/*Find smallest divisor given a threshold;
such that---> sum of the division's result is less than or equal to the given threshold
 * eg[1,2,5,9] and threshold=6
 * if we take 4, then ceil(1/4)=1,+ 2/4,+ 5/4,+ 9/4=7>6 so not possible
 * 
 */
public class SmallestDivisor {
    public static int findMax(int ar[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            max=Math.max(max, ar[i]);
        }
        return max;
    }

    public static int divSum(int ar[], int div){
        int sum=0;
        for(int i=0;i<ar.length;i++){
            sum +=  Math.ceil((double)ar[i]/(double)div); 
        }
        return sum;
    }

    public static int minDivisor(int ar[],int threshold){
        if(ar.length > threshold) return -1;
        int low=1;
        int high=findMax(ar);
        while (low<=high) {
            int mid=(high+low)/2;
            if(divSum(ar, mid) <= threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int smallest=minDivisor(arr, 8);
        System.out.println("Smallest divisor is:" + smallest);
    }
}
