class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class insertGivenPosition {

    static Node insertNode(Node head, int key, int data){
        Node curr = head;

        while(curr != null){
            if(curr.data == key){
                break;
            }
            curr = curr.next;
        }

        if(curr == null){
            return head;
        }

        Node new_node = new Node(data);
        new_node.next = curr.next;
        curr.next = new_node;
        return head;
    }

    static void printNodes(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(6);

        System.out.print("Before node insertion: ");
        printNodes(head);

        System.out.print("\nAfter node insertion: ");
        int key = 3, data = 4;
        head = insertNode(head, key, data);
        printNodes(head);

    }
}
