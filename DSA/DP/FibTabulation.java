package DSA.DP;

import java.util.Scanner;

public class FibTabulation {
        /*Tabulation */
        public static int fib(int n){
    
            /*O(n)-tc,O(n)-sc */
            int dp[]=new int[n+1];
            dp[0]=0;
            dp[1]=1;
    
            for(int i=2;i<=n;i++){
                dp[i]=dp[i-1]+dp[i-2];
            }
            return dp[n];
           
        }
         public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt(); 


        int result = fib(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }

}
