package com.labs;

/**
 * Hello world!
 *
 */
public class App {
	
    public static void main( String[] args ){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("hello 0");
        myLinkedList.add("world 1");
        myLinkedList.add("Lesya 2");
        myLinkedList.add("Lesya 3");
        myLinkedList.add("Lesya 4");
        myLinkedList.add("Lesya 5");
        
        myLinkedList.printList();
        
        System.out.println("");
        System.out.println(myLinkedList.getNumber(2));
        System.out.println("");
        
        myLinkedList.remove(4);
        myLinkedList.printList();
    }
}
