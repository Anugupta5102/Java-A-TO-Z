package DSA.Hashing;
import java.util.HashSet;
public class UnionOfArray {
    /* brute-> nested loops-->O(N^2)
     * better-->sort and add unique--->O(nlogn)
     * hashSet--->O(n+m)-TC & SC 
     * TC->avg O(N)
     */
    public static void printUnion(int a1[],int a2[]){
        int n=a1.length;
        int m=a2.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(a1[i]);
        }
        for(int j=0;j<m;j++){
            set.add(a2[j]);
        }
        //int len=set.size();
        for(Integer s: set){
            System.out.print(s + " ");
        }
    }
    public static void main(String[] args) {
        int a1[]={7,3,9};
        int a2[]={6,2,9,7,3,4,9};
        printUnion(a1, a2);
    }
}
