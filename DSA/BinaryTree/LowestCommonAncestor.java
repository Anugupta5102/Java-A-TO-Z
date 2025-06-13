package DSA.BinaryTree;

public class LowestCommonAncestor {
    //traverse left then right
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    

    @Override
        public String toString() {
            return String.valueOf(data);
        }
    }

    public static Node lowest(Node root,Node p, Node q){
        if(root == null || root == p || root == q){
            return root;
        }
        Node left=lowest(root.left, p, q);
        Node right=lowest(root.right, p, q);

        if(left == null){
            return right;
        }
        else if(right == null){
            return left;
        }
        else{ //both are !=null
            return root;
        }
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

        Node p=root.left.left.right.right;//6
        Node q=root.right.right;//7

        Node node=lowest(root, p, q);
        System.out.println("Lowest Common Ancestor of "+p+ " and "+q+ " : "+node);
    }    
}
