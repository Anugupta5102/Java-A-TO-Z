package DSA.Array;
/*O(N+N/2)- TC and O(N)=SC */
public class RearrangeEqualPveNve {
    /* Given array of equal +ve, -ve elements.
     * rearrange them in +,-,+,-,+,- in order(note that +ve and -ve are equal)
     */
    public static int[] rearrange(int ar[],int n){
        int ans[]=new int[n];
        int pve=0;
        int ngve=1;
        for(int i=0;i<n;i++){
        if(ar[i] < 0){
            ans[ngve]=ar[i]; //place -ve in odd places
            ngve += 2; 
        }
        else{
            ans[pve]=ar[i]; //place +ve in even places
            pve += 2;
        }
    }
    return ans;
    }
    public static void main(String[] args) {
        int ar[]={3,1,-2,-5,2,-4};
        int n=ar.length;
        int res[]=rearrange(ar, n);
        System.out.println("Rearranged array: " );
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}
