package DSA.Stack;
import java.util.*;
//TC-O(4n), SC-O(2n)+O(n)
public class NextGreaterII {
    /* array is circular 
     * 1.double the array virtually--> 2n
     * 2. start from end and check at right,left
     * 3. i%n to find index
    */
    public static int[] nextGreater(int ar[]){
        int n=ar.length;
        int nge[]=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=2*n-1;i>=0;i--){
            while (!st.isEmpty() && st.peek() <= ar[i%n]) {
                st.pop();
            }
            if(i < n){
                if(st.isEmpty()){
                    nge[i]=-1;
                }
                else{
                    nge[i]=st.peek();
                }
            }
            st.push(ar[i%n]);
        }
        return nge;
    }
    public static void main(String[] args) {
        int ar[] = {4, 5, 2, 10, 8};
        int[] result = nextGreater(ar);
    
        System.out.print("Next Greater Elements: ");
        for (int r : result) {
            System.out.print(r + " ");
        }
    }   
}
