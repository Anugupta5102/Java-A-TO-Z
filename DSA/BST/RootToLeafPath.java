package DSA.BST;

import java.util.ArrayList;

/* Preorder---> root(add),left,right,remove */
public class RootToLeafPath {
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

    //print path
    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" -> ");
        }
        System.out.println();
    }

    //follows preorder
    public static void printRoot2Leaf(Node root,ArrayList<Integer> path ){
        if(root == null){
            return;
        } 
        path.add(root.data);
        //leaf node
        if(root.left == null && root.right==null){
            printPath(path);
        }
        //non-leaf nodes
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);//backtrack
    }

    public static void main(String[] args) {
        int val[]={8,5,3,6,10,11,14};
        Node root=null;
        for(int i=0;i<val.length;i++){
            root=insert(root,val[i]);
        }
        inorder(root);
        System.out.println();   

        printRoot2Leaf(root, new ArrayList<>());
    }
    
}
