package DSA.Binary_Search;
public class TotalNoOccur {
    public static int FirstOccur(int arr[],int s,int e,int key){
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(key == arr[mid]){
                ans=mid;
                e=mid-1;
            }
            else if(key < arr[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
              
    }
    public static int LastOccur(int arr[],int s,int e,int key){
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(key == arr[mid]){
                ans=mid;
                s=mid+1;
            }
            else if(key < arr[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
              
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,3,3,3,3,3,4,4,5,5,6};
        int n=arr.length;
        int key=3;
        int f=FirstOccur(arr, 0, n-1, key);
        int l=LastOccur(arr, 0, n-1, key);
        int total=(l - f)+1;
        System.out.println("Total occurences: "+ total);

        
    }
}
