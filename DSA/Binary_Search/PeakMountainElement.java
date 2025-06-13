package DSA.Binary_Search;
public class PeakMountainElement {
/*                    /\
                     /  \ 
                    /    \
                  s        e                     */

    //binary search

    public static void main(String[] args) {
        PeakMountainElement obj=new PeakMountainElement();
        int arr[]={3,4,5,1};// ans=2
        int n=arr.length;
        int ans=obj.peakElement(arr, 0, n-1);
        System.out.println("Peak element: " + ans);
        
    }
    public  int peakElement(int arr[],int s,int e){
        while(s<e){
        int mid=(s+e)/2;
        if(arr[mid]< arr[mid+1]){
            s=mid+1;
        }
        else{
            e=mid;
        }
    }
        return s;
    }
}
