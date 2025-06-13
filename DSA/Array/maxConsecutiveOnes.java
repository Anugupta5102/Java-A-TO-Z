package DSA.Array;

public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1,0,0,1,1};
        int max=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                c=c+1;
            }
            else{
                c=0;
            }
            max=Math.max(max, c);
        }
        System.out.println("Maximum ones: "+ max);

    }
}
