package DSA.BST;

/*
 * CASE1. leaf node--->delete, return null to parent
 * CASE2. one child---> delete, replace with child
 * CASE3. two child---->delete, replace with 
 * inorder successor ie-> right subtree--->min(leftmost)
 * OR inorder predecessor ie->left subtree-->max(rightmost)
 */
public class DeleteNode {
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
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

     public static Node delete(Node root, int val){
        if(val < root.data){
            root.left= delete(root.left, val);
        }
        else if( val > root.data){
            root.right=delete(root.right, val);
        }
        else{  //root.data==val
            //case1:leaf
            if(root.left == null && root.right == null){
                return null;
            }
            //case2. one child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            //case3. two childs
            Node is=inorderSuccessor(root.right);
            root.data = is.data;//replace
            root.right=delete(root.right, is.data);//delete
        }
        return root;
     }

     public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;//leftmost
        }
        return root;

     }
    public static void main(String[] args) {
        int val[]={5,1,3,4,6,2,7};
        Node root=null;
        for(int i=0;i<val.length;i++){
            root=insert(root,val[i]);
        }
        inorder(root);
        System.out.println();
        delete(root, 4);
        inorder(root);
        System.out.println();
        


    }
}
