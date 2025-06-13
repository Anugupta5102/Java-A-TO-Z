package DSA.Array;
import java.util.*;
public class Three3Sum {
    /*find 3 different element that sum to 0(target)
     * i+j+k=0 where i!=j!=k
     * return unique triplets
     * Brute-3 loops-->i=0 to n, j=i+1 to n, k=j+1 to n--->O(N^3)=tc  and O(2)
     * Better-HashSet--2 loops--> k = target-(i+j)-->store elements b/t i and j in hashset
     * O(N^2)=TC     O(N)+
     * Optimal-3 pointer-->sort--->TC=O(Nlogn)+O(N^2) and O(1)=SC
     * i=left(constant), j=i+1, k=right(n-1)
     * while(j<k)-->if sum<0 then j++ else k--
     */
    public static List<List<Integer>> triplet(int n,int ar[]){
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(ar);
        for(int i=0;i<n;i++){
            //remove duplicates
            if(i>0 && ar[i] == ar[i-1]) continue;
            //move 2 pointer
            int j=i+1;
            int k=n-1;
            while (j<k) {
                int sum=ar[i]+ar[j]+ar[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                   List<Integer> temp=Arrays.asList(ar[i],ar[j],ar[k]);
                   ans.add(temp);
                   j++;
                   k--;
                   //skip duplicates
                   while(j<k && ar[j] == ar[j-1]) j++;
                   while(j<k && ar[k] == ar[k+1]) k--; 
                }
            }
        }
        return ans;
                
     }
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans = triplet(n, arr);
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
    

