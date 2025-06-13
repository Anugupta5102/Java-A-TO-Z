package recursion;

public class PathsinMaze {
    /*count total paths in maze from start to end
    * move only right or down */
    public static int countPaths(int i,int j,int n,int m){
        if( i == n || j == m){//boundary conditions
            return 0;
        }
        if(i == n-1 && j == m-1){//reached end
            return 1;
        }
        int down=countPaths(i+1, j, n, m);
        int right=countPaths(i, j+1, n, m);
        return down + right;
    }
    public static void main(String[] args) {
        int n=3, m=3;
        int t=countPaths(0, 0, n, m);
        System.out.println("Total paths: " + t);
        
    }
}
