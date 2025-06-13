package DSA.Array;

import java.util.HashMap;

/*Find no of sub arrays with XOR = K
 * eg. for elements 4,2,2,6,4
 * let xor of 1st element 4=x
 * rem 2,2,6 has xor of K
 * therefore for all 4,2,2,6--> x ^ K= XR
 * multiply both sides by K, we know K^K=0
 * Therefore, x = XR ^ K, 
 * find if x exits in hashmap, if it does then Xor K subarray exits
 */
public class SubarraysWithXorK {
//O(NlogN)-TC and O(N)-SC
    public static int countSubarrayXorK(int ar[],int k){
        int n=ar.length;
        int XR=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int c=0;
        mp.put(XR, 1); //set value of 0 as 1
        for(int i=0;i<n;i++){
            XR = XR ^ ar[i];
            int x=XR ^ k;

            //if x appears, c++
            if(mp.containsKey(x)){
                c += mp.get(x); //add count
            }
            if(mp.containsKey(XR)){
                mp.put(XR, mp.get(XR) + 1);
            }
            else{
                mp.put(XR, 1);
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = countSubarrayXorK(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);   
    }
    
}
