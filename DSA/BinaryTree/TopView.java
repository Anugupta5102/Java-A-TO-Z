package DSA.BinaryTree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
//1st node on every verticals
public class TopView {
    static class Pair{
        Node node;
        int hd; //horizontal distance

        Pair(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public List<Integer> top(Node root){
        List<Integer> ans=new ArrayList<>();

        if(root == null){
            return ans;
        }
        Map<Integer,Integer> mp=new TreeMap<>();
        //Queue for BFS --> stores (vertical pos, node value)
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));

        while(!q.isEmpty()){
            Pair temp=q.poll();
            Node node=temp.node;
            int hd=temp.hd;

            if(!mp.containsKey(hd)){
                mp.put(hd, node.data);
            }
            if(node.left != null){
                q.add(new Pair(node.left, hd-1));
            }
            if(node.right != null){
                q.add(new Pair(node.right,hd+1));
            }
        }
        // Print the top view from the map
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
        root.right.right = new Node(10);
        root.right.left = new Node(9);
         TopView obj=new TopView();

         List<Integer> ans =obj.top(root);
         // Print the result
        System.out.println("Top view : ");
        for (int node : ans) {
            System.out.print(node + " ");
        }
    }
    
    
}
