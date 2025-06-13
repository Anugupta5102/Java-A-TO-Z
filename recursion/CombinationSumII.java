package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//sort the array
//find subsequence and then select unique combinations
//elements picked once, sorted dictionary/lexicographical order
public class CombinationSumII {
    public static void findCombinations(int index,int ar[],int target,List<List<Integer>> ans,List<Integer> current){
        if(target==0){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i=index;i<ar.length;i++){
            if(i > index && ar[i] == ar[i-1]) continue; //skip duplicates
            if(ar[i] > target) break;

            current.add(ar[i]);
            findCombinations(i+1, ar, target - ar[i], ans, current);
            current.remove(current.size()-1); //remove last element to backtrack
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5}; 
        int target = 8;
        Arrays.sort(arr); 

        List<List<Integer>> result = new ArrayList<>();//empty DS
        findCombinations(0,arr, target, result, new ArrayList<>());

        // Print all combinations
        System.out.println("Unique Combinations that sum up to " + target + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
        
}
    

