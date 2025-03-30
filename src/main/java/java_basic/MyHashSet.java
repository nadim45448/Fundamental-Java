package java_basic;

import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet<String> fruits= new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Litchi");
        fruits.add("Orange");

        System.out.println(fruits);
        System.out.println(fruits.size());

        fruits.add("Litchi");
        System.out.println(fruits);
        System.out.println(fruits.size());

        fruits.add("Guava");
        System.out.println(fruits);
        System.out.println(fruits.size());



    }
}
