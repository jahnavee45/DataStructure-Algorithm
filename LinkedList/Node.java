public class Node{
    int data; 
    Node next;

    Node(int new_data){
        data = new_data;
        next = null;
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        System.out.print("Traverse an list: ");
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

