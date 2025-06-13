//Left Root Right
/*Binary tree has 0/2 children */
package DSA.BinaryTree;

public class inorder {
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
    static class BinaryTree{
        static int idx= -1;
        public static Node build(int node[]){
            idx++;
            if(idx >= node.length || node[idx]== -1){
                return null;
            }
        Node newNode=new Node(node[idx]);
        newNode.left=build(node);
        newNode.right=build(node);
        return newNode;
        }
    }
    public static void inTraversal(Node root ){
        if(root == null){
            return;
        }
        inTraversal(root.left);
        System.out.print(root.data+" ");
        inTraversal(root.right);

    }
    public static void main(String args[])
{  //O(n)
    int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; //-1 means null
    BinaryTree tree=new BinaryTree();
    Node root=tree.build(node);
    System.out.println(root.data);
    inTraversal(root);
}
}