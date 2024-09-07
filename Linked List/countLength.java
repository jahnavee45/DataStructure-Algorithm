class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class countLength {

    static int totalLengthRecur(Node head){
        if(head == null){
            return 0;
        }

        return 1 + totalLengthRecur(head.next);
    }

    static int totalLength(Node head){
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }

    static void  printList(Node head){
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print("Printing list: ");
        printList(head);

        // iterative method to find length of list
        int count = totalLength(head);
        System.out.print("\n Total length of the list using iterative method: " + count);

        // recursive method to find length of list
        System.out.print("\n Total length of the list using recursion: " + totalLengthRecur(head));
    }
}
