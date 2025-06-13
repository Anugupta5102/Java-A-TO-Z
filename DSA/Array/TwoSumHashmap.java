package DSA.Array;

import java.util.HashMap;
/* a+b=target, Return yes/no or return index of a,b */
/* better approach using hashmap--->O(N) */

public class TwoSumHashmap {
    public static int[] sum(int ar[],int n,int target){
        int ans[]=new int[2];//to store index
        ans[0]= ans[1]= -1;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=ar[i];
            int more=target-num;
            if(mp.containsKey(more)){
               // return "Yes";
               ans[0]=mp.get(more);
               ans[1]=i;
               return ans;
            }
            mp.put(ar[i], i);
            //mp.put(ar[i],i);
        }
        return ans;
        //return "no";
    }
    public static void main(String[] args) {
        int ar[]={2,6,5,8,11};
        int n=ar.length;
        int target=14;
        int idx[]=sum(ar,n, target);
        System.out.println("The index of 2 sum: [" + idx[0] + " , " + idx[1]+ "]");
    }
}
