package DSA.Array;
//O(N)
public class MaxProductSubarray {
    public static int maxProduct(int ar[]){
        int n=ar.length;
        int prefix=1;// multiplying from start
        int suffix=1;//multiplying from end
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(prefix == 0) prefix=1; //when encountered zero skip, and start new subarray
            if(suffix == 0) suffix=1;// since 0 * n = 0
            prefix = prefix * ar[i];
            suffix =suffix * ar[n-i-1];
            ans=Math.max(ans, Math.max(prefix, suffix));
        }
        return ans;
    }
    public static void main(String[] args) {
         int ar[]={-2,3,-4,0};
         int ans=maxProduct(ar);
         System.out.println("Max product subarray is:" + ans);
    }    
}
