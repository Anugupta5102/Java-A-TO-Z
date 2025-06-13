package recursion;


public class ReverseArray {
    public static void reverse(int start,int end,int ar[]){
        if(start>=end){
            return;
        }
        //swap
        int t=ar[start];
        ar[start]=ar[end];
        ar[end]=t;
        reverse(start+1, end-1, ar);

    }
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6};
        reverse(0, ar.length-1, ar);
        System.out.println("Reversed array: ");
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i] + " ");
        }
    }
}
