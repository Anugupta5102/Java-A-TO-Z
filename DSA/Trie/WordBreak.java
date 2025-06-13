package DSA.Trie;
/*Given a string s and a dictionary of strings wordDict,
 return true if s can be segmented into a 
 space-separated sequence of one or more dictionary words.*/
 /*Example :
Input: s = "applepenapple", wordDict = ["apple","pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
Note that you are allowed to reuse a dictionary word. */
/*Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: false */

/*1. find all possible parts-->break one by one-->loop
 * 2. 1st part exit in trie + 2nd part(recursive call) also exits--> both true then--->true
 * 3. base case-->key.length==0, then true
 */
public class WordBreak {
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
            if(i == key.length()-1 && curr.children[idx].eow==false){
                return false;
            }
            curr =curr.children[idx];
        }
        return true;
    }

    //use recursion
    public static boolean wordbreak(String key){
        if(key.length() == 0){ // empty
            return true;
        }
        for(int i=1;i<=key.length();i++){
            String firstPart=key.substring(0, i);//break letters
            String secPart=key.substring(i);
            if(search(firstPart) && wordbreak(secPart)){//both exits-->true
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String wordDic[]={"i","like","sam","samsung","mobile"};
        String key= "ilikesamsung";
        for(int i=0;i<wordDic.length;i++){
            insert(wordDic[i]);
        }
        System.out.println(wordbreak(key));
        
    }
}
