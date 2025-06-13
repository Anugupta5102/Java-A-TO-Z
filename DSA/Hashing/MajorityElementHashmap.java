package DSA.Hashing;

import java.util.HashMap;

public class MajorityElementHashmap {
    /* (c > n/2)-->majority or (c > n/3)
     * Brute--> count and check-->O(N^2)
     * Better--->Hashmap(element,count)--->O(NlogN) for n/2 and O(N) for n/3
     * Optimal----->Moore's Voting algo---->O(N)
    */
    public static void majority(int a[]){
        int n=a.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        //storing elements with its count
        for(int i=0;i<n;i++){
            if(mp.containsKey(a[i])){
                mp.put(a[i], mp.get(a[i])+1);//increase count if already present
            }
            else{
                mp.put(a[i],1);
            }
        }
        //check
       for(int key: mp.keySet()){
        if(mp.get(key) > n/3){
            System.out.println(key);
        }
    }
    

}
    public static void main(String[] args) {
        int[] arr = {1,2}; //1,3,2,5,1,3,1,5,1--------->1
         majority(arr);
    }
}
