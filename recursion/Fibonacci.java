package recursion;

public class Fibonacci {
    public static int printFib(int n){
        if(n<=1){
            return n;
        }
        else{
            return printFib(n-1) + printFib(n-2);
        }
    }
    public static void main(String[] args) {
        int n=5;
        
        System.out.println("Fibonacci series upto: " + n + " terms is: ");
        for(int i=0;i<n;i++){
            System.out.print(printFib(i) + " ");
        }
    }
}
