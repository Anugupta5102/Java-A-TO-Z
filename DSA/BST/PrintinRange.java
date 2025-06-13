package DSA.BST;
/* X....Y
 * 1. X <= root < Y---->left and right
 * 2. X > root--- >right
 * 3. y < root--> left
 * 
 */
public class PrintinRange {
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
    //O(H)--->H is height
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.data ){
            //insert left
            root.left = insert(root.left, val);

        }
        else{
            // val > root.data
            root.right = insert(root.right, val);
        }
        return root;
        
    }
/*BST inorder taaversal---->sorted sequence */
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void printRange(Node root,int x,int y){
        if(root == null){
            return;
        }
        if(x <= root.data && y >= root.data ){
            printRange(root.left, x, y);
            System.out.print(root.data+" ");
            printRange(root.right, x, y);
        }
        else if(y <= root.data){
            printRange(root.left, x, y);
        }
        else{ // x > root
            printRange(root.right, x, y);

        }
    }
    public static void main(String[] args) {
        int val[]={8,5,1,3,9,4,6,2,7,10};
        Node root=null;
        for(int i=0;i<val.length;i++){
            root=insert(root,val[i]);
        }
        inorder(root);
        System.out.println();

        printRange(root, 6, 10);
       
    }
    
}

