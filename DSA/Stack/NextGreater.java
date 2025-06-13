package DSA.Stack;
//O(2n)-TC,  O(n)-SC
import java.util.Stack;
//array is non-circular
public class NextGreater {
    /*Monotonic stack- store elements in specific order
     * next greater element for each a[i]
     * return array
     * 1. start from end, look at right
     * 2. if does not have next greater so --> -1
     * 3. back traverse, if a[i-1] < a[i], ans=a[i], push a[i-1]
     * 4. if a[i-1]>a[i], pop a[i], push a[i-1]
     */
    public static int[] nextGreater(int ar[]){
        int n=ar.length;
        int nge[]=new int[n];//next greater element array
        Stack<Integer> st=new Stack<>();
        //back traversal-->Array is non-circular
        for(int i=n-1;i>=0;i--){
            while (!st.isEmpty() && st.peek() <= ar[i]) {
                st.pop();  //remove all elements lesser than ar[i] 
            }
            if(st.isEmpty()){
                nge[i]=-1;
            }
            else{
                nge[i]=st.peek();//TOS 
            }
            st.push(ar[i]);
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
