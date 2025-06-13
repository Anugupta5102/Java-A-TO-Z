package recursion;

import java.util.ArrayList;

//O(4^m*n)-TC , O(m*n)-SC
public class RatinMaze {
    
    /* rat at (0,0) has to reach at (n-1,n-1) in matrix N*N
     * find possible paths in lexicographical/sorted order
     * rat can move--> up(U),down(D),left(L),right(R)
     * 0 represents cell blocked, 1 represents rat can move
     * in path, no cell can be visited more than one time
     */
    
    public static void solve(int i,int j,int a[][],int n, ArrayList<String> ans,String move,int vis[][], int di[],int dj[]){
        if(i == n-1 && j == n-1){//reached destination
            ans.add(move);
            return;
        }
        /*right-(i,j-1) , left-(i,j+1) , up(i-1,j) , down(i+1,j) */
        String dir="DLRU";
        for(int index=0;index<4;index++){
            int nexti=i+ di[index];
            int nextj=j+ dj[index];
            //check boundary conditions
            if(nexti >= 0 && nextj >= 0 && nexti < n && nextj < n && vis[nexti][nextj] == 0 && a[nexti][nextj] == 1){
                vis[i][j]=1;//mark as visited
                solve(nexti, nextj, a, n, ans, move +" "+ dir.charAt(index), vis, di, dj);
                vis[i][j]=0;//unmark to bactrack


            }
        } 

    }
    public static ArrayList<String> findPath(int maze[][],int n){
        //initialize visited array
        int vis[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                vis[i][j]=0;
            }
        }
        //make array of directions--->DLRU
        /*right-(i,j-1) , left-(i,j+1) , up(i-1,j) , down(i+1,j) */
        
        int di[]={+1,0,0,-1};
        int dj[]={0,-1,1,0};
        ArrayList<String> ans=new ArrayList<>();
        if(maze[0][0] == 1){
            solve(0, 0, maze, n, ans, " ", vis, di, dj);
            return ans;
        }
        return ans;
    }
    
     public static void main(String[] args) {
        int n=4;
        int a[][]={
            {1,0,0,0},
            {1,1,0,1},
            {1,1,0,0},
            {0,1,1,1}
        };
        ArrayList<String> ans=findPath(a, n);
        if(ans.size() > 0){
            for(int i=0;i<ans.size();i++){
                System.out.print(ans.get(i)+" ");
                System.out.println();
            }
        }else{
            System.out.println(-1);
        }
        
    }
}
