package recursion;

public class strictlyincSorted {
    public static boolean check(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]< arr[i+1]){//T
            return check(arr, i+1);
        }else{
            return false;
        }
       
        }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5};
        System.out.println(check(arr, 0));        
    }
}


