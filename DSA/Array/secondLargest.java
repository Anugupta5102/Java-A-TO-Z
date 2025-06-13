package DSA.Array;

public class secondLargest {
    //without sorting
    public static void main(String[] args) {
        int arr[]={1,5,2,7,7,4,6};
        int n=arr.length;
        int largest=-1;
        int secondLargest=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>secondLargest && arr[i] != largest){
                secondLargest=arr[i];
            }
        }
        System.out.println("Second largest: "+ secondLargest);
    }
}
