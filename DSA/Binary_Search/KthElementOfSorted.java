package DSA.Binary_Search;

public class KthElementOfSorted {
    /*same conceot as median
     * k elements on left and n-k on right
     * find kth element from left
      */
      public static int findKth(int ar1[],int ar2[],int k){
        int n1=ar1.length;
        int n2=ar2.length;
        if(n1 > n2) return findKth(ar2, ar1, k);
        int len=n1+n2;
        int left=k;

        int low=Math.max(0,k-n2);
        int high=Math.min(k, n1);
        while (low<=high) {
            int mid1=(low+high)/2;
            int mid2=left-mid1;
            int l1=(mid1 > 0) ? ar1[mid1-1] : Integer.MIN_VALUE;
            int l2=(mid1 > 0) ? ar2[mid2-1] : Integer.MIN_VALUE;
            int r1=(mid2 < n1) ? ar1[mid1] : Integer.MAX_VALUE;
            int r2=(mid2 < n1) ? ar2[mid2] : Integer.MAX_VALUE;
            //valid symmetry
            if(l1<=r2 && l2<=r1){
                return Math.max(l1, l2);
            }
            else if(l1 > r2){
                high=mid1-1;
            }
            else{
                low=mid1+1;
            }
        }
        return 0;

      }
      public static void main(String[] args) {
        int[] a = {1, 4, 7, 10, 12,18};
        int[] b = {2, 3, 6, 15};
        int k=5;
        System.out.println("The "+k+"th element of sorted arrays is " + findKth(a, b, k));
    }
    
}
