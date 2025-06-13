package DSA.Binary_Search;
/* {1,1,2,2,3,3,4,5,5,6,6} ---> o/p=4 
 * (even,odd)->left half
 * (odd,even)->right half 
*/
//O(logN)
public class SingleInSorted {
    public static int findSingle(int ar[],int low,int high){
        while(low < high){
            int mid=(high+low)/2;
            //check if mid is at even index
            if(mid%2 == 1){
                mid--; 
            }
            if(ar[mid] == ar[mid+1]){
                low=mid+2;//skip same pair elements
            }
            else{
                high=mid;
            }
        }
        return ar[low];
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int n=nums.length;
        int singleElement = findSingle(nums,0,n-1);
        System.out.println("The single element is: " + singleElement);
    }
    
}
