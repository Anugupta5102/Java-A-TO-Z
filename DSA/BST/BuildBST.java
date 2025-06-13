package DSA.BST;

public class BuildBST {
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
    //O(H)--->H is height
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.data ){
            //insert left
            root.left = insert(root.left, val);

        }
        else{
            // val > root.data
            root.right = insert(root.right, val);
        }
        return root;
        
    }
/*BST inorder taaversal---->sorted sequence */
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int val[]={5,1,3,4,6,2,7};
        Node root=null;
        for(int i=0;i<val.length;i++){
            root=insert(root,val[i]);
        }
        inorder(root);
        System.out.println();
    }
    
}
