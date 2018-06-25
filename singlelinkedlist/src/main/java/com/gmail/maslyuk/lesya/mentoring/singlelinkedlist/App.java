package com.gmail.maslyuk.lesya.mentoring.singlelinkedlist;

import com.gmail.maslyuk.lesya.mentoring.singlelinkedlist.MyBinaryTree.OneNode;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

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
        System.out.println("");
        System.out.println("");

        //MyBinaryTree

        MyBinaryTree<Integer, String> myBinaryTree = new MyBinaryTree<Integer, String>();
        myBinaryTree.addNode(10, "Ten");
        myBinaryTree.addNode(5, "Five");
        myBinaryTree.addNode(35, "Thirty Five");
        myBinaryTree.addNode(20, "Twenty");
        myBinaryTree.addNode(1, "One");
        myBinaryTree.addNode(4, "Four");
        myBinaryTree.addNode(17, "Seventeen");
        myBinaryTree.addNode(99, "Ninety Nine");
        myBinaryTree.addNode(31, "Therty One");

        myBinaryTree.addNode(43, "This is a new element !!!");

        OneNode<Integer, String> foundNode = myBinaryTree.findNode(10);
        System.out.println(foundNode.toString());

        foundNode = myBinaryTree.findNode(5);
        System.out.println(foundNode.toString());

        foundNode = myBinaryTree.findNode(1);
        System.out.println(foundNode.toString());

        foundNode = myBinaryTree.findNode(35);
        System.out.println(foundNode.toString());

        foundNode = myBinaryTree.findNode(20);
        System.out.println(foundNode.toString());

        foundNode = myBinaryTree.findNode(99);
        System.out.println(foundNode.toString());
     
        /*
        Found node [key=10, value=Ten,  leftNode.key = 5 rightNode.key = 35 ]
        Found node [key=5, value=Five,  leftNode.key = 1 ]
        Found node [key=1, value=One,  rightNode.key = 4 ]
        Found node [key=35, value=Thirty Five,  leftNode.key = 20 rightNode.key = 99 ]
        Found node [key=20, value=Twenty,  leftNode.key = 17 rightNode.key = 31 ]
        Found node [key=99, value=Ninety Nine,  leftNode.key = 43 ]        
        */
    }
}
