package DSA.Hashing;
import java.util.HashSet;
public class IntersectionOfArray {
    /* TC-O(N+M)   SC-O(N)*/
    public static void printIntersection(int a1[],int a2[]){
        int n=a1.length;
        int m=a2.length;
        HashSet<Integer> intersection=new HashSet<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(a1[i]);
        }
        for(int j=0;j<m;j++){
            if(set.contains(a2[j])){
                //c++;
                //set.remove(a2[j]);
                intersection.add(a2[j]);
        }
    }
        for(Integer s:intersection){
            System.out.print(s+" ");
        }
    }
    public static void main(String[] args) {
        int a1[]={7,3,9};
        int a2[]={6,3,9,2,9,4};
        printIntersection(a1, a2);
    }
}
