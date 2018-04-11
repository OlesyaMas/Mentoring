package com.labs;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("hello");
        myLinkedList.add("world");
        myLinkedList.add("Lesya");

        myLinkedList.printList();
        System.out.println(myLinkedList.getNumber(2));
       // myLinkedList.remove(1);

    }
}
