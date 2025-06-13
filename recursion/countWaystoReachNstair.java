package recursion;
//climb stairs
public class countWaystoReachNstair {
    public static int countWays(int n){
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 2;
        }
        int count=countWays(n-1) + countWays(n-2);
        return count;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(countWays(n));
        
    }
}
