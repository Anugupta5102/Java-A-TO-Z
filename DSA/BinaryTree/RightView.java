package DSA.BinaryTree;
import java.util.*;
public class RightView {
    // reverse preorder(rlr) recursive
    // first node from right
    public List<Integer> right(Node root){
        List<Integer> ans=new ArrayList<>();
         rightSide(root, ans, 0);
         return ans;
    }
    public void rightSide(Node curr,List<Integer> ans, int level){
        if(curr == null){
            return;
        }
        if(level == ans.size()){
            ans.add(curr.data);
        }
        rightSide(curr.right, ans, level + 1);//first right side
        rightSide(curr.left, ans, level + 1);
    }
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        RightView obj = new RightView();
        List<Integer> ans = obj.right(root);

        // Print the result
        System.out.println("Right view:");
        for (int node : ans) {
            System.out.print(node + " ");
        }
    }
    
}
