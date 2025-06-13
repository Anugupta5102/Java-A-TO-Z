package DSA.Binary_Search;

public class FirstandLastOccur {
    //use Binary Search
    public static int FirstOccur(int ar[], int start, int end, int key){
        int ans=-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if( key == ar[mid]){
                 ans=mid;
                 end=mid-1;  //first 
                }
           else if( key < ar[mid]){ 
            end=mid-1;
           }
           else{
            start=mid+1;
                }
        }
        return ans;
        }

    public static int LastOccur(int ar[], int start, int end, int key){
        int ans=-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if( key == ar[mid]){
                 ans=mid;
                 start=mid+1;  //last
            }
           else if( key < ar[mid]){
            end=mid-1;
           }
           else{
            start=mid+1;
                }
        }
        return ans;
        }

    public static void main(String[] args) {
        int ar[]={1,2,3,3,3,3,3,3,3,4,4,5,5,5,5,6};
        int n=ar.length;
        int key=3;
        int f=FirstOccur(ar, 0, n-1, key);
        System.out.println("First occurence : " + f);
        int l=LastOccur(ar, 0, n-1, key);
        System.out.println("Last occurence : " + l);

    }
}
