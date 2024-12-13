package Trees;

public class inOrder {

    public static void inOrderTraversal(Node root){
        if(root==null){
return;
        }


        inOrderTraversal(root.left);
        System.out.print(root.data);
        inOrderTraversal(root.right);


    }




    public static void main(String[] args){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        inOrderTraversal(root);


    }
    
}
