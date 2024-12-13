package LinkedLists;

public class ReverseLL {

    public static Node reverse(Node head, int k){

        Node prev = null;
        Node curr = head;
        Node next = null;


        //if head == null return null
        // if head.next == null return head


        int count = 0;
        while (curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count ++;
        }
        head.next = curr;
        return prev;
    }

    public static void printList(Node head){

        while (head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }


    public static void main(String[] args){

        Node head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = new Node(4);

       /*
        printList(head);
        reverse(null);
        printList(head);
        */

        printList(head);

        int k = 2;
        head = reverse(head,k);

        printList(head);
    }

}
