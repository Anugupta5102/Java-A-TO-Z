package DSA.Binary_Search;

public class RowWithMax1s {
    /*2D array, each row sorted
     * find row with max 1's
     * if 2 row or more have same ones, return smallest row index no
     * no of 1= total length-first occur/upperbound(0)/lowerbound(1)
     * 
     */
 // Function to find the first occurrence of 1 in a given row using binary search
    public static int lowerbound(int ar[],int k){
        int n=ar.length;
        int ans=n;
        int low=0;
        int high=n-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(k <= ar[mid]){
                ans=mid;
                high=mid-1;
                
            }
            else{
                low=mid+1;
            }
            
        }
        return ans;
    }

    // Function to find the row with the maximum number of 1s
    public static int findRowWithMaxOnes(int ar[][]){
        int max=0;
        int index=-1;
        int row=ar.length;
        int col=ar[0].length;
        //traverse rows
        for(int i=0;i<row;i++){
            int ones=col-lowerbound(ar[i],1);//total-first occur
            if(ones > max){
                max=ones;
                index=i;

            }

        }
        return index;
    }
    public static void main(String[] args) {
        //2D
        int ar[][] = {
            {0, 0, 0, 1},
            {0, 1, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}
        };

        int result = findRowWithMaxOnes(ar);
        System.out.println("Row with maximum number of 1s is: " + result);
    }
}

/*  ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
 */