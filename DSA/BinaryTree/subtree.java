package DSA.BinaryTree;

public class subtree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class BinaryTree{
        static int idx=-1;
        public static Node build(int n[]){
            idx++;
            if(n[idx]==-1)
            {
                return null;
            }
            Node newnNode=new Node(n[idx]);
            newnNode.left=build(n);
            newnNode.right=build(n);
            return newnNode;
        }
        public static void resetIndex(){
            idx=-1;
        }
    }
    public boolean isIdentical(Node root, Node subroot){
        if(root==null && subroot==null){
            return true;
        }
        if(root==null || subroot==null){
            return false;
        }
        if(root.data == subroot.data){
            return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);

        }
        return false;
    }
    public boolean isSubtree(Node root, Node subroot){
        if(subroot==null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(root.data == subroot.data){
            if(isIdentical(root, subroot)){
                return true;
            }
        }
        return isSubtree(root.left, subroot.left) || isSubtree(root.right, subroot.right);
    }
    public static void main(String[] args) {
        int n[]={1,2,3,-1,-1,4,-1,-1,5,-1,6,-1,-1};
        int sub[]={3,4,-1,-1,5,-1,-1};
        BinaryTree t=new BinaryTree();
        BinaryTree.resetIndex();
        Node root=t.build(n);

        BinaryTree.resetIndex();
        Node subroot=t.build(sub);
        
        subtree check=new subtree();
        System.out.println(check.isSubtree(root, subroot));

    }
}
