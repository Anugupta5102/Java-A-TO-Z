package DSA.Array;

import java.util.Arrays;

public class Two2SumOptimal {
    //just check for target sum
    /*Use 2 pointers for optimal approach---> O(N) */
    public static String sum(int ar[], int target){
        int n=ar.length;
        Arrays.sort(ar);//asc order---->increasingly
        int left=0;
        int right=n-1;
        while(left<right){
            int sum=ar[left] + ar[right];
            if(sum == target){
                return "YES";
            }
            else if(sum < target){// increase
                left++;
            }
            else{// decrease
                right--;
            }
        }
        return "NO";
    }   
    public static void main(String[] args) {
        int ar[]={2,6,5,8,11};
        int target=14;
        String ans=sum(ar, target);
        System.out.println("The answer : "+ ans );
    }
}
