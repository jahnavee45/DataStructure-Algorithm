class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class insertGivenPosition {

    static Node insertNode(Node head, int pos, int data){
        Node newNode = new Node(data);

        if(pos == 0){
            newNode.next = head;
            return newNode;
        }

        Node curr = head;

        for(int i = 0; i < pos-1; i++){
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;
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

