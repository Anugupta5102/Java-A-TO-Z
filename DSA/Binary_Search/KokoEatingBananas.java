package DSA.Binary_Search;
/*A monkey is given n piles of bananas,
 * An integer h is also given, =>hours
 * Find the minimum number of bananas k to eat per hour 
 * so that the monkey can eat all the bananas within h hours.
 */
//O(N)+O(logN)
public class KokoEatingBananas {
    /*low=1,high=max(a[i]) */
    public static int findMax(int ar[]){
        int n=ar.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max= Math.max(max,ar[i]);
        }
        return max;
    }
    public static int TotalHoursNeeded(int ar[],int hours){
        int totalH=0;
        int n=ar.length;
        //find total hours
        for(int i=0;i<n;i++){
            totalH += Math.ceil((double)(ar[i]) / (double)(hours) );
        }
        return totalH;
    }
    public static int minRateToEatAll(int ar[],int h){
        int low=1;
        int high=findMax(ar);
        //apply bs
        while(low<=high){
            int mid=(high+low)/2;
            int totalH=TotalHoursNeeded(ar, mid);
            if(totalH <= h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;

    }
    public static void main(String[] args) {
            int[] v = {7, 15, 6, 3};
            int h = 8;
            int ans = minRateToEatAll(v, h);
            System.out.println("Koko should eat at least " + ans + " bananas/hr.");
        }
    
    
}
