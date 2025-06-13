package DSA.Trie;
/*Given prefix--> search if the prefix exits in trie */
public class StartsWith {
    static class Node{
        Node children[];
        boolean eow;

        public Node(){
            children=new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';

            if(curr.children[idx] == null){
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
            int idx=key.charAt(i)-'a';

            if(curr.children[idx] == null){
                return false;
            }
            if(i == key.length()-1 && curr.children[idx].eow == false){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }

    //just check the prefix; no need to check for eow
    public static boolean startsWith(String prefix){
        Node curr=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';

            if(curr.children[idx] == null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[]={"apple","app","mango","man","woman"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        String prefix1="app";
        String prefix2="moon";
        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));



    }
}
