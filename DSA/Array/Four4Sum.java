package DSA.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Four4Sum {
    /*find 4 different element that sum to 0(target)
     * i+j+k+l=0 where i!=j!=k!=l
     * return unique quads 
     * brute-O(N^4)-linear
     * better-hashmap-->O(N^3)*log(M)
     * optimal- 4 pointers-->O(N^3) and O(1)
     * i=0,j=i+1(both constant),k=j+1,l=n-1(right)
     * while(k<l),k++,l--
     * */
    public static List<List<Integer>> quads(int n,int ar[],int target){
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(ar);
        //i,j are constant
        for(int i=0;i<n;i++){
            //remove duplicates
            if(i>0 && ar[i]==ar[i-1]) continue;            
            for(int j=i+1;j<n;j++){
                //remove duplicates
                if(j>i+1 && ar[j]==ar[j-1]) continue;
                //move k,l ponters
                int k=j+1;
                int l=n-1;
                while(k<l){
                    //add i+j+k+l
                     long sum=ar[i];
                     sum += ar[j];
                     sum +=ar[k];
                     sum += ar[l];
                    if(sum == target){
                    List<Integer> temp=Arrays.asList(ar[i],ar[j],ar[k],ar[l]);
                    ans.add(temp);
                    k++;
                    l--;
                    //skip duplicates
                    while (k<l && ar[k] == ar[k-1]) k++;
                    while(k<l && ar[l] == ar[l+1]) l--;
                    }
                     else if(sum < target){
                        k++;

                     }
                     else{ //(sum > target)
                        l--;

                     }
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {4,3,3,4,4,2,1,2,1,1};
        int n = arr.length;
        int target=9;
        List<List<Integer>> ans = quads(n, arr,target);
        for (int j = 0; j < ans.size(); j++) {
            List<Integer> it = ans.get(j);
            System.out.print("[");
            for (int k = 0; k < it.size(); k++) {
                Integer i = it.get(k);
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
