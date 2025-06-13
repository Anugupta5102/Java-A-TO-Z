package DSA.Array;
//O(N*N)+O(N*N)-TC    O(1)-SC
public class Rotate90deg {
    public static void rotate(int ar[][],int n){
        //transpose of matrix
      /*   int temp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[i][j]=ar[j][i];
            }
        }
        return temp;
    */
    //1. transpose-->row becomes column, diagonal remain at their place
    
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp;
                temp=ar[i][j];
                ar[i][j]=ar[j][i];
                ar[j][i]=temp;
            }
        }
    //2. reverse each row(swap)
    for(int i=0;i<n;i++){
        for(int j=0;j<n/2;j++){
            int temp;
            temp=ar[i][j];
            ar[i][j]=ar[i][n-1-j];
            ar[i][n-1-j]=temp; 
        }
    }

    
}
    public static void main(String[] args) {
        int ar[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9,}};
        int n=3;
        rotate(ar, n);
        System.out.println("Rotated image: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ar[i][j]+ " ");
            }
            System.out.println();
        }
        
    }
}
