package searchSort;

public class mergeSort {
    //O(n log n)--->time 
    public static void merge(int arr[],int low,int mid,int high){
        int temp[]=new int[high-low+1];//last new array
        int left=low;
        int right=mid+1;
        int x=0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[x++]=arr[left++];
            }
            else{
                temp[x++]=arr[right++];
            }
        }
        //remaining left half
        while(left<=mid){
            
            temp[x++]=arr[left++];
        }
        //remaining right half
        while(right<=high){
            temp[x++]=arr[right++];
        }
        //copying elements to original array
        for(int i=0, j=low;i<temp.length;i++,j++){
            arr[j]=temp[i];
        }
    }
    public static void divide(int arr[],int low, int high){
        if(low>=high){
            return;
        }
         int mid=(low+high)/2;
         divide(arr, low, mid);
         divide(arr, mid+1, high);
         merge(arr, low, mid, high);
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        divide(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
}
