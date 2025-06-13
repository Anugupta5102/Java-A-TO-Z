package DSA.Binary_Search;
/*Find out the least-weight capacity so that
 you can ship all the packages within 'd' days.
 *eg[1,2,3,4]-->1 represents the wt 1, 2 means wt 2.... */
public class LeastCapacityToShip {
    public static int findDaysreq(int wt[],int cap){
        int days=1;
        int load=0; 
        for(int i=0;i<wt.length;i++){
            if(load+wt[i] > cap){
                days=days+1;//move to next day
                load=wt[i];
            }
            else{
                load += wt[i];//load wt on same day
            }
        }
        return days;
    }

    public static int LeastCapacity(int wt[],int days){
        //find max->low and sum->high 
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<wt.length;i++){
            high += wt[i];//sum of ar elements
            low=Math.max(low,wt[i]);//max in arr
        }
        while (low<=high) {
            int mid=(low+high)/2;
            int numberOfDays=findDaysreq(wt, mid);
            if(numberOfDays <= days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;

    }
//O(N * log(sum(weights[]) - max(weights[]) + 1))
    public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        int ans = LeastCapacity(weights, d);
        System.out.println("The minimum capacity should be: " + ans);
    }  
}
