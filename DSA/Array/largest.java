package DSA.Array;

public class largest {
    public static void main(String[] args) {
        int arr[]={3,2,1,5,2};
        //can also sort and then print largest or smallest
        int n=arr.length;
        int max=arr[0];
        //O(n)
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
            System.out.println("Largest element: " + max);
        }

    }
