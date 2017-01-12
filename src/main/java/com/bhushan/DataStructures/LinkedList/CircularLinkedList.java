package com.bhushan.DataStructures.LinkedList;

/**
 * Created by bhushan on 12/22/16.
 */
public class CircularLinkedList {
    Node head;

    public void insert(Node node) {
        if (head == null) {
            head=node;
        } else {
            Node currentNode = head;
            while(currentNode.getNext() != head) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(node);
        }
        node.setNext(head);
    }

    public void createCircularLinkedList() {
        insert(new Node(1));
        insert(new Node(2));
        insert(new Node(3));
    }

    public void getLengthandDisplay() {
        int count = 0;
        Node currentNode = head;
        while (currentNode.getNext() != head) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
            count++;
        }
        System.out.println(currentNode.getData());
        System.out.printf("Length is %d", count+1);
    }

    public static void main(String[] args) {
        CircularLinkedList c1 = new CircularLinkedList();
        c1.createCircularLinkedList();
        c1.getLengthandDisplay();

    }
}
