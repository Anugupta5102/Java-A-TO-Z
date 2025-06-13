package DSA.Array;

import java.util.ArrayList;
//O(N*M)-TC    and    O(N)-SC
public class Spiral {
    /*right->bottom->left->top  repeat 
    left=0,right=m-1,top=0,bottom=n-1
    *while(top<=bottom && left<=right){
     * 1. left->right, a[top][i],top++    =>right
     * 2. top->bottom, a[i][right],right--   =>bottom
     * 3. right->left, a[bottom][i], bottom--    =>left
     * 4. bottom->top, a[i][left], left++     =>top
     * }
    */
    public static ArrayList<Integer> printSpiral(int mat[][]){
        ArrayList<Integer> ans=new ArrayList<>();
        //top as starting row index, 
        //bottom as ending row index
        // left as starting column index, 
        // right as ending column index.

        int n=mat.length;//row
        int m=mat[0].length;//col
        int left=0,top=0;
        int right=m-1,bottom=n-1;
        while(left<=right && top<=bottom){
            //move left to right
            for(int i=left;i<=right;i++){
                ans.add(mat[top][i]);
            }
            top++;//move to next row

            //move top to bottom
            for(int i=top;i<=bottom;i++){
                ans.add(mat[i][right]);
            }
            right--;
            if(top<=bottom){//check if single row
            //move right to left
            for(int i=right;i>=left;i--){
                ans.add(mat[bottom][i]);
            }
            bottom--;
        }
        if(left<=right){//check if single col 
            //move bottom to  top
            for(int i=bottom;i>=top;i--){
                ans.add(mat[i][left]);
            }
            left++;
        }
        }
        return ans;

    }
    public static void main(String[] args) {
        int mat[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
       
        ArrayList<Integer> spiral=printSpiral(mat);
        for(int i=0;i<spiral.size();i++){
            System.out.print(spiral.get(i) + " ");
        }
        System.out.println();
        
        
    }

}
