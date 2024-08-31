class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}

public class insertNodeElementAnywhere {

    static Node insertElement(Node head, int data, int pos){
        Node newNode = new Node(data);

        if(pos == 1){
            newNode.next = head;
            head = newNode;

            return head;
        }

        Node curr = head;

        for(int i = 0; i < pos-1 && curr != null; i++){
            curr = curr.next;
        }

        if(curr == null){
            System.out.print("\nPosition is out of bound");
            return head;
        }

        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }
    static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {

        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(8);
        head.next.next.next = new Node(10);

        System.out.print("Before insertion: ");
        printList(head);

        int data = 6, pos = 1;
        head = insertElement(head, data, pos);
        System.out.print("\nAfter insertion: ");
        printList(head);
        
    }
}
