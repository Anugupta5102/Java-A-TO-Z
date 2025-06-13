package DSA.Binary_Search;
/*Given :'n'-flower, ar[i]-On ith day flower will bloom,
*Given:  k=min flower req, m=no. of bqt needed
 *pick adjacent bloom flowers to make bouquet
 *  Find the minimum number of days required to make at least ‘m' bouquets each containing 'k' roses. 
 * Return -1 if it is not possible.
 */
public class MinDaysToMakeBouquets {
    public static boolean canMakeBouquets(int bloomDay[],int day,int m,int k ){
       int n=bloomDay.length;
       int c=0;
       int bq=0;
       //count no of bqt
       for(int i=0;i<n;i++){
        if(bloomDay[i] <= day){
            c++;
        }
        else{
            bq += (c/k); //count adjacent/consecutives
            c=0;//start again
        }
       }
       bq += (c/k);
       return bq >= m;
    }
    public static int minDays(int bloomDay[],int k,int m){
        long val=(long)m*k;
        int n=bloomDay.length;
        if(val > n) return -1; //impossible case
        int min=Integer.MAX_VALUE; 
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min, bloomDay[i]);
            max=Math.max(max, bloomDay[i]);
        }
        //apply bs
        while (min<=max) {
            int mid=(min+max)/2;
            if(canMakeBouquets(bloomDay, mid, m, k)){
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return min;
    }

    //O(log(max(arr[])-min(arr[])+1) * N)
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        int ans = minDays(arr, k, m);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);
    }
}
    

