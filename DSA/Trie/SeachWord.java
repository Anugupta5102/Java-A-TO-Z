package DSA.Trie;


public class SeachWord {
    /*O(L)-TC */

    //trie  structure
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
    public static void main(String[] args) {
        String word[]={"the","a","there","their","any"};
        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }
        System.out.println(search("their"));
        System.out.println(search("thor"));
        System.out.println(search("the"));

        
    }
}
