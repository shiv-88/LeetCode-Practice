package LinkedLists;

public class deleteDup {

    public Node deleteDuplicate(Node head) {

        if (head == null) {
            return null;
        }

        Node bot = new Node(-1);
        //Node current = head;
        bot.next = head;
        Node current = bot;

        while (current.next != null && current.next.next != null) {

            if (current.next.data == current.next.next.data) {
                int duplicate = current.next.data;
               while (current.next != null && current.next.data == duplicate){
                   current.next = current.next.next;
               }
            } else {
                current = current.next;
            }


        }

        return bot.next;

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node (1);
        head.next.next = new Node (1);
        head.next.next.next = new Node (1);
        head.next.next.next.next = new Node (2);

        deleteDup d = new deleteDup();
        Node result = d.deleteDuplicate(head);
        while (result != null){
            System.out.print(result.data+" ");
            result = result.next;
        }



    }
}
