package com.company.DSA__JAVA;

public class LL {

    private int data;
    private Node head;
    private Node tail;
    int size;

    public LL(){
        this.size = 0;
    }

    public void insertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void insertAtEnd(int value){
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtBtw(int value, int index){

        if (index == 0){
            insertAtFirst(value);
            return;
        }
        if (index == size){
            insertAtEnd(value);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteAtFirst(){
        int value = head.value;
        head = head.next;

        if (head == null){
            tail = null;
        }
        size--;
        return value;
    }

    public int deleteAtLast(){
        if (size <= 1){
            return deleteAtFirst();
        }

        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int value = tail.value;
        tail = temp;
        tail.next = null;
        size--;
        return value;
    }

    public int deleteAtBtw(int index){
        if (index == 0){
            return deleteAtFirst();
        }

        if (index == size - 1){
            return deleteAtLast();
        }

        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        int value = node.next.value;
        node.next = node.next.next;
        return value;
    }

    public void displayList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
