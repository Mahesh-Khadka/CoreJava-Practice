package Phase2_CollectionsAndGenerics;

import java.util.LinkedHashMap;

public class LinkedHashMapExample2 {
    public static void main(String[] args){
        LinkedHashMap<String, Integer> fruits = new LinkedHashMap<>();

        fruits.put("Apple", 10);
        fruits.put("Banana", 2);
        fruits.put("cherry", 10);

        System.out.println(fruits);
    }
}
