package DSA.Hashing;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class NumMapping {
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //precompute
        HashMap<Integer, Integer> mp=new HashMap<>();//(key,value)
        for(int i=0;i<n;i++){
            int key=arr[i];
            int val=0;
            if(mp.containsKey(key)) 
                val=mp.get(key);
                val++;
                mp.put(key,val);
            
        }
        //iterate over map
        for(Map.Entry<Integer,Integer> it: mp.entrySet()){
            System.out.println(it.getKey() + "->" + it.getValue());
        }
        //query
        System.out.println("Enter query");
        int q= sc.nextInt();
        while(q-- > 0){
            int num=sc.nextInt();
            if(mp.containsKey(num))
            System.out.println(mp.get(num));
            else
            System.out.println(0);
        }

    }
    
}
