package DSA.DP;
/*one jump or 2 jump-->find min value of energy abs(height[i]- height[j]) req to reach 1->n */
public class FrogJump {
    /*O(n)-tc , O(1)-sc */
    public static void main(String[] args) {
        int ht[]={30,10,60,10,60,50};
        int n=ht.length;
        int prev=0;
        int prev2=0;
        for(int i=1;i<n;i++){
            int jumpTwo=Integer.MAX_VALUE;
            int jumpOne=prev + Math.abs(ht[i] - ht[i-1]);
            if(i > 1){
                jumpTwo= prev2 + Math.abs(ht[i] - ht[i-2]);
            }

            int curr=Math.min(jumpOne,jumpTwo);
            prev2=prev;
            prev=curr;
        }
        System.out.println(prev);
    }
}
