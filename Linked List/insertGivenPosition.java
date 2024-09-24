class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class insertGivenPosition {

    static Node insertNode(Node head, int pos, int data){
        Node newNode = new Node(data);
        Node check = head;

        int count = 0;
        while(check != null){
            check = check.next;
            count++;
        }

        if(pos > count){
            System.out.print("\nGiven position exceeds the length of list, so insertion not possible");
            return head;
        }

        if(pos == 0){
            newNode.next = head;
            return newNode;
        }

        Node curr = head;

        for(int i = 0; i < pos-1; i++){
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    static void printNodes(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(6);

        System.out.print("Before node insertion: ");
        printNodes(head);

        int key = 6, data = 4;
        head = insertNode(head, key, data);
        System.out.print("\nAfter node insertion: ");
        printNodes(head);

    }
}

