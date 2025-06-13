package DSA.Array;
/* i<j and a[i] > a[j], count total
 * use merge sort
 * O(NlogN)
 */
import java.util.ArrayList;
public class CountInversions {
    private static int merge(int ar[],int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;

        int c=0;
        //store elements in sorted manner
        while(left<=mid && right<=high){
            if(ar[left] <= ar[right]){
                temp.add(ar[left]);
                left++;
            }
            else{
                temp.add(ar[right]);
                c += (mid-left+1);//count inversion pair
                right++;
            }
        }
        //add rem
        while(left <=mid){
            temp.add(ar[left]);
            left++;
        }
        //add rem
        while(right <= high){
            temp.add(ar[right]);
            right++;
        }
        //transfer all from temp to arr
        for(int i=low;i<=high;i++){
            ar[i]=temp.get(i-low);
        }
        return c;
    }
    public static int mergeSort(int ar[],int low, int high){
        int c=0;
        if( low >= high) return c;
        int mid=(low + high)/2;
        c += mergeSort(ar, low, mid);
        c += mergeSort(ar, mid+1, high);
        c += merge(ar, low, mid, high);
        return c;
    }
    public static int totalInversions(int ar[],int n){
        //count pairs
        return mergeSort(ar, 0, n-1);
    }
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        int n = 5;
        int cnt = totalInversions(a, n);
        System.out.println("The number of inversions are: " + cnt);
    }

}
