package com.company.DSA__JAVA;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.displayList();
        list.insertAtEnd(0);
        list.displayList();
        list.insertAtBtw(23,2);
        list.displayList();
        System.out.println(list.deleteAtFirst());
        list.displayList();
        System.out.println(list.deleteAtLast());
        list.displayList();
        System.out.println(list.deleteAtBtw(2));
        list.displayList();
    }
}
