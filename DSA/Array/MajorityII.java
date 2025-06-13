package DSA.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * MajorityII > floor(n/3)--> eg n=8 then 8/3=2 then ar[i]>2--> =3
 * max 2 elements can be there
 * Brute--->O(N^2)--->linear seach and count
 * Better--->O(NlogN)=TC and O(N)=SC---->HashMap
 * Optimal--->O(N)+O(N)=TC and O(1)=SC---->Moores voting algo
 */
public class MajorityII {
    public static List<Integer> findMajority(int ar[]){
        int n=ar.length;
        int c1=0,ele1=Integer.MIN_VALUE;//for 1st element
        int c2=0,ele2=Integer.MIN_VALUE;//for 2nd element
        for(int i=0;i<n;i++){
            if(c1 == 0 && ar[i] != ele2){
                c1=1;
                ele1=ar[i];
            }
            else if(c2 == 0 && ar[i] != ele1){
                c2=1;
                ele2=ar[i];
            }
            else if(ele1 == ar[i]){
                c1++;
            }
            else if(ele2 == ar[1]){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        //check again if elements are majority
        List<Integer> ans=new ArrayList<>();
        int cnt1=0,cnt2=0;
        int min=Math.floorDiv(n, 3)+1;//given condition

        for(int i=0;i<n;i++){
            if(ele1 == ar[i]) cnt1++;
            if(ele2 == ar[i]) cnt2++;
        }
        if(cnt1 >=min) ans.add(ele1);
        if(cnt2 >= min) ans.add(ele2);
        //Collections.sort(ans);-->O(1)
        return ans;
        }
        public static void main(String[] args) {
            int ar[]={11,33,33,11,33,11};
            List<Integer> ans = findMajority(ar);
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i) + " ");
            }
            System.out.println();
        }
        
    }

    
