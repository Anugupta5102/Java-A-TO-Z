package searchSort;
//O(logn)
public class BinarySearch {
    public static int binary(int ar[],int start,int end, int key){
        
        while(start<=end){
            int mid=(start+end)/2;

            if(ar[mid] == key){
                return mid;
            }
            else if(key > ar[mid]){
                start=mid+1;
            }
            else{//key < ar[mid]
                end=mid-1; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int ar[]={10,15,30,35,40,55};
        int n=ar.length;
        int key=20;
        int idx=binary(ar,0, n-1,key);
        if(idx == -1){
            System.out.println("Key not found: " + idx);
        }
        else{
        System.out.println("Key found at: "+ idx);
        }
    }
}
