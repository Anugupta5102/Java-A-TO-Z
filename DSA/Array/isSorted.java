package DSA.Array;

public class isSorted {
    public static boolean check(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i] >= arr[i-1]){//non-descending order
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,4,5,5};
        System.out.println(check(arr));
    }
}
