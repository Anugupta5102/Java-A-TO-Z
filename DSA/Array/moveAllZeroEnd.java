package DSA.Array;

public class moveAllZeroEnd {
    //O(n)
    public static int[] moveAll(int arr[],int n){
        int j=-1;
        //find the occurence of zero
        for(int i=0;i<arr.length;i++){
                if(arr[i] == 0){
                j=i;
                break;
                }
        }
        if( j==-1){
            return arr;
        }
        //swap zero and element
        for(int i=j+1;i<arr.length;i++){
            if(arr[i] != 0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,0,2,3,2,0,0,4,5,1};
        int n=arr.length;
        int res[]=moveAll(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
        }
}
