package java_basic;

import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> customer = new HashMap<>();
        customer.put(1, "Nadim");
        customer.put(2, "Bin");
        customer.put(3, "Hossain");
        //System.out.println(customer);
        System.out.println(customer.get(1));

    }
}
