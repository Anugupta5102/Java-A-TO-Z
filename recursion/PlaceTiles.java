package recursion;

public class PlaceTiles {
    /*tiles size- 1*m
     * floor size- n*m
     */
    public static int countWays(int n,int m){
        if( n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        int vertical=countWays(n-m, m);
        int horizontal=countWays(n-1, m);

        return vertical+horizontal;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        int t=countWays(n, m);
        System.out.println("Total ways to place tiles: " + t);
    }
}
