package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedList {

    static Node mergeList(Node one, Node two){

        ArrayList<Integer> list = new ArrayList<>();

        while(one != null){
            list.add(one.data);
            one = one.next;
        }

        while(two != null){
            list.add(two.data);
            two = two.next;
        }

        Collections.sort(list);

        Node merge = new Node(-1);
        Node head = merge;
        for(int val : list){
            merge.next = new Node(val);
            merge = merge.next;
        }

        head = head.next;
        return head;
    }

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

        Node res = mergeList(one, two);
        System.out.print("\nAfter merge sort operation: ");
        printList(res);
    }
}
