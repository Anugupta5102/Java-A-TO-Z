package recursion;

import java.util.ArrayList;

public class SubsetNno {
    public static void findSubset(int n,ArrayList<Integer> set){
        if( n==0){
            System.out.println(set);
            return;
        }
        //include
        set.add(n);
        findSubset(n-1, set);
        //exclude
        set.remove(set.size()-1);
        findSubset(n-1, set);
    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> set=new ArrayList<>();
        findSubset(n, set);
        for(int i=0;i<set.size();i++){
            System.out.print(set.get(i)+" ");
            System.out.println();
        }

        
    }
}
