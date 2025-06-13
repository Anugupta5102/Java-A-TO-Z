package recursion;

import java.util.ArrayList;
import java.util.Collections;

//O(2^N)-TC and O(N)-SC
public class SubsetSumI {
    //sum of all subsets in increasing order
    public static void printSubsetsum(int i,int sum,ArrayList<Integer> ar,int n,ArrayList<Integer> subsetsum){
        if(i==n){
            subsetsum.add(sum);
            return;
        }
        //include
        printSubsetsum(i+1, sum+ar.get(i), ar, n, subsetsum);
        //exclude
        printSubsetsum(i+1, sum, ar, n, subsetsum);
    }
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(3);
        ar.add(1);
        ar.add(2);
        int n=ar.size();
        ArrayList<Integer> subsetsum=new ArrayList<>();
        printSubsetsum(0, 0, ar, n, subsetsum);
        //sort the subsets
        Collections.sort(subsetsum);
        //print
        for(int i=0;i<subsetsum.size();i++){
            System.out.print(subsetsum.get(i)+ " ");
        }
    }
}
    
