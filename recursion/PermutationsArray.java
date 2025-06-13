package recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationsArray {
    //O(N!*N)-TC
    public static void permu(int idx,int ar[], List<List<Integer>> ans){
        if(idx == ar.length){
            //copy ds to ans
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<ar.length;i++){
            ds.add(ar[i]);
        }
        ans.add(new ArrayList<>(ds));
        return;
    }
    for(int i=idx;i<ar.length;i++){
        swap(i,idx,ar);
        permu(idx+1, ar, ans);
        //backtrack
        swap(i,idx,ar);
    }
    }
    public static void swap(int i,int j,int ar[]){
        int t=ar[i];
        ar[i]=ar[j];
        ar[j]=t;
    }


    /*public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(ans,new ArrayList<>(),nums);
        return ans;
    }
    public void backtrack(List<List<Integer>> ans,List<Integer> temp,int nums[]){
        if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(temp.contains(nums[i])) continue;
                temp.add(nums[i]);
                backtrack(ans, temp, nums);
                temp.remove(temp.size()-1); 
            }
        } */
    public static void main(String[] args) {
        int ar[]={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();
        permu(0, ar, ans);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i));
            System.out.println();
        }
        
    }
    
}
