package DSA.Binary_Search;

public class NthRoot {
    public static int nthRoot(int n,int m){
        int low=1;
        int high=m;//given no.
        while(low<=high){
           int mid=(high+low)/2;
           if(Math.pow(mid,n) == m){
            return mid;
           }
           if(Math.pow(mid, n) < m){
            low=mid+1;
           }
           else{
            high=mid-1;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n=3;
        int m=27;
        int ans=nthRoot(n, m);
        System.out.println(n+"th root of "+m+" :" + ans);
    }
}
