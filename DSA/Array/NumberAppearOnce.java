package DSA.Array;

public class NumberAppearOnce {
    public static int count(int arr[]){
        int n=arr.length;
        int xor=0;
        for(int i=0;i<n;i++){
            xor = xor ^ arr[i];// 0 ^ 0 =0 && 0 ^ 1=1
        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[]={4,1,2,2,1,3,1,2,3,3};
        int res=count(arr);
        System.out.print("Number appearing once : " + res);
       
        
    }
}
