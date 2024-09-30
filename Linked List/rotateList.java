class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class rotateList {

    static Node rotateOperation(Node head, int k){

        if(k == 0 || head == null){
            return head;
        }

        for(int i = 0; i < k; ++i){
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }

            curr.next = head;
            curr = curr.next;
            head = head.next;
            curr.next = null;
        }
        return head;
    }

    static void printList(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(20);
        head.next = new Node(30);
        head.next.next = new Node(40);
        head.next.next.next = new Node(50);

        System.out.print("Before rotating the list: ");
        printList(head);

        int k = 1;
        System.out.print("\nAfter rotating the list: ");
        rotateOperation(head, k);
        printList(head);

    }
}
