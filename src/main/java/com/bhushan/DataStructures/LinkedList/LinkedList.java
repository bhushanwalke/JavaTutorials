package com.bhushan.DataStructures.LinkedList;

/**
 * Created by bhushan on 12/22/16.
 */
public class LinkedList {
    Node head;

    public void insertAtBegin(Node node) {
        node.setNext(head);
        head = node;
    }

    public void insertAtEnd(Node node) {
        Node currentNode = head;
        while(currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(node);
    }

    public void inserAtGivenPosition(Node node, int position) {
        Node currentNode = head;
        if (position <= 0) {
            insertAtBegin(node);
        }

        for (int i=0; i<position-1; i++) {
            currentNode = currentNode.getNext();
        }
        node.setNext(currentNode.getNext());
        currentNode.setNext(node);
    }

    public void deleteFromPosition(int position) {
        Node currentNode = head;

        for(int i=0; i<position-1; i++) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(currentNode.getNext().getNext());
    }

    public void createLinkedList() {
        insertAtBegin(new Node(1));
        insertAtEnd(new Node(2));
//        insertAtEnd(new Node(3));
//        insertAtEnd(new Node(4));
//        inserAtGivenPosition(new Node(4), 1);
//        deleteFromPosition(2);
    }

    public void display() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }

    public Node getNodeAtPositionfromBack(int pos) {
        Node forward = head;
        Node back = head;
        int count = 1;
        while (count < pos) {
            forward = forward.getNext();
            count ++;
        }
        while (forward.getNext() !=null) {
            forward = forward.getNext();
            back = back.getNext();
        }

        return back;
    }

    public void deleteNodeAtGivenPostition(int pos) {
        Node nodeToDelete = getNodeAtPositionfromBack(pos+1);
        nodeToDelete.setNext(nodeToDelete.getNext().getNext());
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.createLinkedList();
        l1.display();
        System.out.println("\n");
//        System.out.println(l1.getNodeAtPosition(2).getData());
        l1.deleteNodeAtGivenPostition(2);
        l1.display();
    }
}
