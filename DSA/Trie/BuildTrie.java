package DSA.Trie;

public class BuildTrie {
    /*Prefix, digital search, retrieval tree 
     * node has k children; k-ary tree
     * O(L), L is the length of word--->TC for search
     * root is empty node
     * prefix not repeated. Eg app, apple; then app stored once
     * When word is ended mark EOW(end of word)
     * 256- all char & 26-alphabets
     * every node has its children array[]-->0-a, 1-b,...
    */
    static class Node{
        Node children[];
        boolean eow;

        public Node(){
            children=new Node[26];//a-z
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    static Node root=new Node();//initialize root

    public static void insert(String word){//O(L)
        for(int i=0;i<word.length();i++){
        int idx=word.charAt(i) - 'a';//find index of char
        if(root.children[idx] == null){ //char not exits
            //add new node
            root.children[idx]=new Node();
        }
        if( i == word.length()-1){
            root.children[idx].eow=true;//reached end of word
        }
        root =root.children[idx];//update root if char already exits
        }
    }
    public static void main(String args[]){

        String word[]={"the","a","there","their","any"};
        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }
    }
    
}
