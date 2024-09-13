class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class mergeSortedList {

    static void printList(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        
        // creating first sorted list
        Node one = new Node(2);
        one.next = new Node(4);
        one.next.next = new Node(6);

        // creating second sorted list
        Node two = new Node(1);
        two.next = new Node(3);
        two.next.next = new Node(5);

        System.out.println("Before merge operation:");
        System.out.print("First sorted list: ");
        printList(one);

        System.out.print("\nSecond sorted list: ");
        printList(two);
    }
}
