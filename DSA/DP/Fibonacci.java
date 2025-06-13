package DSA.DP;

import java.util.Scanner;

public class Fibonacci {
    /*Tabulation O(n)-tc,O(n)-sc */
    public static int fib(int n){
        
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
       
    }
    /* Memoization : O(n)-tc,sc
    static int f(int n, int[] dp){
    if(n<=1) return n;
    
    if(dp[n]!= -1) return dp[n];
    return dp[n]= f(n-1,dp) + f(n-2,dp);
}


public static void main(String args[]) {

  int n=5;
  int dp[]=new int[n+1];
  Arrays.fill(dp,-1);
  System.out.println(f(n,dp));
  
} */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt(); 


        int result = fib(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
    
}
