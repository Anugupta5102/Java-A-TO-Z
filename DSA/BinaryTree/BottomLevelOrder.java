package DSA.BinaryTree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//reverse level order---->O(N)
import DSA.BinaryTree.levelorder.Node;
public class BottomLevelOrder {
        public List<List<Integer>> levelOrderBottom(Node root) {
            List<List<Integer>> res=new ArrayList<>();
            if(root == null){
                return res;
            } 
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
            ArrayList<Integer> row=new ArrayList<>(); 
            int size=q.size();
            for(int i=0;i<size;i++){
                Node curr=q.remove();
                row.add(curr.data);
    
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            // Add each level at the beginning of the result list (reverse)
            res.add(0,row);  //res.add(row)-->level order
            }
            return res;
        }
        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.right = new Node(6);
    
            BottomLevelOrder traversal = new BottomLevelOrder();
            List<List<Integer>> result = traversal.levelOrderBottom(root);
    
            for (List<Integer> level : result) {
                System.out.println(level);
            }
        }
    }

