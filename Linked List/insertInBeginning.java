class Node{
    int data; 
    Node next;

    Node(int new_data){
        data = new_data;
        next = null;
    }
}

public class insertInBeginning {

    static Node insertNode(Node head, int data){
        Node new_node = new Node(data);
        new_node.next = head;
        return new_node;
    }

    static void printNode(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        System.out.print("Before node insertion: ");
        printNode(head);

        System.out.print("\nAfter node insertion: ");
        int data = 1;
        head = insertNode(head, data);
        printNode(head);
    }
}
