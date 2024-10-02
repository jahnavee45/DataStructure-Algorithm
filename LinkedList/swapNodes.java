package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class swapNodes {

    static Node swapOperation(Node head, int x, int y){

        if(x == y){
            return head;
        }

        Node currx = head, prevx = null;
        while(currx != null && currx.data != x){
            prevx = currx;
            currx = currx.next;
        }

        Node curry = head, prevy = null;
        while(curry != null && curry.data != y){
            prevy = curry;
            curry = curry.next;
        }

        if(currx == null || curry == null){
            return head;
        }

        if(prevx != null){
            prevx.next = curry;
        }else{
            head = curry;
        }

        if(prevy != null){
            prevy.next = currx;
        }else{
            head = currx;
        }

        Node temp = currx.next;
        currx.next = curry.next;
        curry.next = temp;
        
        return head;
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

        System.out.print("Before swapping: ");
        printList(head);

        int x = 4, y = 2;
        head = swapOperation(head, x, y);
        System.out.print("\nAfter swapping: ");
        printList(head);
    }
    
}
