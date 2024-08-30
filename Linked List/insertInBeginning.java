class Node{
    int data; 
    Node next;

    Node(int new_data){
        this.data = new_data;
        this.next = null;
    }
}

public class insertInBeginning {

    static void printList(Node head){
        Node curr = head;

        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node head  = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        System.out.print("Before insertion: ");
        printList(head);
    }
}
