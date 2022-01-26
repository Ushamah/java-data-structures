package com.ushwamala;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {

        //queues();

        LinkedList<Person> personLinkedList = new LinkedList<>();
        personLinkedList.add(new Person("Refia", 26));
        personLinkedList.add(new Person("Mariam", 26));
        personLinkedList.addLast(new Person("Ali",12));
        personLinkedList.addFirst(new Person("Fatima",43));

        final ListIterator<Person> personListIterator = personLinkedList.listIterator();
        System.out.println("Printing in normal order");
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next().name);
        }
        System.out.println();
        System.out.println("Printing in reversed order");
        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous().name);
        }

    }

    private static void queues() {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Refia", 26));
        supermarket.add(new Person("Mariam", 30));
        supermarket.add(new Person("Isham", 23));

        System.out.println("The last person in the queue: " + supermarket.peek());
        System.out.println("Removes the first person in the queue: " + supermarket.poll());

        System.out.println(supermarket.peek());
        System.out.println("Removes the first person in the queue: " + supermarket.poll());
        System.out.println(supermarket.peek());
    }


    static record Person(String name, int age) {}
}
