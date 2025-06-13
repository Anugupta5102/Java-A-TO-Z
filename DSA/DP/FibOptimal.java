package DSA.DP;

public class FibOptimal {
    /*O(N)-TC, O(1)-SC */
        public static void main(String[] args) {
        int n=5;
        int prev2=0;
        int prev=1;

        for(int i=0;i<=n;i++){
            int curr=prev2+prev;
            prev2=prev;
            prev=curr;
        }
        System.out.println(prev);
    }
    
}
