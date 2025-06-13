package DSA.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import DSA.BinaryTree.postorder.Node;//import structure of node

public class PostOrderUsing2Stack {
    public List<Integer> postorder(Node root){
        Stack<Node> s1=new Stack<Node>();
        Stack<Node> s2=new Stack<Node>();
        List<Integer> ans=new ArrayList<>();
        if(root == null){
            return ans;
        }
        //add root to s1
        s1.push(root);
        while(!s1.isEmpty()){
            root=s1.pop();
            //add root to s2 from s1
            s2.add(root);
            //add child of root to s1
            if(root.left != null){
                s1.push(root.left);
            }
            if(root.right != null){
                s1.push(root.right);
            }
        }
        while (!s2.isEmpty()) {
            ans.add(s2.pop().data);
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    
    PostOrderUsing2Stack post = new PostOrderUsing2Stack();
    List<Integer> result = post.postorder(root);
    
    System.out.println("Post-order Traversal: " + result);
    }
    
}
