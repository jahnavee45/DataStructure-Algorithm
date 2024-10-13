package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

// deleting the last given node
public class deleteLastNode {

    static Node deleteEndNode(Node head){

        if(head == null){
            return null;
        }

        if(head.next == null){
            return null;
        }

        Node last = head;
        while(last.next.next != null){
            last = last.next;
        }

        last.next = null;
        return head;
    }

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

        deleteEndNode(head);
        System.out.print("\nAfter deletion: ");
        printList(head);
    }
    
}
