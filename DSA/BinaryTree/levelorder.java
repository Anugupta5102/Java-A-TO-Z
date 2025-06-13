// tree BFS (FIFO)
package DSA.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class levelorder {
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
    
    public static void levelTraversal(Node root){
        if(root==null){
            return;
        }
       Queue<Node> q= new LinkedList<>(); 
       q.add(root);
       q.add(null);//null means to add nextLine
       while(!q.isEmpty()){
        Node curr =q.remove();//remove currnode and add its children in queue
        if(curr == null)
        {
           // We've reached the end of the current level
           System.out.println();

           // Add a marker for the next level if there are more nodes
           if (!q.isEmpty()) {
               q.add(null);
           } 
        }
        else{
            System.out.print(curr.data+" ");
            if(curr.left !=null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
       }
    }

    public static void main(String args[]){
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.build(node);
        levelTraversal(root);//bfs

    }
    
}
