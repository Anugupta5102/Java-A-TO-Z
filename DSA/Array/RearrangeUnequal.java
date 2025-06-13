package DSA.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*O(2N)-TC and O(N)-SC */
public class RearrangeUnequal {
    /* Unequal +ve, -ve */
    public static ArrayList<Integer> rearrange(ArrayList<Integer> ar){
        List<Integer> ngve=new ArrayList<>();
        List<Integer> pve=new ArrayList<>();
        int n=ar.size();
        //separate pve,nve
        for(int i=0;i<n;i++){
            if(ar.get(i)< 0){
                ngve.add(ar.get(i));
            }
            else{
                pve.add(ar.get(i));
            }
        }
        //+ are lesser
            if(pve.size() < ngve.size()){
                //fill array alternatively till +,- are equal
                for(int i=0;i<pve.size();i++){
                    ar.set(2*i, pve.get(i));//even
                    ar.set(2*i+1, ngve.get(i));//odd
                }
                //fill remaining -ve at end of array
                int idx=pve.size()*2;
                for(int i=pve.size();i<ngve.size();i++){
                    ar.set(idx, ngve.get(i));
                    idx++;
                }
            }
            //-ve are lesser
                else{
                    //fill alternatively till equal
                    for(int i=0;i<ngve.size();i++){
                        ar.set(2*i, pve.get(i));//even
                        ar.set(2*i+1, ngve.get(i));//odd
                    }
                    //fill remaining +ve at end of array
                int idx=ngve.size()*2;
                for(int i=ngve.size();i<pve.size();i++){
                    ar.set(idx, pve.get(i));
                    idx++;
                }

                }
                return ar;
            }
            public static void main(String[] args) {
                // Array Initialization
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5, 3, 4));

        ArrayList<Integer> ans = rearrange(A);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        } 
      }
  }
        
    

