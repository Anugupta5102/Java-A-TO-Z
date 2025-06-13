package DSA.Array;


public class MissingNum {
    //Approch 1 (better)
    //0(n)
    public static int missing(int arr[],int n1) {
        // 0^0=0 && 0^1=1 ; 0^n=n
        int xor1=0;
        int xor2=0;
        for(int i=0;i<n1-1;i++){
             xor2=xor2 ^ arr[i];//array elements
             xor1=xor1 ^ (i+1);// [1....N-1]
        }
        xor1=xor1 ^ n1;//upto [1...N]
        return (xor1 ^ xor2);//missing no
    }
    //approach 2
    //O(n)
    public static int missNum(int arr2[],int n2){
        int sum=(n2 *(n2+1))/2;//sum of n natural no
        int s2=0;
        for(int i=0;i<n2-1;i++){
            s2 += arr2[i];
        }
        int res=sum - s2;
        return res;

    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int arr2[]={1,2,3,5};
        int n1=5;//largest number in array
        int ans=missing(arr, n1);
        System.out.println("missing number: "+ ans);
        System.out.println();
        int n2=5;
        int m=missNum(arr2, n2);
        System.out.println("missing number: "+ m);


    }
}
