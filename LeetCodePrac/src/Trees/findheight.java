package Trees;

public class findheight {

    public static int findHeight(Node root){

        if (root == null){return 0;}

        else{

            int leftHeight = findHeight(root.left);
            int rightHeight = findHeight(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }


    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left= new Node(4);
        root.left.left.left = new Node(21);
        root.left.left.left.right = new Node(22);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node (7);

        int height = findHeight(root);
        System.out.println(height);

    }

}
