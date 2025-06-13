// Given an array of positive integers, replace every element with the least greater prime number element to its right.
// If there is no prime number element to its right, replace it with -1. For instance, given the array
// [8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28],
//  [31,71,-1,31,43,43,71,-1,-1,-1,-1,-1,-1,-1]
package DSA.Array;
// Time Complexity: O(n^2) where n is the number of elements in the array.
// Space Complexity: O(1) as we are not using any extra space.
import java.util.Arrays;

class ReplaceWithLeastGreaterPrime{
    public static void main(String args[]){
        int arr[]={8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28};
        replace(arr);
        System.out.println(Arrays.toString(arr));
       // System.out.println();
    }
    //replace function
    public static void replace(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int least=-1;

            // check for right elements
            for(int j=i+1;j<n;j++){
                //prime and greater right element
                if(isPrime(arr[j]) && arr[j] > arr[i]){
                    //assign least greater prime
                    if(least == -1 || arr[j] < least){
                        least = arr[j];
                    }
                }
            }
            //replace current with least
            arr[i]=least;
        }

    }
    //check if Prime
    public static boolean isPrime(int num){
        if(num <=1) return false;

        for(int i=2;i<=Math.sqrt(num);i++){
            if(num % i == 0) return false;
        }
        return true;

    } 
}