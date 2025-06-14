package DSA.BinaryTree;

public class sumOfNodes {
    static class Node{
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
        public static Node build(int node[]){
            idx++;
            if(node[idx]==-1){
                return null;
            }
            Node newNode=new Node(node[idx]);
            newNode.left=build(node);
            newNode.right=build(node);
            return newNode;
        }
    }
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftnode=sum(root.left);
        int rightnodes=sum(root.right);
        return leftnode+rightnodes+ root.data;
    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree t=new BinaryTree();
        Node root=t.build(node);
        System.out.println("Sum of nodes: "+sum(root));

    }
}
