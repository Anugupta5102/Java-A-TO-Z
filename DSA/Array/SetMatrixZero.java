package DSA.Array;
public class SetMatrixZero {
    /* brute :O(N^3)- iterate, if a[i][j]=0--> mark[i] and mark[j]---->if(a[i][j]!=0), a[i][j]=-1
     * iterate once again and convert -1 to 0, if(a[i][j]==-1), a[i][j]=0
     * Better: O(2nm) & O(m+n)-SC=>create n, m size array of row[n] and col[m] and initialize 0
     * iterate m*n, if a[i][j]=0 mark row[i]=col[j]=1
     * iterate again check if row[i] || col[j](marked), then convert 1 to 0--->a[i][j]=0
     * Optimal- O(2nm)    =>  col0=0(common cell of 1st row and col)
     * row[0][i]=col[m] & col[i][0]=row[n]---->mark the row and mark col if(j!=0)
     * iterate matrix except 0th row and col and mark a[i][j]=0 if(a[0][i]==0 || a[i][0]==0)
     * if(a[0][0]==0), mark 1st row=0
     * if col0 =0, mark 1st col=0
     */
    //in-place means in that same matrix

    public static int[][] setZero(int ar[][],int n,int m ){
        int col0=1;//common cell ie first
        //1.traverse and mark 1st row,col
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ar[i][j] == 0){
                    //mark row 
                    ar[i][0]=0;
                    //mark col except 1st
                    if(j!=0){
                    ar[0][j]=0;
                    }
                    else{
                        col0 =0;
                    }
                }
            }
        }
        //2. Modify rest of the cells except 1st row ,col
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(ar[i][j] != 0){
                    //check for row and col
                if(ar[0][j]==0 || ar[i][0]==0){
                    //mark
                    ar[i][j]=0;
                }
            }
            }
        }
        //3. check and mark first row  as it is dependent on col 
        if(ar[0][0] == 0){
            for(int j=0;j<m;j++){
            ar[0][j]=0;
        }
    }
        
        //check and mark first col
        if(col0 == 0){
            for(int i=0;i<n;i++){
            ar[i][0] = 0;
        }
    }
    return ar;
        
    }
    public static void main(String[] args) {
        int n=4;
        int m=4;
        int ar[][]={{1,2,3,4},
                    {5,0,7,8},
                    {9,10,11,12},
                    {13,14,15,0}};
        int ans[][]=setZero(ar, n, m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
