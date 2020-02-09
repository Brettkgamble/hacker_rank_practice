package LinkedList;

import java.util.LinkedList;

public class LinkedListUS {

    // Properties
    Node head;
    int count;

    // Constructors
//    public LinkedListUS() {
//        head = null;
//        count = 0;
//    }

    public LinkedListUS(Node newHead) {
        head = newHead;
        count = 1;
    }

    // Methods

    // add
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    // get
    public int get(int index) {
        if (index <= 0 ) {
            return -1;
        } else {
            Node current = head;
            for (int i =1; i < index; i++) {
                current = current.getNext();
            }
            return current.getData();
        }
    }

    // size
    public int size() {
        return count;
    }

    // isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    // remove
    public void remove() {
        // remove from the end of the list
        Node current = head;
        while (current.getNext().getNext() != null ) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }


    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("alice");
        System.out.println(linkedlist);
        linkedlist.add("Brett");
        System.out.println(linkedlist);
    }
}
