package searchSort;
//O(NlogN)--->best
//O(N^2)---->worst
public class quickSort {
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        //swap with pivot
        i++;
        int t=arr[i];
        arr[i]=arr[high];
        arr[high]=t;
        return i;

    }
    public static void quick(int arr[],int low,int high){
        if(low<high){
            int idx=partition(arr,low,high);
            quick(arr, low, idx-1);
            quick(arr, idx+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        quick(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    
}
