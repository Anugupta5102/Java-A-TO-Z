package DSA.BinaryTree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;;
public class BottomView {

    static class Node {
        int data;
        Node left, right;
        int hd; // horizontal distance

        public Node(int item) {
            data = item;
            left = right = null;
            hd = 0;
        }
    }
    //last node on every verticals
    public static ArrayList<Integer> bottom(Node root){
        ArrayList<Integer> ans =new ArrayList<>();
        if(root == null){
            return ans;
        }
        Map<Integer,Integer> mp=new TreeMap<>();
        Queue<Node> q=new LinkedList<>();
        root.hd=0;
        q.add(root); 
        while(!q.isEmpty()){
            Node temp=q.remove();
            int hd=temp.hd;
            mp.put(hd, temp.data);

            if(temp.left != null){
                temp.left.hd=hd-1;
                q.add(temp.left);
            }
            if(temp.right != null){
                temp.right.hd=hd+1;
                q.add(temp.right);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(7);
        root.right.left = new Node(9);

        // Calling the bottom view method
        ArrayList<Integer> ans = bottom(root);

        // Print the result
        System.out.println("Bottom view:");
        for (int node : ans) {
            System.out.print(node + " ");
        }
    }
    
}
