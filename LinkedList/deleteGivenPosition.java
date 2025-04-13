package LinkedList;

public class DeleteGivenPosition {

    static Node deleteNode(Node head, int pos){
        Node temp = head;
        Node prev = null;
        if(temp == null){
            return head;
        }

        if(pos == 1){
            head = temp.next;
            return head;
        }

        for(int i = 1; i < pos && temp != null; i++){
            prev = temp;
            temp = temp.next;
        }

        if(temp != null){
            prev.next = temp.next;
        }
        else{
            System.out.print("\n Position not found");
        }
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
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(10);

        System.out.print("Before deletion: ");
        printList(head);

        int pos = 2;
        head = deleteNode(head, pos);
        System.out.print("\nAfter Deletion: ");
        printList(head);

    }
    
}
