package DSA.Array;
import java.util.ArrayList;;
public class IntersectionSorted {
    public static ArrayList<Integer> intersect(int a[], int b[],int n,int m){
        ArrayList<Integer> list=new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m){
            //traverse
            if(a[i] < b[j]){
                i++;
            }
            else if(b[j] < a[i]){
                j++;
            }
            else{
                //both elements equal
                list.add(a[i]);
                i++;
                j++;
            }
        }
        return list;

    }
    //O(N)
    public static void main(String[] args) {
        int a[]={1,2,3,3,3,4,5,6,7};
        int b[]={3,3,4,4,5,8};
        int n=a.length;
        int m=b.length;
        ArrayList<Integer> list=intersect(a, b, n,m);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ " ");
        }
    }
}
