package DSA.BinaryTree;
import java.util.*;
public class MaxWidth {
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
     static class Pair{
        Node node;
        int idx;

        Pair(Node node,int idx){
            this.node=node;
            this.idx=idx;
        }
     }
     public static int max(Node root){
        if(root == null) return 0;

        int maxi=0;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root, 0));

        while(!q.isEmpty()){
            int size=q.size();
            int minIndex=q.peek().idx;
            int first=0, last=0;

            for(int i=0;i<size;i++){
                Pair curr=q.poll();
                int currIndex= curr.idx - minIndex;//to prevent overflow
                Node node=curr.node;

                if(i==0) first=currIndex;
                if(i == size-1) last = currIndex;

                if(node.left != null){
                    q.add(new Pair(node.left, currIndex*2+1));
                }
                if(node.right != null){
                    q.add(new Pair(node.right, currIndex*2+2));
                }
            }
            maxi=Math.max(maxi, last - first + 1);
        }
        return maxi;
     }
     public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);

        int maxWidth = max(root);
        System.out.println("Maximum width of the binary tree: " + maxWidth);
    }
    
}
