class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class deleteHeadNode {

    static Node deletehead(Node head){
        if (head == null){
            return null;
        }

        head = head.next;

        return head;
    }
    static void printList(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print("Before deletion of head node: ");
        printList(head);

        head = deletehead(head);
        System.out.print("\n After deletion of head node: ");
        printList(head);
    }
    
}
