package DSA.BinaryTree;
public class heightOfTree {
    public static class Node{
        int data;
        Node right;
        Node left;
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
            Node newNode =new Node(n[idx]);
            newNode.left=build(n);
            newNode.right=build(n);
            return newNode;
        }
    }
    // max depth/max height--->O(N)
    public static int height(Node root){
        if (root == null){
            return 0;
        }
        int leftsub=height(root.left);
        int rightsub=height(root.right);
        return Math.max(leftsub, rightsub) + 1;//1 for the root
    }
    public static void main(String[] args) {
        int n[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.build(n);
        System.out.println(height(root));
    }
}
