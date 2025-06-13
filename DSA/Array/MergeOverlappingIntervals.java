package DSA.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*array of Sub intervals(a,b) are given--->merge overlapping and return non-overlapping*/
public class MergeOverlappingIntervals {
    public static List<List<Integer>> mergeOverlapping(int ar[][]){
        int n=ar.length;
        Arrays.sort(ar,new Comparator<int[]>(){
            public int compare(int a[], int b[]){
                return a[0]-b[0];//sort given intervals
            }
            
        });
        List<List<Integer>> ans =new ArrayList<>();
        for(int i=0;i<n;i++){
            //if the current interval does not lie in the last interval:
            if(ans.isEmpty() || ar[i][0] > ans.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(ar[i][0],ar[i][1]));
            }
            //if current interval lies in last interval
            else{
                ans.get(ans.size()-1).set(1, Math.max(ans.get(ans.size()-1).get(1), ar[i][1]));
            }
        }
        return ans;
    }
//O(NlogN)+O(N)
        public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        List<List<Integer>> ans = mergeOverlapping(arr);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();
    }
}
