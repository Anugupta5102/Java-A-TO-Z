package searchSort;

public class bubbleSort {
    //O(n^2)
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print((arr[i]+" "));
        }
    }

    
}
