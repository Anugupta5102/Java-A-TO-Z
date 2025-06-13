package DSA.Binary_Search;

public class MinInRotatedSorted {
    public static int findmin(int ar[],int low,int high){
        int ans=Integer.MAX_VALUE;
        while(low <= high){
            int mid=(high+low)/2;
            if(ar[low] <= ar[mid]){
                ans=Math.min(ans,ar[low]);
                low=mid+1;
            }
            else{
                ans=Math.min(ans, ar[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int ar[]={4,5,6,7,0,1,2};
        int n=ar.length;
        int min=findmin(ar, 0, n-1);
        System.out.println("Minimum is: " +min);
    }
    
}
