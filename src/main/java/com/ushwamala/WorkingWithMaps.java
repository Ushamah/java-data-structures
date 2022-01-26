package com.ushwamala;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps {
    public static void main(String[] args) {
       /* Map<Integer, Person> map = getIntegerPersonMap();
        System.out.println(map.values());*/

        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Ush"), new Diamond("diamond"));

        System.out.println(map.get(new Person("Ush")));

    }

    private static Map<Integer, Person> getIntegerPersonMap() {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Ush"));
        map.put(2, new Person("Mariam"));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsKey(5));
        System.out.println(map.get(2));
        System.out.println(map.entrySet());

        map.entrySet().forEach(i -> System.out.println(i.getKey() + " " + i.getValue().name));
        map.remove(2);
        map.forEach((key, value) -> System.out.println(key + " " + value.name));
        return map;
    }


    record Person(String name) { }
    static class Diamond {
        String name;

        public Diamond(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Diamond diamond = (Diamond) o;
            return Objects.equals(name, diamond.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Diamond{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}

