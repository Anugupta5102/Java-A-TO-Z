package DSA.BinaryTree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//spiral order
import DSA.BinaryTree.levelorder.Node;;
public class ZigZagTraversal {
    //left->right-> left->....(level order)
    public List<List<Integer>> zigzag(Node root){
        List<List<Integer>> res=new ArrayList<>();
        if(root == null){
            return res;
        }
        //modified level order
        Queue<Node> q=new LinkedList<>();
        q.add(root);

        //flag to determine direction L->R(false), R->L(true)
        boolean leftToRight=true;

        while(!q.isEmpty()){
            int levelSize=q.size();
            List<Integer> row=new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                Node node=q.poll();//remove
                row.add(node.data);

                if(node.left != null) q.add(node.left);
                if(node.right != null)  q.add(node.right);
            }
            if(!leftToRight){
                Collections.reverse(row);
            }
            res.add(row);
            leftToRight = !leftToRight; //toggle direction
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

        ZigZagTraversal traversal = new ZigZagTraversal();
        List<List<Integer>> result = traversal.zigzag(root);

        for (List<Integer> level : result) {
            System.out.println(level);
    }
}   
}
