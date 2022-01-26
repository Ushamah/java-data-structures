package com.ushwamala;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> immutableList = List.of("test");

        List<String> colors = new ArrayList<>(List.of("red", "yellow"));
        colors.add("blue");

        System.out.println(colors.size());
        colors.forEach(System.out::println);
        System.out.println(colors.indexOf("red"));
        System.out.println(colors.contains("purple"));

    }
}
