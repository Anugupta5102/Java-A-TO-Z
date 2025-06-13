package DSA.BinaryTree;

public class Identical {
    public static boolean isSame(Node r1, Node r2){
        if(r1 == null || r2 == null){
            return r1==r2;
        }
        //preorder traverse
        return (r1.data == r2.data) && isSame(r1.left, r2.left) && isSame(r1.right, r2.right);
    }

    public class Node {
        int data;
        Node left, right;
    
        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public class BinaryTree {
        private int idx = -1;
    
        public Node build(int[] node) {
            idx++;
            if (idx >= node.length || node[idx] == -1) {
                return null;
            }
    
            Node newNode = new Node(node[idx]);
            newNode.left = build(node);
            newNode.right = build(node);
    
            return newNode;
        }
    }
    
    public static void main(String[] args) {
        int n1[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int n2[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Identical obj=new Identical();
        BinaryTree tree=obj.new BinaryTree();
        Node r1=tree.build(n1);
        tree.idx=-1; //reset the index for second tree
        Node r2=tree.build(n2);
        System.out.println("Are the trees identical? "+ isSame(r1, r2));
       
    }
    
}
