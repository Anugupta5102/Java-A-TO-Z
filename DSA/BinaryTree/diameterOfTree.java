package DSA.BinaryTree;

public class diameterOfTree {
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
    public static class BinaryTree{
        static int idx=-1;
        public static Node build(int n[]){
            idx++;
            if(n[idx]==-1){
                return null;
            }
            Node newnNode=new Node(n[idx]);
            newnNode.left=build(n);
            newnNode.right=build(n);
            return newnNode;
        }
    }
    //dia[] passed as reference
    public static int height(Node root, int dia[]){
        if(root==null){
            return 0;
        }
        int leftheight=height(root.left,dia);
        int rightheight=height(root.right,dia);
        dia[0]=Math.max(dia[0], leftheight+rightheight);
        return Math.max(leftheight, rightheight) + 1;
    }
    public static int diameter(Node root){
        //O(N)-TC  and O(N)-SC
        int diam[]=new int[1];//to hold max diameter
        height(root, diam);
        return diam[0];
    }
    

    /* static class Treeinfo{
        int ht;
        int dia;

        Treeinfo(int ht, int dia){
            this.ht=ht;
            this.dia=dia;
        }
    }
    public static Treeinfo diametertree(Node root){
        //O(n) --> best  
        if(root == null){
            return new Treeinfo(0,0);
        }

        Treeinfo left=diametertree(root.left);
        Treeinfo right=diametertree(root.right);

        int myht=Math.max(left.ht,right.ht)+1;

        int dia1=left.dia;
        int dia2=right.dia;
        int dia3=left.ht+right.ht+1;
        int mydia=Math.max(dia3, Math.max(dia2, dia1));

        Treeinfo info=new Treeinfo(myht, mydia);
        return info;

    }
        */
    public static void main(String[] args)
     {
        int n[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.build(n);
        System.out.println("Diameter of the tree: " + diameter(root));

    }
}
