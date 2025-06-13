package DSA.Binary_Search;

import java.util.Arrays;
/*min dist is b/w consecutives 
 * [1,max-min]-->range
*/
public class AggressiveCows {
    /*K cows, ar[i] stalls 
     * assign cows in stalls such that min distance b/w 2 of them is as large as possible
     * return largest min distance
    */
    public static int aggresive(int stalls[],int k){
        Arrays.sort(stalls);//sort to find consecutives
        int low=0;
        int high=stalls[stalls.length-1] - stalls[0];
       // int ans=-1;
        while ((low<=high)) {
            int mid=(low+high)/2;
            if(isPossible(stalls,k,mid)){
               // ans=mid;
                low=mid+1;//right part cuz we want max distance
            }
            else{
                high=mid-1;
            }
            
        }
        return high;//ans

    }
    public static boolean isPossible(int stalls[],int k,int dist){
        int cowCount =1;
        int lastpos=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-lastpos >= dist){
                cowCount++;
                lastpos=stalls[i];
            }
                if(cowCount==k){
                    return true;
                }
            }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={4,2,1,3,6};//5
        int ans=aggresive(arr, 2);
        System.out.println("Max possible minimum distance : "+ ans);

    }
}
