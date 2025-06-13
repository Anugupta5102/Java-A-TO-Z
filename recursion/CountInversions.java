package recursion;
import java.util.ArrayList;
public class CountInversions {
    /* In array count pairs--> i<j and a[i]>a[j]
     * use merge sort---->O(NlogN)
     * if a[left]>a[right], mid-left+1(c++) and right++
     * else, left++
     */
    public static int merge(int arr[],int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;//starting index of left half array
        int right=mid+1;//starting index of right half array
        int count=0;
        while(left<=mid && right<=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                count += (mid-left+1);//total ar[i]>ar[j]
                right++;
            }
        }
        //left half remaining elements
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
            
        }
        //right half remaining elements
        while (right<= high) {
            temp.add(arr[right]);
            right++;
            
        }
        //transfer all from temp to array
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
        return count;

    }
    public static int mergeSort(int arr[],int low,int high){
        int count=0;
        if(low >= high){//base case
            return count;
        }
        int mid=(low+high)/2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid+1, high);
        count += merge(arr, low, mid, high);
        return count;
    }
    public static int totalInversions(int arr[],int n){
        //count
        return mergeSort(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int n=arr.length;
        int count=totalInversions(arr, n);
        System.out.println("The number of inversions are: "+ count);
    }

}
