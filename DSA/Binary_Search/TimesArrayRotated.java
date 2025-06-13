package DSA.Binary_Search;
/* find pivot, bs*/ 
public class TimesArrayRotated {
    public static int findRotationCount(int ar[],int low,int high){
        int n=ar.length;
        if(ar[low] <= ar[high]){//not rotated
            return 0;
        }
        while(low <= high){
            int mid=(high+low)/2;
            //check if mid is pivot(smallest)
            if(mid > 0 && ar[mid] < ar[mid-1]){
                return mid;
            }
            if(mid < n-1 && ar[mid] > ar[mid+1]){
                return mid+1;
            }
            //decide which half to discard
            if(ar[mid] >= ar[low]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        int n=arr.length;
        int rotationCount = findRotationCount(arr,0,n-1);
        System.out.println("The array has been rotated " + rotationCount + " times.");
    }
    
}
