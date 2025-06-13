package DSA.BST;

public class SearchKey {
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
    //O(H)
    public static boolean search(Node root,int key){
        if(root == null){
            return false;
        }
        else if(key < root.data){
            return search(root.left, key);
        }
        else if(key > root.data){
            return search(root.right, key);
        }
        else // root.data == key
            return true;
    }
        
    public static void main(String[] args) {
        int val[]={5,1,3,4,6,2,7};
        Node root=null;
        for(int i=0;i<val.length;i++){
            root=insert(root,val[i]);
        }
        if(search(root, 1)){
        System.out.println("Found");
        }
        else{
        System.out.println("Not Found");
        }
        
    }
}

 