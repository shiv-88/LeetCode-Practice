package LinkedLists;


class Node{

    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    }

}






public class insertMiddle {

    //Node Class


    public void insertNode(int k, int data, Node head){

        Node n = new Node(data);


        Node temp = head;
        int count = 0;

        while (count < k-1){
            temp = temp.next;
            count++;
        }
        n.next = temp.next;
        temp.next = n;

    }

    public static void main(String[] args){
        //ADD AND MAKE NODES
    }



}
