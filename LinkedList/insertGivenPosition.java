package LinkedList;

import java.util.Scanner;

public class InsertGivenPosition {

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(6);

        System.out.print("Before node insertion: ");
        printNodes(head);

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the position where data to be inserted in linked list:");
        int pos = sc.nextInt();
        System.out.println("Enter the data to insert in linked list:");
        int data = sc.nextInt();
        head = insertNode(head, pos, data);
        System.out.print("After node insertion: ");
        printNodes(head);

        sc.close();
    }

    private static Node insertNode(Node head, int pos, int data){
        Node newNode = new Node(data);
        Node check = head;

        int count = 0;
        while(check != null){
            check = check.next;
            count++;
        }

        if(pos > count){
            System.out.print("Given position exceeds the length of list, so insertion not possible");
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

    private static void printNodes(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

