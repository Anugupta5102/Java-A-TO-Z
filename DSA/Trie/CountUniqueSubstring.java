package DSA.Trie;
/*Given string, count total unique/distinct substrings 
 * 1. find all suffixs
 * 2. create trie from suffix
 * 3. count nodes 
 * (find all unique prefix of all suffix)---> total nodes of trie = count of unique prefix
 *  trie creates a unique prefix tree
*/
public class CountUniqueSubstring {
    static class Node{
        Node children[];
        boolean eow;

        public Node(){
            children =new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    static Node root=new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx] == null){
                //add new node
                curr.children[idx]=new Node();
            }
            if(i == word.length()-1){
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }
    }

    public static boolean search(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int index=key.charAt(i)-'a';
            //Node node=root.children[index];

            if(curr.children[index]==null){ //letter not present
                return false;
            }
            if(i == key.length()-1 && curr.children[index].eow == false){ // at key last letter & no eow
                return false;
            }
            curr=curr.children[index];
        }
        return true;
        
    }

    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int c=0;
        for(int i=0;i<26;i++){
            if(root.children[i] != null){
                c += countNode(root.children[i]);//call recursively
            }
        }
        return c+1;//+1 for root-->empty string
    }

    public static void main(String[] args) {
        String s="ababa";
        for(int i=0;i<s.length();i++){
        String suffix=s.substring(i);
        insert(suffix);
        //System.out.println(suffix);
        }
        System.out.println("Unique substrings count is :" + countNode(root));
}
}
