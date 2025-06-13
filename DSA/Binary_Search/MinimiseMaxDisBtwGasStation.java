package DSA.Binary_Search;
//Given sorted arr and k. place k new gas stations
//Let 'dist' be the maximum value of the distance between adjacent gas stations after adding k new gas stations.
//Find the minimum value of ‘dist’.
/* b/w any 2 stations(a,b) --> if you place n station
 * then place all at equal distance b-a/n+1----->diff section
 * eg 1,13 ---> 1,'7',13 ie 7 is at equal dist=6
 * Array is sorted
 * Better->use priority queue-->pq.top()--->return the max=>O(nlogn + klogn)-tc, O(n-1)+O(n-1)-sc
 * Optimal-> Binary search->O(n*log(Len)) + O(n)=tc, O(1)=sc
 */
public class MinimiseMaxDisBtwGasStation {
    public static int numberOfGasStnReq(int ar[],double dist){
        int n=ar.length;
        int c=0;
        for(int i=1;i<n;i++){
            int numBtw=(int)((ar[i] - ar[i-1])/dist);//computes sectors, eg 1,13-->(13-1)/6= 2 sectors
            if((ar[i] - ar[i-1]) == (dist * numBtw)){//eg diff=12, dist=6 and numbtw=2--> 12==6*2
                numBtw--;//if (n) 2 sectors then 1 gas station can be added ie (n-1)
            }
            c += numBtw;//total gas stations needed b/w each consecutive pair
        }
        return c;
    }
    public static double minMaxDistance(int ar[],int k){
        int n=ar.length;
        double low=0;
        double high=0;
        //find max dist
        for(int i=0;i<n-1;i++){
            high=Math.max(high, (double)(ar[i+1]-ar[i]));
        }
        //apply bs
        double diff=1e-6;//10^-6 (ans accepted given range)
        while (high-low > diff) {
            double mid=(low+high)/2;
            int cnt=numberOfGasStnReq(ar, mid);
            if(cnt > k){ //discard left half; cnt= no of gas stn req
                low=mid;
            }
            else{
                high=mid;
            }
        }
        return high;

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        double ans = minMaxDistance(arr, k);
        System.out.println("The answer is: " + ans);
    }
}
