package DSA.BinaryTree;

import DSA.BinaryTree.sumOfNodes.BinaryTree;
import DSA.BinaryTree.sumOfNodes.Node;

public class MaxPathSum {
    public static int maxSum(Node root){
        int max[]=new int[1];
        max[0]=Integer.MIN_VALUE;
        path(root,max);
        return max[0];
    }
    //max[] passed as reference
    public static int path(Node root,int max[]){
        if(root == null){
            return 0;
        }
        //-ve sum ignored
        int left=Math.max(0, path(root.left, max));
        int right=Math.max(0, path(root.right, max));
        max[0]=Math.max(max[0], left+right+root.data);
        return Math.max(left, right)+root.data;
    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree t=new BinaryTree();
        Node root=t.build(node);
        System.out.println("Maximum path sum: "+maxSum(root));
    }
    
}
