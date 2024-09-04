class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class deleteLastNode {

    static void printList(Node head){
        Node curr = head;
        while(curr !=  null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(7);
        head.next.next.next = new Node(9);

        System.out.print("Before deletion: ");
        printList(head);
    }
    
}
