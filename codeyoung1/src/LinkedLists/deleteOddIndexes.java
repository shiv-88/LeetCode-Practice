package LinkedLists;

public class deleteOddIndexes {

    public static Node deleteOddIndexes(Node head){

        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;
        Node curr = head;
        int index = 1;

        while (curr != null){
            if (curr.data % 2==1 ) {
                prev.next = curr.next;
            }else{
                prev = curr;
            }

            curr = curr.next;
            index++;

        }
        return dummy.next;
    }

    public static void main(String[] args) {

        Node head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next= new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(4);

        Node newHead = deleteOddIndexes(head);

        while (newHead != null){
            System.out.print(newHead.data + " ");
            newHead = newHead.next;
        }

    }
}
