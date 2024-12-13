package Trees;

public class postOrder {

    public static void postOrderTraversal(Node root){

        if (root == null){return;}

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data);


    }

    public static void main(String[] args){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        postOrderTraversal(root);


    }


}
