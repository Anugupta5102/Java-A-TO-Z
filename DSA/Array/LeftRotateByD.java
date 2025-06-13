package DSA.Array;
//TC- O(2N)
//SC- O(1)
public class LeftRotateByD {

    // Function to Reverse the array
    static void reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void leftRotate(int arr[], int n, int d) {

        if (n == 0) return;

        // Get the effective number of rotations:
        d = d % n;

        //step 1:
        reverse(arr, 0, d - 1);

        //step 2:
        reverse(arr, d, n - 1);

        //step 3:
        reverse(arr, 0, n - 1);
    }
    /* static void rightRotate(int arr[], int n, int d) {

        if (n == 0) return;

        // Get the effective number of rotations:
        d = d % n;

        //step 1: reverse last d elements:
        reverse(arr, n - d, n - 1);

        //step 2: reverse first (n-d) elements:
        reverse(arr, 0, n - d - 1);

        //step 3: reverse whole array:
        reverse(arr, 0, n - 1);
    } */

    public static void main(String args[]) {
        int n = 7;
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;

        System.out.println("Before rotation:");
        for (int i = 0; i < n; i++)
            System.out.print( arr[i] + " ");
        System.out.println();

        leftRotate(arr, n, d);
        System.out.println("After rotation:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}   
/* TC- O(n+d)
  SC - O(d)
 * Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of places for left rotation");
        int D=sc.nextInt();
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        System.out.println("Original array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        if(n==0){
            return;
        }
        //finding rotations required
        //if D=n, then the array rotate back to original one
        //let D=10,n=7 then 10%7=3 therefore 3 rotations required
        D=D%n;
        if(D==0){
            return;
        }
        //adding 1st D elements into list
        int temp[]=new int[D];
        for(int i=0;i<D;i++){
            temp[i]=arr[i];
        }
        //shifting left
        for(int i=D;i<n;i++){
            arr[i-D]=arr[i];
        }
        //Add temp list at last
        for(int i=n-D;i<n;i++){
            arr[i]=temp[i-(n-D)];
        }
        System.out.println("Rotated array by D places:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

 */