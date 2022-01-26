package com.ushwamala.interview.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class WorkingWithLinkedLists {
    public static void main(String[] args) {
        //LinkedList is a doubly-linked list implementation of the List and Deque interfaces.
        //t implements all optional list operations and permits all elements (including null).

        //It is not synchronized -> fast but not thread safe
        //synchronized version  -> Collections.synchronizedList(new LinkedList());
        //It maintains insertion order
        //Every element is a node, which keeps a reference to the next and previous ones

        List<String> synchronizedLinkedList =
                Collections.synchronizedList(new LinkedList<>());


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(23);
        System.out.println(linkedList);
       // linkedList.add(123, 1);
        //System.out.println(linkedList);
        linkedList.addFirst(34);
        System.out.println(linkedList);
        linkedList.addLast(20);
        System.out.println(linkedList);
        linkedList.addAll(List.of(23, 56, 23, 56, 367, 12345, 235432));
        System.out.println(linkedList);

        //poll() poll returns null on empty list
        linkedList.poll();
        System.out.println("AFTER POLLING");
        System.out.println(linkedList);

        //pop() will throw NoSuchElementException() on empty list
        linkedList.pop();
        System.out.println("AFTER POPPING");
        System.out.println(linkedList);

        //inserts the element as the head of the collection
        linkedList.push(234456796);
        System.out.println("AFTER PUSHING");
        System.out.println(linkedList);


        final Integer peek = linkedList.peek();
        System.out.println("This is the peek: " + peek);
        System.out.println(linkedList);




    }







}


