package DSA.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leaders {
    /*Everthing on right should be smaller--->leader
     * Optimal-1. traverse from back
     * 2. max=0;
     * 3. if(a[i] > a[i+1])-->leader = a[i] and max=a[i]
     * 4. repeat and return leader
     */
    public static List<Integer> findLeader(List<Integer> ar){
        int n=ar.size();
        List<Integer> ans=new ArrayList<>();
        int max=0;
        for(int i=n-1;i>=0;i--){
            if(i==n){//last is always leader
                ans.add(ar.get(i));
                max=ar.get(i);
            }
            if(ar.get(i) > max){
                ans.add(ar.get(i));
                max=ar.get(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        List<Integer> ar=Arrays.asList(new Integer[]{10,22,12,3,0,6});
        List<Integer> leader=findLeader(ar);
        System.out.println("Leaders in the array are:");
        for(int i=0;i<leader.size();i++){
            System.out.print(leader.get(i)+" ");
        }
    }
    
}
