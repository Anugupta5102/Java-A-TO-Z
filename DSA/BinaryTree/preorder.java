// Root Left Right
package DSA.BinaryTree;

public class preorder {
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
        static int index=-1;
        public static Node build(int node[]){
            index++;
            if(node[index] == -1){
                return null;

            }
            Node newnNode=new Node(node[index]);
            newnNode.left=build(node);
            newnNode.right=build(node);
            return newnNode;


        }
    }
    public static void preTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preTraversal(root.left);
        preTraversal(root.right);
    }
public static void main(String args[])
{  //O(n)
    int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; //-1 means null
    BinaryTree tree=new BinaryTree();
    Node root=tree.build(node);
    System.out.println(root.data);
    preTraversal(root);
}
}