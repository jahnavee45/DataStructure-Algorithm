package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}

public class insertAtEndNode {

    static Node insertNewElement(Node head, int data){
        Node newNode = new Node(data);

        if(head == null){
            return newNode;
        }

        Node end = head;
        while(end.next != null){
            end = end.next;
        }

        end.next = newNode;
        return head;
    }

    static void printList(Node head){
        Node curr = head;

        while(curr!= null){
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

        int data = 12;
        head = insertNewElement(head, data);
        System.out.print("\nAfter insertion: ");
        printList(head);
        
    }
}
