package DSA.DP;

import java.util.ArrayList;

/* arr->money in house, max money rob non-adj
 *  circular house-->first and last are adjacent
 */
public class HouseRobber {
    static long rob(ArrayList<Integer> ar){
        int n=ar.size();
        long prev=ar.get(0);
        long prev2=0;

        for(int i=1;i<n;i++){
            long take=ar.get(i);
            if(i > 1){
                take += prev2;
            }
            long notTake = 0 + prev;
            long curr = Math.max(take, notTake);
            prev2=prev;
            prev=curr;
        }
        return  prev;
    }
    static long robStreet(int n,ArrayList<Integer> ar){
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();

        if(n==1) return ar.get(0);

        for(int i=0;i<n;i++){
            if(i != 0 ) a1.add(ar.get(i));

            if(i != n-1) a2.add(ar.get(i));
            
        }
        long ans1 = rob(a1);
        long ans2 = rob(a2);
    
    return Math.max(ans1,ans2);
}


public static void main(String args[]) {

  ArrayList<Integer> arr=new ArrayList<>();
  arr.add(1);
  arr.add(5);
  arr.add(1);
  arr.add(2);
  arr.add(6);
  int n=arr.size();
  System.out.println(robStreet(n,arr));

    }
    
}
