package DSA.Array;
public class Removeduplicates {
    public static int removeDuplicate(int arr[]){
        int n=arr.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[j] != arr[i]){
                arr[i+1]=arr[j];
                i++;
    
            }
        }
        return i+1;
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,2,2,3,3,4,5};//sorted
        int k=removeDuplicate(arr);
        System.out.println("Total count: "+ k );
        System.out.println("Unique elements after removing duplicates are:");
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
