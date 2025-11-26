package com.practice.LinkedList;

public class Node {

    private int data;
    Node nextRef;

    public Node(int data) {
        super();
        this.data = data;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.nextRef = new Node(20);
        head.nextRef.nextRef = new Node(30);
        traverseLinkedList(reverseList(head));

    }

    public static void traverseLinkedList(Node node) {
        Node current = node;
        while (current != null) {
            System.out.println(current.data + " " + current.nextRef);
            current = current.nextRef;
        }
    }

    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            System.out.println("Initial Current : " + current.data + " Initial next : " + current.nextRef + "current " +
                    ": " + current);
            next = current.nextRef;
            System.out.println("Next : " + next);
            current.nextRef = prev;
            System.out.println("Current : " + current.nextRef);
            prev = current;
            System.out.println("Prev : " + prev);
            current = next;
            System.out.println("Updated Current : " + current);
        }
        //   System.out.println("Reversed Linked List : " + current);
        return prev;
    }
}

