class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class reverseList {

    static Node reverseOperationRecur(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node reverse = reverseOperationRecur(head.next);
        head.next.next = head;
        head.next = null;
        return reverse;
    }
    
    static Node reverseOperation(Node head){
        Node curr = head, prev = null;

        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
    
    static void printList(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next.next = new Node(8);        
        head.next.next.next.next = new Node(10);     
        
        System.out.print("Before reversing: ");
        printList(head);

        head = reverseOperation(head);
        System.out.print("\nAfter reversing using iterative method: ");
        printList(head);

        head = reverseOperationRecur(head);
        System.out.print("\nReversing back using recursive method: ");
        printList(head);
    }
}
