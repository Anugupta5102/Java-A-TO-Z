package CollectionFrameworks.Map_Interface;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class hashmap {
    public static void main(String[] args) {
        //unique keys in sorted order
        HashMap<Integer,String> mp=new HashMap<>();// key : value
        //Map<Integer,String> mp=new HashMap<>();
        mp.put(1, "A");
        mp.put(3, "C");
        mp.put(2, "B");
        mp.put(0, "Z");
        mp.put(4, "D");
        //iteration
        for(Map.Entry<Integer,String> e : mp.entrySet()){//e is the pair element that contains <K,V>
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue());
            System.out.println();
        }
        //System.out.println(mp);
        //set of keys
        Set<Integer> keys=mp.keySet();
        for(Integer k : keys){
            System.out.println(k+" "+mp.get(k));
        }

        mp.put(4, "Anu");//overwrite
        System.out.println(mp);
        mp.putIfAbsent(4, "F");//checks then put so does not overwrite
        System.out.println(mp);
        if(mp.containsKey(3)){
            System.out.println("Present");
        }
        else{
            System.out.println("Absent");
        }
        int ar[]={12,15,18};
        for(int val : ar){   //for(int i=0;i<ar.length;i++){ sout(ar[i]);}
            System.out.println(val+" ");
        }
        System.out.println(mp.get(2));
        mp.remove(4);
        System.out.println(mp);
        System.out.println(mp.keySet());
        System.out.println(mp.values());



    }
}
