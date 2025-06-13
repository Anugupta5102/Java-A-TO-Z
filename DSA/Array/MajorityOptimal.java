package DSA.Array;
/* element should appear more than n/2 times where n=length of array  */
public class MajorityOptimal {
    //Moore's Voting algo-------->O(N)
    /* 1. apply algo
     * 2. verify if its majority
     * only one element can be there
     */
    public static int majority(int ar[]){
         int n=ar.length;
        int c=0;//count
        int ele=Integer.MIN_VALUE;//current element

        for(int i=0;i<n;i++){
            if(c==0){
                c=1;//assume for 1st element 
                ele=ar[i];
            }
            else if(ele == ar[i]){
                c++; //same element then increase
            }
            else{
                c--; //element is different then decrease
            }
        }
        //check if element is majority
        int c1=0;
        for(int i=0;i<n;i++){
            if(ar[i] == ele){
                c1++;
            }
        }
        if(c1 > (n/2)){
            return ele;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majority(arr);
        System.out.println("The majority element is: " + ans);
    }
}
