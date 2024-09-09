class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class swapNodes {

    static void printList(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(10);

        System.out.print("Before swapping: ");
        printList(head);
        int x = 4, y = 8;

    }
    
}
