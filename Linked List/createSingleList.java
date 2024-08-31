class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Linkedlist{
    Node head;

    public void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        } else{
            Node curr = head;

            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void printListNodes(){
        Node curr = head;

        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

public class createSingleList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.print("Display the single linked list: ");
        list.printListNodes();
    }
    
}
