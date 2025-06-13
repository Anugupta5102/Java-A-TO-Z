 package DSA.Binary_Search;
/*find min(max) */
public class PainterPartition {
    /*k-->painter
     * 1 unit board paint in 1 unit  time
     * paints contiguous section
     * min time to paint array?
     * eg. 5,5,5,5    K=2
     *     5 5|5 5---->10
     */
    public static int partition(int arr[],int n,int k){
        int s=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
        }
        int e=sum;
        int ans=-1;
        //use BS
        while (s<=e) {
            int mid=(s+e)/2;
            if( isPossible(arr,n,k,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            } 
        }
        return ans;
    }
    public static boolean isPossible(int arr[],int n, int k, int mid){
        int c=0;
        int painter=0;
        for(int i=0;i<n;i++){
            if(c+ arr[i] <= mid){
                c += arr[i];
            }
            else{
                painter++;
                if( painter > k || arr[i]>mid){
                    return  false;
                }
                c=arr[i];
            }  
        }
            return true;
        
    }
    public static void main(String[] args) {
        int arr[]={5,5,5,5};
        int n=arr.length;
        int res=partition(arr, n, 2);
        System.out.println("Painter partition: " + res);
        
    }
}
