package DSA.BinaryTree;
import java.util.*;
public class RootToNode {
    //inorder
    public static boolean getPath(Node root, ArrayList<Integer> ans,int x){
        if(root == null) return false;
        ans.add(root.data);
        if(root.data == x) return true;
        if(getPath(root.left, ans, x) || getPath(root.right, ans, x)){
            return true;
        } 
        //backtrack
        ans.remove(ans.size()-1);
        return false;
    }
    public static ArrayList<Integer> find(Node root, int x){
        ArrayList<Integer> ans=new ArrayList<>();
        if(root == null){
            return ans;
        }
        getPath(root, ans, x);
        return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(7);
        root.right.left = new Node(9);

        int x=7;
        ArrayList<Integer> res=find(root,x );
        System.out.println("Root to node "+ x + " path is: ");
        for(int i : res){
            System.out.print(i+" ");
        }

    }
    
}
