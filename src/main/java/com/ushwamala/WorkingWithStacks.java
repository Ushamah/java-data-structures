package com.ushwamala;

import java.util.Stack;
//LIFO
public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Last");


        System.out.println("THE STACK TOP");
        System.out.println(stack.peek());
        System.out.println("SIZE");
        System.out.println(stack.size());

        System.out.println("Removes the top item from the stack");
        stack.pop();
        System.out.println("THE STACK TOP");
        System.out.println(stack.peek());
        System.out.println("SIZE");
        System.out.println(stack.size());
        stack.pop();
        System.out.println("THE STACK TOP");
        System.out.println(stack.peek());
        System.out.println("SIZE");
        System.out.println(stack.size());
    }
}
