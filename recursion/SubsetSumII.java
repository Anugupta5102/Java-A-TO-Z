package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//sort array to remove duplicates
public class SubsetSumII {
    //return all possible subsets-->that must not contain duplicate subsets
    public static void findSubset(int idx,int ar[],List<Integer> ds,List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for(int i=idx;i<ar.length;i++){
            if(i != idx && ar[i] == ar[i-1]) continue;//skip duplicates
            ds.add(ar[i]);
            findSubset(i+1, ar, ds, ans);
            ds.remove(ds.size()-1);
        }
    }
    public static void main(String[] args) {
        int ar[]={2,1,2};
        Arrays.sort(ar);
        List<List<Integer>> ans=new ArrayList<>();
        findSubset(0, ar, new ArrayList<>(), ans);
        System.out.println("Unique subset sum are");
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
            System.out.println();


        }
    }
}
