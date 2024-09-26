class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class nthNodeFromEnd {

    static int findNode(Node head, int n){
        Node curr = head;
        Node ptr = head;

        for(int i = 0; i < n; i++){
            ptr = ptr.next;
        }

        if(ptr == null){
            return -1;
        }

        while(ptr.next != null){
            ptr = ptr.next;
            curr= curr.next;
        }

        return curr.data;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int res = findNode(head, 3);
        System.out.println("The nth node from the end is " + res);
    }
    
}
