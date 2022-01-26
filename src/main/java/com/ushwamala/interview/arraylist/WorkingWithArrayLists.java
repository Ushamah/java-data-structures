package com.ushwamala.interview.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.LongStream;

import static java.util.stream.Collectors.toCollection;

public class WorkingWithArrayLists {
    public static void main(String[] args) {
       /* List<String> emptyArrayList = new ArrayList<>();
        List<String> arrayListWithInitialCapacity = new ArrayList<>(20);

        // Constructor Accepting Collection
        Collection<Integer> numbers = IntStream.range(0, 10).boxed().collect(toSet());
        List<Integer> numbersArrayList = new ArrayList<>(numbers);*/

        //Search with arrayList
        List<String> list = LongStream.range(0, 11)
                .boxed()
                .map(Long::toHexString)
                .collect(toCollection(ArrayList::new));
        for (String s : list) {
            System.out.println(s);
        }
        List<String> stringsToSearch = new ArrayList<>(list);
        stringsToSearch.addAll(list);

        //Searching an unsorted List
        Set<String> matchingStrings = new HashSet<>(Arrays.asList("1", "b", "d"));

        List<String> result = stringsToSearch
                .stream()
                .filter(matchingStrings::contains)
                .collect(toCollection(ArrayList::new));

        // System.out.println(result.size());


        //using an iterator
        Iterator<String> it = stringsToSearch.iterator();
        List<String> result2 = new ArrayList<>();
        while (it.hasNext()) {
            String s = it.next();
            if (matchingStrings.contains(s)) {
                result2.add(s);
            }
        }

        //Sort a list
        final ArrayList<String> copy = new ArrayList<>(stringsToSearch);
        Collections.sort(copy);
        int index = Collections.binarySearch(copy, "f");
        for (String c : copy) {
            if(index != -1) {
                System.out.println(c+ " EXISTS");
            }

        }

    }

}
