package DSA.Binary_Search;

import java.util.Arrays;

//O(n+m)
public class SearchIn2dII {
    /* Find the co-ordinates of target
     * row sorted from left -> right
     * col sorted from top -> bottom
     * Start from 1st row and last col ar[0][m-1] OR ar[n-1][0]
     * target > ar[r][c], eliminate that row,r++
     * target < ar[r][c], eliminate that col,c--
     */
    public static int[] find(int mat[][],int target){
        int row=mat.length;
        int col=mat[0].length;
         //apply bs
         int r=0;//1st row
         int c=col-1;//last col

         //traverse
         while(r < row && c >= 0){
            if(mat[r][c] == target){
                return new int[] {r,c}; //true
            }
            else if( target < mat[r][c]){
                c--;//move left
            }
            else{
                r++;//move down
            }
         }
         return new int[] {-1,-1}; //false
    }
     public static void main(String[] args) {
        //2D
        int ar[][] = {
           {1,4,7,11,15},
           {2,5,8,12,19},
           {3,6,9,16,22},
           {10,13,14,17,24},
           {18,21,23,26,30}
        };
        int target =13;

        int result[] = find(ar,target);
        System.out.println("Target is at " + Arrays.toString(result));
        
    }
     
}
