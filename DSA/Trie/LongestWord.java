package DSA.Trie;
/* find longest word such that every prefix of it is in word dictionary 
* if more than 1 word exits then, print word that comes first in lexicographical order
* if no prefix--> return empty string
*/
public class LongestWord {
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

    public static String ans=" ";

    public static void longest(Node root, StringBuilder temp){
        if(root == null){
            return;
        }
        for(int i=0;i<26;i++){
            if(root.children[i] != null && root.children[i].eow == true){
                temp.append((char)(i+'a'));//convert int to char
                if(temp.length() > ans.length()){
                    ans=temp.toString();
                }
                longest(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);//backtrack
            }
        }
    }
    public static void main(String[] args) {
        String word[]={"a","banana","app","appl","ap","apply","apple"};
        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }
        longest(root, new StringBuilder(" "));
        System.out.println("Longest word is: "+ ans);
    }
}
