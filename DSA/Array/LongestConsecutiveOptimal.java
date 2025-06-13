package DSA.Array;

import java.util.HashSet;
import java.util.Set;
//O(3*N)-TC
public class LongestConsecutiveOptimal {
    /*Use HashSet 
     * If a number, num, is a starting number, ideally, num-1 should not exist. 
     * So, for every element, x, in the set, we will check if x-1 exists inside the set. 
If x-1 exists: This means x cannot be a starting number and we will move on to the next element in the set.
If x-1 does not exist: This means x is a starting number of a sequence. So, for number, x, we will start finding the consecutive elements.
 */
public static int countLongest(int ar[]){
    int n=ar.length;
    if(n == 0){
        return 0;
    }
    int longest=1;
    //put all array elements into set
    Set<Integer> set=new HashSet<>();
    for(int i=0;i<n;i++){
        set.add(ar[i]);
    }
    //find longest sequence
    for(int it : set){
    //if 'it' is starting number-->start does not have a prev value
        if(!set.contains(it-1)){
            //find consecutives
            int count=1;
            int x=it;
            while (set.contains(x+1)) {
                x=x+1;
                count++;
                
            }
            longest=Math.max(count, longest);
    }
}
return longest;
}
public static void main(String[] args) {
    int ar[]={100,200,1,2,3,4};
    int ans=countLongest(ar);
    System.out.println("The longest consecutive sequence is: "+ans);
}
}

