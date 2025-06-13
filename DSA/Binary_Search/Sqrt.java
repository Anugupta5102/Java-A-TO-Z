package DSA.Binary_Search;

public class Sqrt {
    /* floor value of sqrt of num */
      public static int findSqrt(int n){
        int low=1;
        int high=n;
        while (low<=high) {
            int mid=(high+low)/2;
            if((mid*mid) <= n){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
      }
      public static void main(String[] args) {
        int n=28;
        int sq=findSqrt(n);
        System.out.println("square root of "+n+" :"+sq);
      }
    
}
