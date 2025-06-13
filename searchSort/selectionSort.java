package searchSort;
//O(n^2)-tc
public class selectionSort {
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int t=arr[min];
            arr[min]=arr[i];
            arr[i]=t;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
