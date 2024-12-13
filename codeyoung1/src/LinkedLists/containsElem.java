package LinkedLists;

public class containsElem {






    public static int containsElement(Node A, int B){

        while(A!=null){
            if (A.data == B){
                return 1;
            }
            A=A.next;
        }
        return 0;
    }

    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);


        int B = 3;
        int result = containsElement(head, B);

        System.out.println(result);

    }

}
