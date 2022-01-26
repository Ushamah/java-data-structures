package com.ushwamala.interview.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class WorkingWithIterators {
    public static void main(String[] args) {
        /*List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 3, 4, 5, 6));
        Iterator<Integer> numsIterator = nums.iterator();
        while(numsIterator.hasNext()) {
            var next = numsIterator.next();
            System.out.println(next);
            if(next <=3){
                numsIterator.remove();
            }
        }*/

        List<String> items = new ArrayList<>(List.of("Car", "Boat","REPLACE ME", "House"));
        ListIterator<String> listIterator = items.listIterator();
        while(listIterator.hasNext()) {
            String nextWithIndex = items.get(listIterator.nextIndex());
            String next = listIterator.next();
            if("REPLACE ME".equals(next)) {
                listIterator.set("REPLACED");
            }
        }
        listIterator.add("NEW");
        while(listIterator.hasPrevious()) {
            String previousWithIndex
                    = items.get(listIterator.previousIndex());
            String previous = listIterator.previous();
            System.out.println(previous);
        }
    }
}
