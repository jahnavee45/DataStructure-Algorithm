package LinkedList;

import java.util.Scanner;

class Node{
    int data; 
    Node next;

    Node(int new_data){
        this.data = new_data;
        this.next = null;
    }
}

public class insertInBeginning {

    static Node insertNewElement(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

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
        head.next.next.next.next = new Node(6);

        System.out.print("Before insertion: ");
        printList(head);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to insert in beginning of linked list:");
        int data = sc.nextInt();
        head = insertNewElement(head, data);
        System.out.print("\nAfter insertion: ");
        printList(head);
        sc.close();
    }
}
