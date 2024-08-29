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
        Node new_node = new Node(data);
        if(pos == 1){
            new_node.next = head;
            head = new_node;
            return head; 
        }

        Node curr = head;
        for(int i = 0; i < pos-1 && curr != null; i++){
            curr = curr.next;
        }

        if(curr == null){
            System.out.println("Position out of bound");
            return head;
        }

        new_node.next = curr.next;
        curr.next = new_node; 

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

        int data = 2, pos = 4;
        head = insertElement(head, data, pos);
        System.out.print("\nAfter insertion: ");
        printList(head);
        
    }
}
