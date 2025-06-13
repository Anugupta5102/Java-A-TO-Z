package DSA.Binary_Search;

public class SearchInSortedRotated {
    // first find pivot 
    // check if key lies b/w pivot---(n-1); if T apply Binary search
    //if F apply BS from arr[0]

    //find pivot
    public static int pivot(int arr[],int n){
        int s=0;
        int e=n-1;
        while (s<e) {
            int mid=(s+e)/2;
            if(arr[mid] >= arr[0]){
               s=mid+1; 
            }
            else{
                e=mid;
            }
            
        }
        return s; 
    }
    //binary search
    public static int search(int arr[],int s,int e,int key){
         
        while(s<=e){
            int mid=(s+e)/2;
            if(key == arr[mid]){
                return mid;
            }
            else if(key < arr[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
        
        }
        //search position
        public static int findPos(int arr[],int n, int key){
            int piv=pivot(arr, n);
            if(key >= arr[piv] && key <= arr[n-1]){
                return search(arr, piv, n-1, key); //right part
            }
            else{
                return search(arr, 0, piv-1, key); //left part
            }

        }
        public static void main(String[] args) {
            int arr[]={12,15,18,2,4};
            int n=arr.length;
            int key=2 ;
            int pos=findPos(arr, n, key);
            System.out.println("Key is found at index: " + pos);
        }
    }

