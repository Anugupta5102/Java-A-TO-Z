package DSA.Stack;

import java.util.Stack;

public class NearestSmallest {
    /* same as next greater
     * start from left and look at left
     */
    public static int[] prevSmaller(int ar[]){
        int n=ar.length;
        int pse[]=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            while (!st.isEmpty() && st.peek() >= ar[i]) {
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }
            else{
                pse[i]=st.peek();
            }
            st.push(ar[i]);
        }
        return pse;
    }
    public static void main(String[] args) {
        int ar[] = {5,7,9,6,7,4,5,1,3,7};
        int[] result = prevSmaller(ar);
    
        System.out.print("Previous smallest Elements: ");
        for (int r : result) {
            System.out.print(r + " ");
        }
    }
    
}
