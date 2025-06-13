package DSA.Binary_Search;

public class pivotElement {
    //sorted and rotated array is given
    //pivot is the min/max in graph plot
    //use binary search
    public static int getPivot(int arr[],int n){
        int s=0;
         int e=n-1;
         while(s<e){
            int mid=(s+e)/2;
            if(arr[mid] >= arr[0]){
                s=mid+1;
            }
            else{
                e=mid;
            }               
        }
        return s;
    }
    public static void main(String[] args) {
        int arr[]={8,10,17,1,3};// min =1 ; index = 3
        int n=arr.length;
        int ans=getPivot(arr, n-1);
        System.out.println("Pivot element is at : " + ans);
    }

}
