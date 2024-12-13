package Trees;

public class findedges {

    public static int findEdges(Node root){

        if (root == null){return -1;}

        else{

            int leftEdge = findEdges(root.left);
            int rightEdge = findEdges(root.right);
            return Math.max(leftEdge, rightEdge) + 1;
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

        int edge = findEdges(root);
        System.out.println(edge);

    }
}
