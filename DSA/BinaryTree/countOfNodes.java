package DSA.BinaryTree;
public class countOfNodes {
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
        public static Node build(int n[]){
            idx++;
            if(n[idx]==-1){
                return null;
            }
            Node newNode=new Node(n[idx]);
            newNode.left=build(n);
            newNode.right=build(n);
            return newNode;

        }
    }
    public static int count(Node root) {
        if(root == null){
            return 0;
        }
        int leftnode=count(root.left);
        int rightnodes=count(root.right);
        return leftnode + rightnodes + 1; //1 for the root parent itself
        
    }
    public static void main(String[] args) {
        int n[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree t=new BinaryTree();
        Node root=t.build(n);
        System.out.println(count(root));
    }
}
