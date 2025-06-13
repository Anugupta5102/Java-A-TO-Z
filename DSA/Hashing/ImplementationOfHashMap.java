package DSA.Hashing;
/*put, get, containsKey,remove,size,keySet --------->O(1) */
import java.util.ArrayList;
import java.util.LinkedList;
public class ImplementationOfHashMap {
    /* Array of Linked list 
     * Hash function(HashCode()) internally take key as input and gives the index of array(bucket) to store key,val
     * n(nodes) and N(array size)--no of buckets
     * n/N=lamda--->load factor , lambda<=k(constant threshold value)
     * if lambda increass, then do RE-HASHING--->increase size of array(buckets)
     */
// average TC=O(size of LL)
     static class HashMap<K,V> {//<..> is called generics where K,V,...=any data type 
        //linked list structure
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }

        private int n;//no of nodes(k,v) in LL
        private int N;//no of buckets in array
        private LinkedList<Node> buckets[];//array of linked list

        @SuppressWarnings("unchecked")
        //create constructor of class
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];//initialize array with empty LL 
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }

        private int hashFunction(K key){ // 0 to N-1
            int bi=key.hashCode(); // bi= bucket index & hashCode() return integer code +/-
            return Math.abs(bi) % N; //abs-->returns only + values and value of bi should lie [0,N-1] therefore take rem
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll =buckets[bi];
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key.equals(key)){
                    return i;//di
                }

            }
            return -1; //key not present
        }

        @SuppressWarnings("unchecked")
        //if lambda > k, then rehash
        private void reHash(){
            LinkedList<Node> oldBucket[]=buckets;
            buckets=new LinkedList[N*2];//increase size of array
            N=N*2;//update no of buckets
            for(int i=0;i<N*2;i++){
                buckets[i]=new LinkedList<>();
            }
            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node> ll=oldBucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
// O(lambda)
        public void put(K key,V value){
            int bi=hashFunction(key);
            int di=searchInLL(key, bi);//data index-->index inside LL
            
            if(di == -1){ //key not exits
                buckets[bi].add(new Node(key, value)); //add key at bi and inside LL 
                n++; //increse size
            }
            else{ //key already exits , then update
                Node node=buckets[bi].get(di);
                node.value=value;//update
            }
            //calculate lambda
            double lambda = (double)n/N;
            if(lambda > 2.0){ //k=2.0 ie threshold value
                reHash();
            }
        }

        public boolean containsKey(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key, bi);//data index-->index inside LL
            
            if(di == -1){ //key not exits
               return false;
            }
            else{ //key already exits , then update
                return true;
            }
        }

        public V remove(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key, bi);//data index-->index inside LL
            
            if(di == -1){ //key not exits
                return null;
            }
            else{ //key already exits , then update
                Node node=buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public V get(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key, bi);//data index-->index inside LL
            
            if(di == -1){ //key not exits
               return null;
            }
            else{ //key already exits , then update
                Node node=buckets[bi].get(di);
                return node.value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys=new ArrayList<>();

            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        } 
     }

     public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);
        ArrayList<String> keys = map.keySet();
        for(int i=0; i<keys.size(); i++) {
        System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
        
        map.remove("India");
        System.out.println(map.get("India"));
        }
        
    
}
