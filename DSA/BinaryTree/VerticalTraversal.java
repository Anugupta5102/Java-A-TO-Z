package DSA.BinaryTree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Node{
    int data;
    Node left,right;
    
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class VerticalTraversal {
    static class Pair{
        Node node;
        int hd; //horizontal distance

        Pair(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void verticalOrder(Node root){
        if(root == null){
            return;
        }
        //to store vertical order--> .....,-2,-1,0,+1,+2,....
        TreeMap<Integer, List<Integer>> mp=new TreeMap<>();//vertical,levels
        Queue<Pair> q=new LinkedList<>();//multi nodes
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair temp=q.poll();//remove
            Node node=temp.node;
            int hd=temp.hd;
            //add node value to list
            if(!mp.containsKey(hd)){
                mp.put(hd, new ArrayList<>());
            }
            mp.get(hd).add(node.data);

            //add left child in queue
            if(node.left != null){
                q.add(new Pair(node.left, hd-1));
            }
            //add right child
            if(node.right != null){
                q.add(new Pair(node.right, hd+1));
            }
            
        }
        //print
        for(Map.Entry<Integer, List<Integer>> entry : mp.entrySet()){
            for(int val : entry.getValue()){
                System.out.print(val+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);

        System.out.println("Vertical Order Traversal is:");
        verticalOrder(root);
    }
    
}
