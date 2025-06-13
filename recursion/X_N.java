package recursion;
public class X_N {
    public static int cal(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpow=x * cal(x, n-1);
        return xpow;
    }
    public static void main(String[] args) {
        int x=2, n=5;
        int ans=cal(x, n);
        System.out.println(ans);
    }
    
}
