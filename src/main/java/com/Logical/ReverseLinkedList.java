package com.Logical;

import java.util.LinkedList;

/**
 * Created by yubraj on 7/12/16.
 */
public class ReverseLinkedList {

    static Node head;

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data ;
        }
    }

    public static Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null){
            next = current.next;
            System.out.println("Next : " + next);
            current.next = prev;
            System.out.println("Current Next : " + current.next);
            prev = current;
            System.out.println("Prevous : "+ prev);
            current = next;
            System.out.println("Current : "+ current);
        }

        node = prev;
        return node;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        System.out.println("Original Linked list is :");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list : ");
        list.printList(head);
    }

}
