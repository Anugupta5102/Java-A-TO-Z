package DSA.DP;
/*climb 1 or 2 stair-->total way of distinct ways 0->n */
public class ClimbingStairs {
        public static int main(String[] args) {
            int n=5;

            int prev=1;
            int prev2=1;

            for(int i=2;i<=n;i++){
                int curr=prev+prev2;
                prev2=prev;
                prev=curr;
            }
            System.out.println(prev);
            return 0;
        }
}
