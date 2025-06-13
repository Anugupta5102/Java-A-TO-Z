package recursion;

public class towerOfHanoi {
    //O(2^n)
    public static void hanoi(String a,String b, String c, int n){
        if(n==1){
            System.out.println("Transfer disk "+ n + " from "+ a+ " to "+ c);
            return;
        } 
        hanoi(a, c, b, n-1);
        System.out.println(" Transfer disk "+ n + " from "+ a+ " to "+ c);
        hanoi(b, a, c, n-1);
        
    }
    public static void main(String[] args) {
        int n=3;
        hanoi("S", "H", "D", n);
        
    }
}
