package LinkedList;

import java.util.HashSet;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class removeDuplicateNodes {

    static Node findAndRemove(Node head){
        HashSet<Integer> set = new HashSet<>();

        Node curr = head;
        Node prev = null;

        while(curr != null){
            if(set.contains(curr.data)){
                prev.next = curr.next;
                curr = curr.next;
            }else{
                set.add(curr.data);
                prev = curr;
                curr = curr.next;
            }
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
        Node head = new Node(2);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next = new Node(5);

        System.out.print("Before removing duplicates: ");
        printList(head);
        findAndRemove(head);

        System.out.print("\nAfter removing duplicates: ");
        printList(head);

    }
}
