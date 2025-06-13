package DSA.BinaryTree;
import DSA.BinaryTree.heightOfTree.Node;
//  Balanced = Math.abs(leftH-rightH) <= 1 
//O(N)
public class BalanceTree {
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftH=height(root.left);
        if(leftH == -1) return -1;
        int rightH=height(root.right);
        if(rightH == -1) return -1;
        if(Math.abs(rightH - leftH) > 1)  return -1;

        return Math.max(leftH, rightH)+1;
    }
    public static boolean check(Node root){
        return height(root) != -1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        if(check(root)){
            System.out.println("Balanced tree");
        }
        else{
            System.out.println("Unbalanced tree");
        }
    }

    
}
