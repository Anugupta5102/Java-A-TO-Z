package DSA.Binary_Search;


public class SearchIn2dI {
    /*sorted matrix, search target 
     * size- n*m; n=row and m=col
     * Flatten 2D--->1D(hypothetically), then apply BS
     * row= index / col
     * col= index % col
    */
    public static boolean search(int ar[][],int target){
        int row=ar.length;
        int col=ar[0].length;
        //bs
        int low=0;
        int high=(row*col-1);
        while (low<=high) {
            int mid=(low+high)/2;
            //find (a,b) co-ordinates of 2D
            int r= mid/col;
            int c= mid%col; 
            
            if(ar[r][c] == target){
                return true;
            }
            else if(target < ar[r][c]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        //2D
        int ar[][] = {
            {3, 4, 7, 9},
            {12, 13, 16, 18},
            {20, 21, 23, 29}
        };
        int target =21;

        boolean result = search(ar,target);
        if(result){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }
    }
}
    
