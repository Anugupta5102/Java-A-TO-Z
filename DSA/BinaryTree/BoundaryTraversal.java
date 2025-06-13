package DSA.BinaryTree;

import java.util.ArrayList;
import java.util.List;

import DSA.BinaryTree.inorder.Node;
public class BoundaryTraversal {
/* anticlockwise
*left boundary excluding leaf
*leaf nodes-->inorder
*right boundary reverse excluding leaf */ 
public static boolean isLeaf(Node root){
    return root.left == null && root.right == null;
}  
public static void addLeftBoundary(Node root, ArrayList<Integer> ans){
    Node curr=root.left;
    while (curr != null) {
        if(isLeaf(curr) == false) ans.add(curr.data);
        if(curr.left != null) curr=curr.left;
        else curr=curr.right;
        
    }
} 
public static void addRightBoundary(Node root, ArrayList<Integer> ans){
    Node curr=root.right;
    ArrayList<Integer> temp=new ArrayList<>();
    while (curr != null) {
        if(isLeaf(curr) == false) temp.add(curr.data);
        if(curr.right != null) curr=curr.right;
        else curr=curr.left;  
    }
    //reverse right boundary elements
    int i;
    for(i= temp.size()-1; i>=0 ;i--){
        ans.add(temp.get(i));
    }
} 
public static void addLeaves(Node root, ArrayList<Integer> ans){
    if(isLeaf(root)){
        ans.add(root.data);
        return;
    }
    if(root.left != null) addLeaves(root.left, ans);
    if(root.right != null) addLeaves(root.right, ans);
}
public ArrayList<Integer> printBoundary(Node root){
    ArrayList<Integer> ans=new ArrayList<>();
    if(root == null) return ans;
    if(isLeaf(root) == false) ans.add(root.data);
    addLeftBoundary(root, ans);
    addLeaves(root, ans);
    addRightBoundary(root, ans);
    return ans;
}
public static void main(String[] args) {
    Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        BoundaryTraversal obj=new BoundaryTraversal();
        List<Integer> ans=obj.printBoundary(root);
        for(int val : ans){
            System.out.print(val+ " ");
        }
        System.out.println();

}

}
