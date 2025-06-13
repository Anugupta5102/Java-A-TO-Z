package DSA.BinaryTree;
import java.util.ArrayList;
import java.util.List;
public class LeftView {
        // reverse preorder(rlr) recursive
        // first node from left
        public List<Integer> left(Node root){
            List<Integer> ans=new ArrayList<>();
             leftSide(root, ans, 0);
             return ans;
        }
        public void leftSide(Node curr,List<Integer> ans, int level){
            if(curr == null){
                return;
            }
            if(level == ans.size()){
                ans.add(curr.data);
            }
            leftSide(curr.left, ans, level + 1);//first left child
            leftSide(curr.right, ans, level + 1);
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
    
            LeftView obj = new LeftView();
            List<Integer> ans = obj.left(root);
    
            // Print the result
            System.out.println("Left view:");
            for (int node : ans) {
                System.out.print(node + " ");
            }
        }
    }
